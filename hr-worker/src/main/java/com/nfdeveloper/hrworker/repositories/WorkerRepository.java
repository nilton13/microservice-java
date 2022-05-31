package com.nfdeveloper.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nfdeveloper.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
