FROM openjdk:17-jdk-alpine

WORKDIR /app

EXPOSE 8085

ENV DATABASE_URL ${DATABASE_URL}

ENV DATABASE_API_KEY ${DATABASE_API_KEY}

ADD ./target/traductor-0.0.1-SNAPSHOT.jar app.jar
# Define el punto de entrada para ejecutar la aplicación Java
ENTRYPOINT ["java", "-jar", "app.jar"]
