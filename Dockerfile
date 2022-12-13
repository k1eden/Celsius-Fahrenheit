FROM gradle:7.6.0-jdk17-alpine AS build

COPY --chown=gradle:gradle . /home/gradle/src

WORKDIR /home/gradle/src

RUN gradle build

FROM openjdk:18.0-slim

COPY --from=build /home/gradle/src/build/libs/Celsius-Fahrenheit-1.0-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
