# Usa una imagen base de Java
FROM openjdk:11-jre-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR al contenedor
COPY target/ejercicioAPI-0.0.1-SNAPSHOT.jar /app/ejercicioAPI-0.0.1-SNAPSHOT.jar

# Expone el puerto
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "/app/ejercicioAPI-0.0.1-SNAPSHOT.jar"]