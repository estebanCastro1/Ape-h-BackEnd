FROM amazoncorretto:17-alpine-jdk   

COPY  out/artifacts/apeh_jar/apeh.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
