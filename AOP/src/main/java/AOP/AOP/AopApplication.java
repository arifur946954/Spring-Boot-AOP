package AOP.AOP;

import AOP.AOP.dao.AccountDao;
import AOP.AOP.dao.MembershipDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDao accountDao, MembershipDao theMemberShipDao){
		return  runner-> {
			demoThebeforeAdvice(accountDao,theMemberShipDao);


		};
		}

	private void demoThebeforeAdvice(AccountDao accountDao,MembershipDao theMembershipDao) {
		accountDao.addAccount();
		theMembershipDao.addAccount();
		System.out.println("call it again");
		//accountDao.addAccount();
	}

}
