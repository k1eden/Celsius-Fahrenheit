FROM aeroncookbook/jdk16

COPY build/libs/Celsius-Fahrenheit-1.0-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
