FROM amazoncorretto:17.0.7

COPY  out/artifacts/apeh_jar/apeh.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
