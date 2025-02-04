
FROM openjdk:22-slim-bullseye


# Set the working directory
WORKDIR /app

COPY .mvn/ .mvn

COPY mvnw pom.xml ./

RUN chmod +x ./mvnw

RUN apt-get update && apt-get install -y dos2unix

RUN dos2unix ./mvnw

RUN ./mvnw dependency:resolve

COPY src ./src

# Copy the JAR file
#COPY target/*.jar app.jar

# Expose the application port
EXPOSE 8080

CMD ["./mvnw", "spring-boot:run"]

# Run the application
#ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]