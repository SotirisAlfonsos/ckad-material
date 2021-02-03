FROM openjdk:11-ea-15-jre-slim
COPY target/sampleHelloWorld-1.0-SNAPSHOT.jar /app/
WORKDIR /app
CMD ["java", "-jar", "-Dspring.config.location=/config/", "sampleHelloWorld-1.0-SNAPSHOT.jar"]