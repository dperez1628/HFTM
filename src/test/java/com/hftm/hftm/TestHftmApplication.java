package com.hftm.hftm;

import org.springframework.boot.SpringApplication;

public class TestHftmApplication {

	public static void main(String[] args) {
		SpringApplication.from(HftmApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
