package com.nh;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class StoppedEventSubscriiber implements ApplicationListener<ContextStoppedEvent> {

	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("Context Stopped!");
		
	}

}
