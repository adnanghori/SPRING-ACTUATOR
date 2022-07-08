package com.springboot.actuator.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class DBHealthService implements HealthIndicator{

	private static final String DB_SERVICE = "DB SERVICE";

	@Override
	public Health health() {
		
		if(isHealthGood()) {
			return Health.up().withDetail(DB_SERVICE, "UP").build();
		}
		else {
			return Health.down().withDetail(DB_SERVICE,"DOWN").build();
			
		}
	}

	public Boolean isHealthGood() {
		return true;
	}
}
