# KAFKA DEMO

## A Spring boot application to Publish message to Kafka cluster and subscribe the published message.
### Created A Rest controller to publish message to Kafka Topic


### Steps:

1) Clone the repository
2) install Kafka
3) open terminal
4) $ tar -xzf kafka_2.13-3.2.0.tgz
    $ cd kafka_2.13-3.2.0
5) Run the following commands in order to start all services in the correct order:

    Start the ZooKeeper service
    Note: Soon, ZooKeeper will no longer be required by Apache Kafka.

    $ bin/zookeeper-server-start.sh config/zookeeper.properties
    Open another terminal session and run:

    Start the Kafka broker service
    $ bin/kafka-server-start.sh config/server.properties
    
6) Run the Springboot Application

7) publish the message 
    http://localhost:8080/api/v1/messages









