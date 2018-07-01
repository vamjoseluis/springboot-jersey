package com.tuxpuckpepe.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import resource.StoresResource;

/**
 * 
 * @author Tuxpuckpepe
 * This class register all the services (ResourcesConfig)
 * I's managed by spring (@Component) 
 */
@Component
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig() {
		register(StoresResource.class);
	}
}
