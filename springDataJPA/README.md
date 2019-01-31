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

#Angular Integeration :
# Need copy file Module
npm install copyfiles -g

#Configure in package.json this this will copy file from dist folder to resources/ static
 "start": "ng serve --proxy-config proxy-conf.json",
    "build": "ng build --prod",
    "postbuild": "npm run deploy",
    "predeploy": "rimraf ../resources/static/ && mkdirp ../resources/static",
    "deploy": "copyfiles -f dist/** ../resources/static",
    
#Create proxy-conf.json configue your api url
{
"/api/*": {
    "target": "http://localhost:9081",
    "secure": false
  }
}

#check angular.json for outputpath & specify as per that.
"options": {
            "outputPath": "dist",

