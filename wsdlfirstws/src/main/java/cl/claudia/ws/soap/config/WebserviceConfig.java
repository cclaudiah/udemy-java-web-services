package cl.claudia.ws.soap.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cl.claudia.ws.soap.CustomerOrdersWsImpl;
import jakarta.xml.ws.Endpoint;

@Configuration
public class WebserviceConfig {

	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint endpoint() {
		Endpoint endpoint = new EndpointImpl(bus, new CustomerOrdersWsImpl());
		endpoint.publish("/customerordersservice");
		return endpoint;
		
	}
}
