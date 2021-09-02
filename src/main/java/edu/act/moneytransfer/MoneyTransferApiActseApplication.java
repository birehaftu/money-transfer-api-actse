package edu.act.moneytransfer;

import edu.act.moneytransfer.domains.Account;
import edu.act.moneytransfer.repositories.AccountRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoneyTransferApiActseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyTransferApiActseApplication.class, args);
	}

	// Class vs Interface
	//Account account = new Account(); // works

	//'AccountRepository' is abstract; cannot be instantiated
	//AccountRepository accountRepository = new AccountRepository(); // doesn't work

}
