# docker build -t config-service .

FROM eclipse-temurin:17.0.10_7-jre-alpine
RUN mkdir /app
WORKDIR /app
COPY build/libs/config-service-0.0.1-SNAPSHOT.jar /app/app.jar
CMD ["java", "-jar", "app.jar"]

