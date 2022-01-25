package com.iyg.financial.repository.data;

import com.iyg.financial.model.*;
import com.iyg.financial.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public class AccountRepositoryConnection implements AccountRepository {

	@Override
	public Account findByAccountId(Long accountId) {
		return new Account(accountId, "John Doe", new Amount(1000.0));
	}

}
