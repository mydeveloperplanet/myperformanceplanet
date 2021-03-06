package com.mydeveloperplanet.myperformanceplanet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
public class MyPerformancePlanetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPerformancePlanetApplication.class, args);
	}

	@Bean
	public TaskExecutor getTaskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(2);
		executor.setMaxPoolSize(2);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("MyTaskExecutor-");
		executor.initialize();
		return executor;
	}
}
