FROM java:8
EXPOSE 8080
ADD target/second-0.0.1-SNAPSHOT.jar second-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","second-0.0.1-SNAPSHOT.jar"]