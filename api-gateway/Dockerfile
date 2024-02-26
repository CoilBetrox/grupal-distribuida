# docker build -t app-gateway .
# docker run -d --name authors01 -p 9090:9090 app-authors
#FROM adoptopenjdk/openjdk17:jre-17.0.2_8-alpine

FROM eclipse-temurin:17.0.10_7-jre-alpine

RUN mkdir /app
WORKDIR /app
COPY build/libs/api-gateway-0.0.1-SNAPSHOT.jar /app/app.jar
CMD ["java", "-jar", "app.jar"]

