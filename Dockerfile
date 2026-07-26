FROM maven:3.9.16-eclipse-temurin-21-alpine

COPY . .

CMD ["mvn", "compile"]
