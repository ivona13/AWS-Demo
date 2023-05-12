FROM openjdk:17-jdk-slim
WORKDIR /parking_app
COPY build/libs/*.jar aws-example-demo.jar
EXPOSE 8083
CMD ["java", "-jar", "aws-example-demo.jar"]