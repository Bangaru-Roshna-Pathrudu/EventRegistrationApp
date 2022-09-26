package com.registration.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registration.app.domain.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Long>{

}
