package com.offcn.util;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="message")
public class Message {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
