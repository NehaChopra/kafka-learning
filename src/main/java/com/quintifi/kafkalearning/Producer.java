package com.quintifi.kafkalearning;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class Producer {

	public static void main(String[] args) {
		String topicName = "";
		String key = "";
		String value = "";

		Properties prop = new Properties();
		prop.put("bootstrap.servers", "");
		prop.put("key.serializer", "");
		prop.put("value.serializer", "");

		KafkaProducer<String, String> producer = new KafkaProducer<>(prop);
		ProducerRecord<String, String> producerRecord = new ProducerRecord<>(topicName, key, value);
		producer.send(producerRecord);// fire and forget method of producer
		producer.close();

	}

}
