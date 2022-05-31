package com.nfdeveloper.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.nfdeveloper.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bod", 200.0, days);
	}
}
