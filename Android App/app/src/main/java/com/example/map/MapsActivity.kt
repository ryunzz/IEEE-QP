package com.example.map

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.app.ActivityCompat
import com.example.map.databinding.ActivityMapsBinding
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var devices: TextView
    private lateinit var PowerTag:TextView
    private lateinit var powerTagButton: Button
    private lateinit var buttonCurr:Button
    private lateinit var settingsBtn:Button;
    private lateinit var backGround1: ConstraintLayout
    var dark:Boolean = false;

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding
    private var fusedLocationClient: FusedLocationProviderClient? = null

    private lateinit var powerTagLocation: LatLng

    val PERMISSION_REQUEST_LOCATION: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        devices = findViewById(R.id.textView)
        powerTagButton = findViewById(R.id.power_tag_location)

        PowerTag = findViewById(R.id.textView1)
        buttonCurr = findViewById(R.id.buttonCurr)
        settingsBtn = findViewById(R.id.settingsBtn)
        backGround1 = findViewById(R.id.main)

        //TODO Change later based on api call, currently based on Sydney
        powerTagLocation = LatLng(-34.0, 151.0)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        /**
         * On power tag button click, reset map to power tag
         */
        powerTagButton.setOnClickListener {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(powerTagLocation))
        }

        /**
         * On current location button click, reset map to current location
         */
        buttonCurr.setOnClickListener {
            getCurrentLocation()
        }

        settingsBtn.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            intent.putExtra("Dark", dark)
            startActivity(intent)
        }

        val intent1 = intent
        val bool1 = intent.getBooleanExtra("DarkMode", false)
        if (bool1) {
            backGround1.setBackgroundColor(Color.DKGRAY)
            devices.setTextColor(Color.WHITE)
            PowerTag.setTextColor(Color.WHITE)
            dark = true;

        }
        else {
            backGround1.setBackgroundColor(Color.WHITE)
            devices.setTextColor(Color.BLACK)
            PowerTag.setTextColor(Color.BLACK)
            dark = false;
        }


    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(-34.0, 151.0)
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))

        requestLocationPermission()
    }

    // Request location permission
    private fun requestLocationPermission() {
        val permissions = arrayOf(
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION
        )
        ActivityCompat.requestPermissions(this, permissions, PERMISSION_REQUEST_LOCATION)
    }

    // Handle permission request result
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == PERMISSION_REQUEST_LOCATION) {
            if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted, proceed to get the current location
                getCurrentLocation()
            } else {
                // Permission denied, handle accordingly
            }
        }
    }

    // Get the current location
    private fun getCurrentLocation() {
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)

        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return
        }
        fusedLocationClient!!.lastLocation
            .addOnSuccessListener(
                this
            ) { location ->
                if (location != null) {
                    val latitude = location.latitude
                    val longitude = location.longitude

                    // Use the latitude and longitude values
                    // You can update the map or perform any desired actions with the location data

                    val currLocation = LatLng(latitude, longitude)
                    mMap.addMarker(MarkerOptions().position(currLocation).title("Current Location"))
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(currLocation))
                } else {
                    // Location data is unavailable, handle accordingly
                }
            }
            .addOnFailureListener(this) {
                // Failed to get location, handle accordingly
            }
    }

}