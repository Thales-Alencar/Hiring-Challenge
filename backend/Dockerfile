FROM maven:3.8.5-openjdk-17 AS build

COPY src /app/src
COPY pom.xml /app

WORKDIR /app
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk

COPY --from=build /app/target/*.jar /app/app.jar

WORKDIR /app

EXPOSE 3003

CMD ["java", "-jar", "app.jar"]
