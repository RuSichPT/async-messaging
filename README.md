# async-messaging

Демо проект на Spring Boot.  
Использование брокеров сообщений.

### ActiveMQ artemis

https://hub.docker.com/r/apache/activemq-artemis

    docker run -it --rm --name artemis -p 61616:61616 -p 8161:8161 apache/activemq-artemis:latest-alpine
    
    docker stop artemis

http://localhost:8161/console  
user = artemis  
password = artemis

### RabbitMQ

https://registry.hub.docker.com/_/rabbitmq/

    docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management

    docker stop rabbitmq

http://localhost:15672/  
user = guest   
password = guest

Exchange = test.messaging.exchange  
Queue = my_queue  
RoutingKey = my_queue.routing_key

Пример создания Exchange, Queue и Binding
https://habr.com/ru/articles/703352/

### Apache Kafka
https://hub.docker.com/r/bitnami/kafka

    run_kafka.cmd

http://localhost:8090/