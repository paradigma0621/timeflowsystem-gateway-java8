# Time Flow System 
Backend and Frontend implementation of software to measure time quality in work

## Gateway
This project is designed to run in *Java 8*.
Runs on port 8765.

2022-11-22 - Started Time Flow System project.

2023-04-02 - Connected Gateway with Config Server and Eureka Server Microservices. Once it gets the configuration from https://github.com/mselucas/configRepo/blob/master/gateway-java8.properties

2023-04-07 - Unified Config + Eureka + Report + Gateway (See specific branch inside all their repositories: "2023-04-07-Config+Eureka+Report+Gateway"). For a test, up the microservices report-java8 and access the endpoint:
	http://localhost:8765/persons/getPersonMsg

