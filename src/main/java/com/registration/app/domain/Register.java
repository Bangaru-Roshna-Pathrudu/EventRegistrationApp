package com.registration.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Register {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String attendeename;
    private String event;
	public Register() {
	 
	}
	public Register(Long id, String attendeename, String event) {
	this.id = id;
	this.attendeename = attendeename;
	this.event = event;
	}
	public Long getId() {
	return id;
	}
	public void setId(Long id) {
	this.id = id;
	}
	public String getRegistername() {
	return attendeename;
	}
	public void setRegistername(String attendeename) {
	this.attendeename = attendeename;
	}
	public String getEvent() {
	return event;
	}
	public void setEvent(String event) {
	this.event = event;
	}
}
