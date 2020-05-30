# polling-app

Spring Boot application made using JWT authentication, Spring Security, JPA. Client-side made using react and ant-design.

To run the server, create application.properties under resources and  fill the below variable.
## Server Properties
server.port= 5000

## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
spring.datasource.url= 
spring.datasource.username= 
spring.datasource.password= 

## Hibernate Properties

# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto = update

## Hibernate Logging
logging.level.org.hibernate.SQL= DEBUG

# Initialize the datasource with available DDL and DML scripts
spring.datasource.initialization-mode=always

## Jackson Properties
spring.jackson.serialization.WRITE_DATES_AS_TIMESTAMPS= false
spring.jackson.time-zone= UTC

## App Properties
app.jwtSecret= jwtSecret
app.jwtExpirationInMs = 604800000


