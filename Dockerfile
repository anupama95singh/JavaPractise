FROM openjdk:8
ADD target/customer-0.0.1-SNAPSHOT.jar customer.jar
EXPOSE 9041
ENTRYPOINT ["java","-jar","customer.jar"]