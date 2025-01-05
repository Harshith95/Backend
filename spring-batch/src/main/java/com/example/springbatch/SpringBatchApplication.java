package com.example.springbatch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBatchApplication {
	public static void main(String[] args) {
		// You can start your Spring context here if needed
		// SpringApplication.run(SpringBatchApplication.class, args);

		// For XML configuration, you might initialize the context manually
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("batch-config.xml");

		try {
			JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
			Job job = (Job) context.getBean("myJob");

			JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
					.toJobParameters();

			JobExecution jobExecution = jobLauncher.run(job, jobParameters);
			System.out.println("Job Execution Status: " + jobExecution.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			context.close();
		}
	}
}