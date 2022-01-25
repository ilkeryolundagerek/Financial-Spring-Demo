package com.iyg.financial.repository;

import com.iyg.financial.model.*;

public interface TransferRepository {
	
	void transfer(Account accountA, Account accountB, Amount amount);
}
