FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/my-spring-boot-app.jar app.jar
CMD ["java", "-jar", "app.jar"]
