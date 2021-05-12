FROM openjdk:8-jdk-alpine
WORKDIR /home/
ENV TZ="Asia/Hong_Kong"
ENV JAR_FILE="ms-member-0.0.1-SNAPSHOT.jar"
COPY target/${JAR_FILE} ./
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java -jar $JAR_FILE"]