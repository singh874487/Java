package com.example.restws.health_3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class Build implements HealthIndicator {

	private String buildVersion;

	public Build(@Value("${buid.version:/tmp}") String buildVersion) {
		this.buildVersion = buildVersion;
	}

	@Override
	public Health health() {

		if (buildVersion != null) {
			return Health.up().build();
		} else {
			return Health.unknown().build();
		}

	}
}
