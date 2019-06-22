package com.yuussef.pagination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.yuussef.pagination.repository.PostRepository;

@SpringBootApplication
@EnableJpaAuditing
public class PaginationApplication {
	private static PostRepository postRepository;
	public static void main(String[] args) {
		SpringApplication.run(PaginationApplication.class, args);
		
	}

}
