package com.registration.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.app.domain.Register;
import com.registration.app.repository.RegisterRepository;

@Service
public class RegisterService {
	@Autowired
    private RegisterRepository repo;
	
	public List<Register> listAll() {
        return repo.findAll();
    }
     
    public void save(Register reg) {
        repo.save();
    }
     
    public Register get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}