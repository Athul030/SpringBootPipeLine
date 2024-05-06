package com.example.demo;

import com.example.demo.entity.Item;
import com.example.demo.repo.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	private final ItemRepository itemRepository;

	public void run(String... args) throws Exception {
		itemRepository.save(new Item(null,"Item 1"));
		itemRepository.save(new Item(null,"Item 2"));
	}

}
