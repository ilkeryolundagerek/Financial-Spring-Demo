package com.iyg.financial;

import com.iyg.financial.model.Amount;
import com.iyg.financial.service.TransferService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinancialApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(FinancialApplication.class, args);
        TransferService transferService = ctx.getBean(TransferService.class);
        transferService.transferAmount(100l, 200l, new Amount(2000.0));
        ctx.close();
    }
}
