package com.offcn.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.offcn.bean.Mobile;
import com.offcn.util.Message;

public interface MobileService {
	
	@GET
	@Path("/get/{num}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Message get(@PathParam("num") String num);
	
	public Mobile search(String number);
}
