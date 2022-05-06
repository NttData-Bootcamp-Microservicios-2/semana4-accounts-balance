package nttdata.bootcamp.microservicios.saldo.cuentas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;




@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class MicroservicioSaldoCuentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioSaldoCuentaApplication.class, args);
	}
	/*
	 * @Bean CommandLineRunner commandLineRunner(KafkaTemplate<String, String>
	 * kafkaTemplate) { return args ->{ kafkaTemplate.send( "accountbalance",
	 * "Mensaje desde microservicio SALDO EN CUENTAS con apache KAFKA "); }; }
	 */
}
