FROM openjdk:17-jdk-slim
ADD target/JavaDemo-0.0.1.war app.jar
EXPOSE 8030
ENTRYPOINT ["java","-jar","/app.jar"]
