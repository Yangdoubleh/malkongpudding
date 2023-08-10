FROM openjdk:11-jre-slim

EXPOSE 8082
ENV TZ=Asia/Seoul

ARG WAR_FILE=build/libs/*SNAPSHOT.war
ADD ${WAR_FILE} app.war

ENTRYPOINT ["java", "-server", "-jar", "/app.war"]


