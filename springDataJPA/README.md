#Add  in pom
tomcat-jasper dependency for JSP to access
jackson dataformat xml dependency need to add in pox because to support XML formate response in rest 
use same version of jackson databind 

#ADD H2 database in application.properties
spring.h2.console.enabled=true
spring.datasource.platform=h2
spring.datasource.url=jdbc:h2:mem:kumardb

#To Access H2 database
localhost:8080/h2-console

username : sa
password :