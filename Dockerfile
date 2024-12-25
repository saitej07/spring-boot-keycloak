FROM openjdk:17
EXPOSE 8080
ADD target/spring-boot-keycloak.jar spring-boot-keycloak.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-keycloak.jar" ]