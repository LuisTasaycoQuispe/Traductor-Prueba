# Usa la imagen oficial de OpenJDK 17 como base
FROM openjdk:17-jdk-alpine

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Expone el puerto 8085 para acceso externo (asegúrate de que este sea el puerto correcto para tu aplicación)
EXPOSE 8085

# Agrega el archivo JAR de tu aplicación al directorio de trabajo en el contenedor
ADD ./target/traductor-0.0.1-SNAPSHOT.jar app.jar

# Define el punto de entrada para ejecutar la aplicación Java
ENTRYPOINT ["java", "-jar", "app.jar"]