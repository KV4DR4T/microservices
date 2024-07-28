FROM openjdk:17-oracle
WORKDIR /app
COPY target/service4-0.0.1-SNAPSHOT.jar /app/service4.jar
ENTRYPOINT ["java", "-jar", "service4.jar"]

EXPOSE 8084