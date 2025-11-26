# Step 1: Build the application
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY target/spring-docker-mysql-0.01-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]