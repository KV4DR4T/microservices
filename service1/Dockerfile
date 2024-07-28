FROM openjdk:17-oracle
WORKDIR /app
COPY target/service1-0.0.1-SNAPSHOT.jar /app/service1.jar
ENTRYPOINT ["java", "-jar", "service1.jar"]

EXPOSE 8081