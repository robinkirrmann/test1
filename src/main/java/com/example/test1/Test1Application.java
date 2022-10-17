package com.example.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class Test1Application {

	public static void main(String[] args) {


		SpringApplication.run(Test1Application.class, args);
		int ergebnis = 3+4;
		System.out.println(ergebnis);
	}






}
