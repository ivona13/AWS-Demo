FROM openjdk:17-jdk-slim
WORKDIR /aws-example-demo
COPY build/libs/*.jar /aws-example-demo/aws-example-demo.jar
EXPOSE 8083
CMD ["java", "-jar", "/aws-example-demo/aws-example-demo.jar"]