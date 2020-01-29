package com.quintifi.kafkalearning.SupplierProducerConsumer;

import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class SupplierProducer {
	public static void main(String[] args) {
		String topicName = "";
		String key = "";
		String value = "";

		Properties prop = new Properties();
		prop.put("bootstrap.servers", "");
		prop.put("key.serializer", "");
		prop.put("value.serializer", "");

		KafkaProducer<String, Supplier> producer = new KafkaProducer<>(prop);

		Supplier sp1 = new Supplier(101, "Xyz Pvt Ltd.", LocalDateTime.now());
		Supplier sp2 = new Supplier(102, "Abc Pvt Ltd.", LocalDateTime.now());

		ProducerRecord<String, Supplier> producerRecord1 = new ProducerRecord<>(topicName, key, sp1);
		ProducerRecord<String, Supplier> producerRecord2 = new ProducerRecord<>(topicName, key, sp2);

		producer.send(producerRecord1);// fire and forget method of producer
		producer.send(producerRecord2);// fire and forget method of producer
		producer.close();

	}
}
