package cl.wom.kafkaConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaConsumerApplication implements CommandLineRunner {

	
	public static Logger logger = LoggerFactory.getLogger(KafkaConsumerApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}
	
	@KafkaListener(topics = "${spring.kafka.template.default-topic}")
	public void listen(String message) {
		logger.info("Mensaje recibido '{}'", message);
	}

}
