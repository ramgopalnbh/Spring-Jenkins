package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		log.info("Test cases executing......");
		System.out.println("Test cases executing......");
		assertEquals(true, true);
	}

}
