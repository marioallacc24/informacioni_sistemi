package rs.edu.educons.it.is.MB;

import org.h2.command.CommandInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import rs.edu.educons.it.is.MB.entity.Predmet;
import rs.edu.educons.it.is.MB.repository.PredmetRepository;

@SpringBootApplication //anotacija (@RestController,@RequestMapping)
public class MbApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PredmetRepository pr;
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		ApplicationContext applicationContext = 
		SpringApplication.run(MbApplication.class, args);
		
//		for (String beanName: applicationContext.getBeanDefinitionNames()) {
//			System.out.println(" * " + beanName);
//			
//		}
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Predmet predmet = pr.findById(1001L);
		logger.info("predmet 1001 -> {}", predmet.toString());
		predmet = pr.findById(1002L);
		logger.info("predmet 1002 -> {}", predmet.toString());
		
	}
}
