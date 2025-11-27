FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

# Copy your correct Spring Boot JAR
COPY target/DOCKERPRACTICE-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
