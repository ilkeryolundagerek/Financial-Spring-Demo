package com.iyg.financial.repository;
import com.iyg.financial.model.Account;

public interface AccountRepository {
	
	Account findByAccountId(Long accountId);
}
