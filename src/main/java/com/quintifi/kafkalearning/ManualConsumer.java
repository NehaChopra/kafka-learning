package com.quintifi.kafkalearning;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class ManualConsumer {

	public static void main(String[] args) {
		String groupName = "";
		String topicName = "";

		Properties prop = new Properties();
		prop.put("bootstrap.servers", "");
		prop.put("key.serializer", "");
		prop.put("value.serializer", "");
		prop.put("group.id", groupName);
		prop.put("enable.auto.commit", "false");// manually commit sync or async
		KafkaConsumer<String, String> consumer = null;
		try {
			consumer = new KafkaConsumer<>(prop);
			consumer.subscribe(Arrays.asList(topicName));

			while (true) {
				ConsumerRecords<String, String> records = consumer.poll(100);
				for (ConsumerRecord<String, String> r : records) {
					System.out.println(r.toString());
				}
				consumer.commitAsync();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			consumer.commitSync();
			consumer.close();
		}
	}

}
