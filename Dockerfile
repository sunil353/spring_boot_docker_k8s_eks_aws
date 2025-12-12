# Use the official OpenJDK 17 image from AWS Public ECR
FROM eclipse-temurin:17-jdk

# add the compiled Java application JAR file into the container
ADD ./target/spring-boot-docker-eks.jar  /spring-boot-docker-eks.jar

# Expose the port the Spring Boot application will run on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "spring-boot-docker-eks.jar"]
