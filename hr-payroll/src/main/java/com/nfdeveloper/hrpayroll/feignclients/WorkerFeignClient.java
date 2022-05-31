package com.nfdeveloper.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nfdeveloper.hrpayroll.entities.Worker;

@Component
@FeignClient(name = "hr-worker", url="localhost:8001", path = "/workers")
public interface WorkerFeignClient {

	// Aqui é declarado o tipo de chamada a ser feito.
	@GetMapping(value = "/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);

	
}
