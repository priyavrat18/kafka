# kafka

open 3 terminal windows , two kafka folders and one zookeeper folder

start zookeeper----- 
-> bin/zkServer.sh start-foreground

start kafka------- 
-> bin/kafka-server-start.sh config/server.properties

create a topic with same name which we have configured in the app ------
-> bin/kafka-topics.sh --bootstrap-servers localhost:9092 --create --topic myKafkaTest --partitions 1 --replication-factor 1

