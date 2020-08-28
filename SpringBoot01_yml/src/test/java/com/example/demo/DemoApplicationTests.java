package com.example.demo;

import com.example.demo.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	Person person;

	@Autowired
	ApplicationContext ioc;

	@Test
	public void testHelloService(){
		boolean helloService = ioc.containsBean("helloService01");
		System.out.println(helloService);
	}

	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
