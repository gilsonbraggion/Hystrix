package br.com.rhinosistemas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages= {"br.com.rhinosistemas.controller", "br.com.rhinosistemas.service"})
public class MainResilienteHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainResilienteHystrixApplication.class, args);
	}
}
