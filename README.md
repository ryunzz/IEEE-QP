This project was awarded #1 Best Overall @ IEEE FA24.

---

# Hello we are, IEEE QP Fall 2024 Team 1!
Ryan Ni, Ryan Estanislao, Bryan Fu, Phillip Mai, Josue Galindo

# Introduction
Our project, "Power Tag" aims to create a versatile, chargeable power bank for mobile devices equipped with a GPS tracking feature via GSM communication. Users can monitor the location of their device & luggage through a mobile app we developed for this project, utilizing various API calls from and to Google Maps API & Blynk API. We decided to go through with the GSM communication route as it allows for connecting to the internet without the need for a physical Wi-Fi router/connection (WiFi is not garunteed to the device if it's lost)

# What it does
Power Tag uses GSM communication to send GPS coordinates through a SIM 800L GSM module to connect to the internet without needing a Wifi connection accessable via our mobile app we developed allowing for a broader range of security.This Power bank allows for 20W of fast charging for mobile devices.

# How we built it
We programmed the Arduino UNO to send the GPS coordinates from the SIM 800L GSM module to our mobile application via Blynk API and display the location of the users' Power Tag on an embedded map via Google Maps API. Designed and soldered hardware components together to complete a circuit to allow for Power Tag's charging feature.

# Challenges we ran into
One of the chelleges we faced was initializing the modem for the GSM Module as the Module only accepted 3.3V when our power source was 3.7 LiPo Batteries. We ended up designing a voltage divider in order to allow for the GSM Module to communicate and connect with our Kotlin mobile app.

# What's next for Power Tag
We hope that in the future we are able to possible connect to Apple's built in UWB Chip (Ultra Wide Bands) for Find My compatibility and improved location services

# Overview
Here are some quick links to some of the resources we developed while creating our project:

⚒️ • [CAD Prototype](https://cad.onshape.com/documents/414c4d8f43532bc1522ffbfb/w/5fb8d6774189fcfafbb3d3dd/e/008da2b45a0e4b36c7adde66?renderMode=0&uiState=671de227b8d1f63fc293a736) (WIP)

📐 • [Figma](https://www.figma.com/design/xHWXMFgnI0LNjJG5GyGXPK/Power-Tag-App?node-id=0-1)

📢 • [Pitchdeck](https://docs.google.com/presentation/d/1R1kPwp6bea-cZtiw3fCqTe-CjcfZVofYU63vwoQppgA/edit?usp=sharing) 

📕 • [Documentation](https://docs.google.com/document/d/1vHXY2cktga8L-Rg751vY4500SpIR977lDCjheDakogU/edit?usp=sharing) 

# Materials
If you're interested in what materials we used to build Power Tag, here's a list of resources from where we purchased our parts!

- [Arduino UNO](https://www.amazon.com/Arduino-A000066-ARDUINO-UNO-R3/dp/B008GRTSV6/ref=asc_df_B008GRTSV6/?tag=hyprod-20&linkCode=df0&hvadid=693421862574&hvpos=&hvnetw=g&hvrand=6421810398727834100&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9189214&hvtargid=pla-457497319401&psc=1&mcid=8d4415853f19330eb6cb8c1e7f18a8ed) (Arrived!)
- [SIM 800L GSM Module](https://www.amazon.com/HiLetgo-Smallest-Breakout-Quad-band-3-7-4-2V/dp/B01DLIJM2E) (Arrived!)
- [SIM Card w/o provider (from 1NCE)](https://1nce.com/en-us/gps-tracking-sim-cards?utm_term=&utm_campaign=PMax+-+Product&utm_source=adwords&utm_medium=ppc&hsa_acc=4214171268&hsa_cam=21418043752&hsa_grp=&hsa_ad=&hsa_src=x&hsa_tgt=&hsa_kw=&hsa_mt=&hsa_net=adwords&hsa_ver=3&gad_source=2&gclid=EAIaIQobChMIhMLX7LCciQMVwirUAR3U4jDGEAEYASABEgKelPD_BwE) (Arrived!)
- [18650 Charger Board Lithium Battery Charging Module](https://www.amazon.com/DAOKAI-Charging-Lithium-Battery-Protection/dp/B0C9QH9MY1/ref=sr_1_1?crid=2LZXFCC0CTA&dib=eyJ2IjoiMSJ9.2Jm-plY70zjxzjvfz1jd4BPHfBvscZ8nPqzoE3EuNSuLHKREhghkekiwZexOdRPhs9IEccdghyT-32WJGqY9mMpLCe48X8ncAyG1ncgHCTVl5e1zz7Hg95ad7uUeeYZm7jQnoLC8bsIWHsBumXLCytttuG4aVFmEsP_Tvw30LmO7RY3g4706gnygPNPbnShQNyp3YduePP-6GvLFGG78k5NwFXC0_nvb9yBsbRJZ0VrxR2YPtEoSojlUNWEMt9hkZoq0-tqIcJIYYnZkBWcQWjQs56sgElEfUaGY3CRY30g.l2hUcj9j94hkGiVGlT2FBXmEsLonW3g7gW37iIyoQ1U&dib_tag=se&keywords=18650+Charger+Board+Lithium+Battery+Charging+Module+Dual+USB+5V+2.4A+MiniType-C&qid=1730075517&s=electronics&sprefix=18650+charger+board+lithium+battery+charging+module+dual+usb+5v+2.4a+minitype-c%2Celectronics%2C111&sr=1-1) (11/3/24 - 11/7/24)
- [18650 Lithium ion battery 3.7V x2](https://www.amazon.com/CPZZ-1-5V-Battery-Rechargeable-Battery-0720-31/dp/B0CBPK51RP/ref=sr_1_1?crid=1GPJKGREICE3M&dib=eyJ2IjoiMSJ9.Bi6DPR7Tvu07fyX3xW3ti4DJ9C_8P9f67xs6AyJIpQMX__TwckVkd9b-z24MfPFrYrzmlGs0wnW6ifeTImdVrWqKQgzt48jbq0PGZTaplgPNq2NPQTh0byiK0FSXgza1TDyC6eej7AeuL00GJhj6J1Ka_ilo778GIntD5r654yR-idOXZc1vvaAPTGS5VW31FxjFBGVydFrd3Ubgn7NKIHiz97A6HaAJ1enjWPr_oP9NR15Zr93WqcRfGwA3QIbqLLXQg061m7ndABHdieVFqOGhpcePxvbuU9BbFowwuJo.X78xGv1jUWY-wOOyrINpZ4CDgSVS4qcM4jQ8Cl9zbrk&dib_tag=se&keywords=Lithium+ion+battery+3.7V+x2+(+18650+)+%5B%247+per+battery%5D&qid=1729408559&sprefix=lithium+ion+battery+3.7v+x2+18650+7+per+battery+%2Caps%2C189&sr=8-1) (11/1/24 - 11/8/24)
- [Arduino Breadboard](https://store-usa.arduino.cc/products/breadboard-400-contacts?gad_source=1&gclid=CjwKCAjwyfe4BhAWEiwAkIL8sAEkCZWwGNTrrsmo-MwVeWRzM9r9tvvvBDoWXtum0r0myK9WlQW3zxoCWccQAvD_BwE) (Arrived)
  
