FROM eclipse-temurin:21-jdk-alpine
EXPOSE 8080
RUN addgroup -S demo && adduser -S demo -G demo
USER demo
COPY build/libs/omenergy-0.0.1-SNAPSHOT.jar omenergy.jar
ENTRYPOINT ["java","-jar","/omenergy.jar"]