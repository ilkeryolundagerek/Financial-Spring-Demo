package com.iyg.financial;

import com.iyg.financial.repository.*;
import com.iyg.financial.repository.data.*;
import com.iyg.financial.service.*;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan(basePackageClasses={TransferService.class, AccountRepository.class})
public class AppConfiguration {
	
	@Bean
	public TransferService transferService(){
		return new TransferServiceImpl(accountRepository(), transferRepository());
	}
	@Bean
	public AccountRepository accountRepository() {
		return new AccountRepositoryConnection();
	}
	@Bean
	public TransferRepository transferRepository() {
		return new TransferRepositoryConnection();
	}
}
