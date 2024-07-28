FROM openjdk:17-oracle
WORKDIR /app
COPY target/service2-0.0.1-SNAPSHOT.jar /app/service2.jar
ENTRYPOINT ["java", "-jar", "service2.jar"]

EXPOSE 8082