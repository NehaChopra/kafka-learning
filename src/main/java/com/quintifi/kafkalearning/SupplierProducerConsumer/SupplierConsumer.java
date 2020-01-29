package com.quintifi.kafkalearning.SupplierProducerConsumer;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class SupplierConsumer {

	public static void main(String[] args) {
		String groupName = "";
		String topicName = "";

		Properties prop = new Properties();
		prop.put("bootstrap.servers", "");
		prop.put("key.serializer", "");
		prop.put("value.serializer", "");
		prop.put("group.id", groupName);

		KafkaConsumer<String, Supplier> consumer = new KafkaConsumer<>(prop);
		consumer.subscribe(Arrays.asList(topicName));

		while (true) {
			ConsumerRecords<String, Supplier> records = consumer.poll(100);
			for (ConsumerRecord<String, Supplier> r : records) {
				System.out.println(r.toString());
			}
		}

	}
}
