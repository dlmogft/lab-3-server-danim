# lab-3-server-danim

This is a Spring Cloud Config **server project** that loads the configuration files from the **spring-cloud-server-config-danim** repo to be used by the Spring Cloud Config **client project** **lab-3-client-danim**.

# Starting the application

Start the Java class annotated by @SpringBootApplication and check it's started correctly in http://localhost:8001

# Dependencies

Config Server

# Tips

- The project starting class is annotated with **@SpringBootApplication** and also with **@EnableConfigServer** to indicate that acts as a Config Server
- The application.yml config file specifies the URI of the Git repository where the configuration files are stored, **spring-cloud-server-config-danim**
