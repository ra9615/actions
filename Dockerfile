FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY target/simpleDocker-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]