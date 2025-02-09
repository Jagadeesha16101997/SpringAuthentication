# Use the official OpenJDK image from Docker Hub as the base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot .jar file from the target folder to the container
COPY target/your-app.jar app.jar

# Expose the port the app will run on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]