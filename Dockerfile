# Etapa 1: Construcción
FROM maven:3.8.5-openjdk-17-slim AS build
WORKDIR /app
# Copiamos el contenido de la carpeta demo al directorio actual
COPY demo /app/demo
WORKDIR /app/demo
RUN mvn clean package -DskipTests

# Etapa 2: Ejecución
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Buscamos el jar dentro de la carpeta target de demo
COPY --from=build /app/demo/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
