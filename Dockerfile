FROM openjdk:8
WORKDIR /app/maven
COPY . /app/maven
CMD ["java","-cp","./target/classes:./target/dependency/*","com.operation.App"]