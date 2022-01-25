package com.iyg.financial.service;


import com.iyg.financial.model.Amount;

public interface TransferService {
	
	void transferAmount(Long a, Long b, Amount amount);
}
