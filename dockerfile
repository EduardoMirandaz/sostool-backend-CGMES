# We start with a base image that has Maven and OpenJDK installed
FROM maven:3.8.1-openjdk-11-slim AS build

# Set the current working directory inside the image
WORKDIR /app

# Copy pom.xml file to the app directory
COPY pom.xml .

# Download dependencies as specified in pom.xml
RUN mvn dependency:go-offline -B

# Copy the rest of the application source code
COPY src ./src

# Package the application
RUN mvn clean package

# Start with a base image containing Java runtime
FROM openjdk:11-jre-slim

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Set the application's .jar file
ARG JAR_FILE=/app/target/*.jar

# Copy the application's .jar file from the builder stage
COPY --from=build ${JAR_FILE} app.jar

# Run the application
ENTRYPOINT ["java","-jar","app.jar"]
