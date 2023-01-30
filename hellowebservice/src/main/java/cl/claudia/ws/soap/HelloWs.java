package cl.claudia.ws.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class HelloWs {
	
	@WebMethod
	public String hello() {
		return "Hello";
	}
}
