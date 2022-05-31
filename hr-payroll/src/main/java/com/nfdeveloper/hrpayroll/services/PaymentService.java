package com.nfdeveloper.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nfdeveloper.hrpayroll.entities.Payment;
import com.nfdeveloper.hrpayroll.entities.Worker;
import com.nfdeveloper.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody(); 
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
