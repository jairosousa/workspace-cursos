# Master Microservices with Spring Boot and Spring Cloud.

## [GitHub instrutor](https://github.com/in28minutes/spring-microservices-v2)

## Launch MySQL as Docker Container
```shell
docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=social-media-user --env MYSQL_PASSWORD=dummypassword --env MYSQL_DATABASE=social-media-database --name mysql --publish 3306:3306 jnsousa/mysql8
```

## mysqlsh commands
mysqlsh //Pesquise no google
```shell
\connect social-media-user@localhost:3306
```
```shell
\sql
```
```shell
use social-media-database
select * from user_details;
select * from post;
```
```shell
\quit
```

## pom.xml Modified
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
</dependency> 

## /src/main/resources/application.properties 
Modified

\#spring.datasource.url=jdbc:h2:mem:testdb
spring.jpa.show-sql=true
spring.datasource.url=jdbc:mysql://localhost:3306/social-media-database
spring.datasource.username=social-media-user
spring.datasource.password=dummypassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
