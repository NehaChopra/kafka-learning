package com.quintifi.kafkalearning;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

public class SyncProducer {

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
		try {
			RecordMetadata metadata = producer.send(producerRecord).get();// synchronous send for producer
			System.out.println(
					"Message is sent to Partition no " + metadata.partition() + " and offset " + metadata.offset());
			System.out.println("SynchronousProducer Completed with success.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("SynchronousProducer failed");
		} finally {
			producer.close();
		}
	}

}
