# Share_Price_Application

This is a simple desktop application using the stock API for real world Stock Market.

# Application Features:

- The application is configurable which share prices are to be retrieved.
- In memory Database, the retrieved data is stored in an H2 database in the file system.
- Communication between Front-end and Back-end through REST-API
- Access to the REST controller is secured via OAuth2 (as an OAuth2 provider it authenticates through Github)

# Technologies:

- Front-end: AngularJS, HTML, CSS, Bootstrap
- Back-end: SpringBoot (JAVA)
- Database: h2 Database Engine

# Build Instructions

- Install IntellijIdea

- Install java

- run mvn clean install to install the package into the local repository

- press run or debug to start the application

- the application will start on port 8088 and url http://localhost:/8088

- redirect to http://localhost:8088/swagger-ui/ for api docs

- to generate the binary run mvn clean deploy
