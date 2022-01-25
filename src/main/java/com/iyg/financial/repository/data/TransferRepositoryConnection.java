package com.iyg.financial.repository.data;

import com.iyg.financial.model.*;
import com.iyg.financial.repository.TransferRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TransferRepositoryConnection implements TransferRepository {


	@Override
	public void transfer(Account accountA, Account accountB, Amount amount) {
		System.out.println("Transfering...");
	}
}
