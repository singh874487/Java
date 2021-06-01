package com.example.restws.health.Git2;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "ok")
public class Git2 implements HealthIndicator {

	private final String message_key = "Commit Id";
	private String git_value = "123";

	@Override
	public Health health() {
		if (!isRunningServiceA()) {
			return Health.down().withDetail(message_key, "Not Available").build();
		}
		
		//return Health.up()
		
		
		return Health.up().withDetail(message_key, git_value).build();
	}

	private Boolean isRunningServiceA() {
		Boolean isRunning = true;
		// Logic Skipped
		return isRunning;
	}

}
