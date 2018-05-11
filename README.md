Development of Mobile Application for Route Planning Based on Pollution Detection
========================================================================================================================
The purpose of this project is to develop an application based on the Android system that can optimize travel routes from selected locations by incorporating information on air pollution data. The air pollution data are based upon the data measured and made available by the AirCasting Project (http://www.aircasting.org). To access this data, the application sends a request to AirCasting's data server. The server parses the relevant data and returns them to the mobile application. The application integrates and calculates the processed data, and finally calculates and draws different routes for visual display. In the process of implementing this project, there are many challenges related to application development. The report also details the development process undertaken throughout this work.

## Flow Chart of Route Planning Application
<p align="center"><img src="https://github.com/kobespirit/Route-Planning-App-Project-FinalVersion/blob/master/Sample%20Pics/30.png" width="550"/></p>

## Implementation Design
### Start Interface:
<p align="center"><img src="https://github.com/kobespirit/Route-Planning-App-Project-FinalVersion/blob/master/Sample%20Pics/1.png" width="250"/></p>

### Welcome guide interface:
<p align="center"><img src="https://github.com/kobespirit/Route-Planning-App-Project-FinalVersion/blob/master/Sample%20Pics/31.png" width="300"/></p>
<p align="center"><img src="https://github.com/kobespirit/Route-Planning-App-Project-FinalVersion/blob/master/Sample%20Pics/32.png" width="300"/></p>
<p align="center"><img src="https://github.com/kobespirit/Route-Planning-App-Project-FinalVersion/blob/master/Sample%20Pics/33.png" width="300"/></p>

### Main Interface：
<p align="center"><img src="https://github.com/kobespirit/Route-Planning-App-Project-FinalVersion/blob/master/Sample%20Pics/11.png" width="300"/></p>

### Choose map style：
<p align="center"><img src="https://github.com/kobespirit/Route-Planning-App-Project-FinalVersion/blob/master/Sample%20Pics/12.png" width="300"/></p>

### Different map style display：
<p align="center"><img src="https://github.com/kobespirit/Route-Planning-App-Project-FinalVersion/blob/master/Sample%20Pics/34.png" width="300"/></p>
<p align="center"><img src="https://github.com/kobespirit/Route-Planning-App-Project-FinalVersion/blob/master/Sample%20Pics/35.png" width="300"/></p>

### Current location display：
<p align="center"><img src="https://github.com/kobespirit/Route-Planning-App-Project-FinalVersion/blob/master/Sample%20Pics/17.png" width="300"/></p>

### Address auto complete：
<p align="center"><img src="https://github.com/kobespirit/Route-Planning-App-Project-FinalVersion/blob/master/Sample%20Pics/18.png" width="300"/></p>

### Jump to Google to check information：
<p align="center"><img src="https://github.com/kobespirit/Route-Planning-App-Project-FinalVersion/blob/master/Sample%20Pics/36.png" width="300"/></p>

### Route planning for different mode:
<p align="center"><img src="https://github.com/kobespirit/Route-Planning-App-Project-FinalVersion/blob/master/Sample%20Pics/37.png" width="300"/></p>

### About us interface:
<p align="center"><img src="https://github.com/kobespirit/Route-Planning-App-Project-FinalVersion/blob/master/Sample%20Pics/24.png" width="300"/></p>

### Link to social network:
<p align="center"><img src="https://github.com/kobespirit/Route-Planning-App-Project-FinalVersion/blob/master/Sample%20Pics/38.png" width="300"/></p>

### Link to AirCasting and EPA Vic:
<p align="center"><img src="https://github.com/kobespirit/Route-Planning-App-Project-FinalVersion/blob/master/Sample%20Pics/39.png" width="300"/></p>

## Future Work
Some aspects of this project can be improved in the future. First of all, regarding the material design, which is a new interface design language. It is based on traditional design principles, combined with rich creative and scientific technology. It contains visual, sports, interactive effects and other characteristics. It is a new design specification supporting Android applications. Therefore, it is necessary to have this application completely added to the material design concept, which includes the drawing of the user interface, the matching of the application colors, the design of the interface layout, and the addition of the jump animation effect.

In addition, it is expected that in the future time, a function called multiple choice route mode could be added. When a user starts from one location to another, there are multiple routing options available to the user to select. The first one is the shortest distance between the two places; the second function is between the two sites, the lowest air pollution index line, which may be the shortest distance. The last one is a more comprehensive and reasonable trade-off model of the route planning. This model needs to be analyzed and calculated for the location selected by the user, resulting in a route where the pollution index is within acceptable limits and the distance is also within an acceptable range. This feature needs to optimize and improve the existing algorithm.

Finally, in the future, the memory footprint and compatibility of this mobile application could have substantial improvements. This requires a higher level of technology and experience.

## Conclusions
In conclusion, the project has developed a mobile application on the Android system, which can detect air pollution and plan the routes to minimize pollution exposure. The app uses air pollution data from the AirCasting Project, by calling its API interface. The application uses Google maps and through air pollution data analysis, processing and calculation, obtains the shortest routes between two points. At the same time, the optimal route between two places is visualised. This route is the integration of the distance and the pollution coefficient. It can offer the user a valuable travel reference.

In the process of implementing this project, many challenges and problems have arisen. Since it is my first time to develop an Android application, the emergence of a variety of problems made the implementation of the application difficult compared to experienced Android programmers. For example, when the application is running, care needs to be taken to avoid loading too much data through the launcher in the layout file. Another issue is that in the map activity layout file, the user must accurately identify the relevant functions. 

A key consideration is how to improve user experience. Every challenge and problem encountered in the process of implementing this project resulted in a solution, but other solutions are also possible. In addition, there are some features and interface performance, which could be improved and enhanced in the future.


## References
[1]. Shen, MY, Liu, CY & Huang, B 2013, A Development Strategy of M-Commerce against Mobile Interne, Chapter 3, pp. 1092-1096.

[2]. Nica, E 2015, ICT INNOVATION, INTERNET SUSTAINABILITY, AND ECONOMIC DEVELOPMENT, Addleton Academic Publishers. 

[3]. Barry, M, Vinton, G, David, D 2012,
<http://www.internetsociety.org/internet/what-internet/history-internet/brief-history-internet>.

[4]. The history of Android<http://www.androidcentral.com/android-history>.

[5]. EPA Vic About Us<http://www.epa.vic.gov.au/about-us/who-we-are>.

[6]. AirCasting Project About Us<http://www.aircasting.org/about>.

[7]. The difference between functional and non-functional requirements
<http://reqtest.com/requirements-blog/understanding-the-difference-between-functional-and-non-functional-requirements>.

[8]. Hartley, S 1998, Concurrent programming: the Java programming language, Oxford University Press, New York.

[9]. May, T 2016, The beginner's guide to flat design
 <http://www.creativebloq.com/graphic-design/what-flat-design-3132112>.

[10]. Delling, D, Sanders, P, Schultes, D & Wagner, D 2009, Algorithmics of Large and Complex Networks: Design, Analysis, and Simulation, Springer, pp. 117–139.

## Appendix
Application video demo:
https://www.youtube.com/watch?v=IftY9vTKmrs

Google Maps API Instruction:
https://developers.google.com/maps/

Google Maps API demo for Android:
https://github.com/googlemaps/android-samples

AirCasting Project Instruction and API:
https://github.com/habitatmap/aircasting
