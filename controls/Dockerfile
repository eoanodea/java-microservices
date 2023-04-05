FROM openjdk:17
WORKDIR /app
COPY . .
RUN ./mvnw clean install -DskipTests
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/controls-0.0.1-SNAPSHOT.jar"]
