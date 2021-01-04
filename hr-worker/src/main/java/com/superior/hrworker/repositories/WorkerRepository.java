package com.superior.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superior.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
	

}
