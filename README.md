This is a project that is currently in development. If you're interested in following along, we will be documenting our process on https://www.youtube.com/@ryun-zz !

---

# Hello we are, IEEE QP Fall 2024 Team 1!
Ryan Ni, Ryan Estanislao, Bryan Fu, Josue Galindo, Arturo Zazueta, Phillip Mai, May Hong

# Introduction
Our project, "Power Tag" aims to create a versatile, chargeable power bank for mobile devices equipped with a solar panel for sustainable charging (will also have a USB Type C connector to charge the power bank faster) and a GPS tracking feature via GSM communication. Users can monitor the location of their device & luggage through a mobile app we developed for this project, utilizing various API calls from and to Google Maps API & Blynk API. We decided to go through with the GSM communication route as it allows for connecting to the internet without the need for a physical Wi-Fi router/connection (WiFi is not garunteed to the device if it's lost). This innovation is designed to enhance portability, provide off-grid power solutions, and offer security for tracked items

# What it does
Power Tag uses GSM communication to send GPS coordinates through a SIM 800L GSM module to connect to the internet without needing a Wifi connection accessable via our mobile app we developed allowing for a broader range of security. Power Tag has 2 ways to charge its power bank feature; Solar Panels and USB Type C connector. This Power bank allows for 20W of fast charging for mobile devices.

# How we built it
We programmed the Arduino UNO to send the GPS coordinates from the SIM 800L GSM module to our mobile application via Blynk API and display the location of the users' Power Tag on an embedded map via Google Maps API. Designed and soldered hardware components together to complete a circuit to allow for Power Tag's charging feature.

# Challenges we ran into
(will fill in as problems arise)

# Accomplishments that we're proud of
(will fill in after project is done)

# What's next for Power Tag
(will fill in once we discuss more features)

# Overview
Here are some quick links to some of the resources we developed while creating our project:

⚒️ • [CAD Prototype](https://cad.onshape.com/documents/414c4d8f43532bc1522ffbfb/w/5fb8d6774189fcfafbb3d3dd/e/008da2b45a0e4b36c7adde66?renderMode=0&uiState=671de227b8d1f63fc293a736) (WIP)

📐 • Figma? (coming soon) We'll see LOL

📢 • Pitchdeck (coming soon) Will be created closer to dead line

📕 • Documentation (coming soon) Ryan Ni's working on it ;-;

# Materials
If you're interested in what materials we used to build Power Tag, here's a list of resources from where we purchased our parts!

- [Arduino UNO](https://www.amazon.com/Arduino-A000066-ARDUINO-UNO-R3/dp/B008GRTSV6/ref=asc_df_B008GRTSV6/?tag=hyprod-20&linkCode=df0&hvadid=693421862574&hvpos=&hvnetw=g&hvrand=6421810398727834100&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9189214&hvtargid=pla-457497319401&psc=1&mcid=8d4415853f19330eb6cb8c1e7f18a8ed)
- [SIM 800L GSM Module](https://www.amazon.com/HiLetgo-Smallest-Breakout-Quad-band-3-7-4-2V/dp/B01DLIJM2E)
- [SIM Card w/o provider (from 1NCE)](https://1nce.com/en-us/gps-tracking-sim-cards?utm_term=&utm_campaign=PMax+-+Product&utm_source=adwords&utm_medium=ppc&hsa_acc=4214171268&hsa_cam=21418043752&hsa_grp=&hsa_ad=&hsa_src=x&hsa_tgt=&hsa_kw=&hsa_mt=&hsa_net=adwords&hsa_ver=3&gad_source=2&gclid=EAIaIQobChMIhMLX7LCciQMVwirUAR3U4jDGEAEYASABEgKelPD_BwE)
- [18650 Charger Board Lithium Battery Charging Module](https://www.amazon.com/WSDMAVIS-MiniType-C-Overcharge-Overdischarge-Protection/dp/B08GPGRRTP/ref=asc_df_B08GPGRRTP/?tag=hyprod-20&linkCode=df0&hvadid=692875362841&hvpos=&hvnetw=g&hvrand=2024265779541155698&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9189214&hvtargid=pla-2281435177658&psc=1&mcid=65bdc7f41afc3b16a11e59f0068d873a&hvocijid=2024265779541155698-B08GPGRRTP-&hvexpln=73)
- [18650 Lithium ion battery 3.7V x2]()
- [Arduino Breadboard]()
- [Solar Panel]()
