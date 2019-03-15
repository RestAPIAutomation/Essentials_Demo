FROM java
MAINTAINER vivek parmar (myemail@gmail.com)
RUN apt-get update
RUN apt-get install -y maven
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src
COPY chromedriver /usr/local/service
WORKDIR /usr/local/service
RUN mvn clean install test
RUN ls ./target/ 
CMD ["java","-cp","-jar","C:/Users/vparmar/.m2/repository/org/xpanxion/essentials/program/Essentials_Demo/0.0.1-SNAPSHOT/Essentials_Demo-0.0.1-SNAPSHOT.jar/Essentials_Demo-0.0.1-SNAPSHOT.jar","org.xpanxion.essentials.program"]
