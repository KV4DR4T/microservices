FROM openjdk:17-oracle
WORKDIR /app
COPY target/service5-0.0.1-SNAPSHOT.jar /app/service5.jar
ENTRYPOINT ["java", "-jar", "service5.jar"]

EXPOSE 8085