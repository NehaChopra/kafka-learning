package com.quintifi.kafkalearning;

import java.util.Properties;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

public class AsyncProducer {

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
		producer.send(producerRecord, new CustomCallback());// asynchronous send for producer
		System.out.println("AsynchronousProducer Completed with success.");
		producer.close();
	}

}

class CustomCallback implements Callback {

	@Override
	public void onCompletion(RecordMetadata metadata, Exception exception) {
		if (exception != null) {
			System.out.println("AsynchronousProducer failed with an exception");
		}
	}

}
