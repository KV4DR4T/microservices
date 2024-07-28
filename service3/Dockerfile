FROM openjdk:17-oracle
WORKDIR /app
COPY target/service3-0.0.1-SNAPSHOT.jar /app/service3.jar
ENTRYPOINT ["java", "-jar", "service3.jar"]

EXPOSE 8083