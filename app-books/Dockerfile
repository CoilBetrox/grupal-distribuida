# docker build -t app-books .

FROM eclipse-temurin:17.0.10_7-jre-alpine
RUN mkdir /app
WORKDIR /app
COPY build/libs/app-books-0.0.1-SNAPSHOT.jar /app/app.jar
CMD ["java", "-jar", "app.jar"]

