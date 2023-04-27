# Spring Product Order RESTful API

## Description

***

Client sends and receives HTTP requests to 'orders' and 'products' tables in MySQL

* The HTTP requests are sent and received by an API testing software tool like Postman
* Postman sends the request to the server, which routes it to the appropriate endpoint for processing
* The server processes the request, performs the necessary action in the MySQL database, and sends a response back to
  Postman

## Setup of the MySQL database management system

***

* Download and install MySQL
* Give the root user your chosen password during installation
* Use MySQL workbench or IntelliJ IDEA to create the database or schema `spring_product_order_restful_api`

## Setup of the application.properties file

***

To change the password for the database, you can either set it in IntelliJ IDEA's Run/Debug Configurations Environment
variables or change the value of ${DATABASE_PASSWORD} to your chosen password

`spring.datasource.password=${DATABASE_PASSWORD}`

## HTTP requests and supported URLs

***

These requests are available at the URLs `http://localhost:8080/products` and `http://localhost:8080/orders`

* GET
* POST
* PUT
* DELETE