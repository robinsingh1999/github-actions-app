FROM eclipse-temurin:8-jre
EXPOSE 8080
ADD target/springboot-images-new.jar springboot-images-new.jar
ENTRYPOINT ["java","-jar","springboot-images-new.jar"]
