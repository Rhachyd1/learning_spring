FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG --build-arg JAR_FILE=target/*.jar -t rhd/learningspring
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]