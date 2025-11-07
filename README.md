# lab-3-server-danim

This is a Spring Cloud Config **server project** that loads the configuration files from the **spring-cloud-server-config-danim** repo to be used by the Spring Cloud Config **client project** **lab-3-client-danim**.

# Starting the application

Start the Java class annotated by @SpringBootApplication and check it's started correctly in http://localhost:8001
The project can also be started to connect to Kafka in order to refresh the configuration via publishing a message in a Kafka topic.<br>
The steps to do this are:
- Start a local installation of Kafka in localhost:9092
- Change the configuration value for **wordConfig.luckyWord** in **lucky-word-client.yml** from repository **spring-cloud-server-config-danim**
- Execute the endpoint **localhost:8001/actuator/busrefresh**
- Start the **lab-3-client-danim** project and open **http://localhost:8002/lucky-word**. The displayed word should be loaded

# Dependencies

Config Server

# Tips

- The project starting class is annotated with **@SpringBootApplication** and also with **@EnableConfigServer** to indicate that acts as a Config Server
- The application.yml config file specifies the URI of the Git repository where the configuration files are stored, **spring-cloud-server-config-danim**
- the application.yml defines the spring config for the default profile (without Kafka) and the kafka profile
