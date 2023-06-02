package com.rhd.learning.learningbeans;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rhd.learning.learningbeans.domain.Company;

@SpringBootTest
class LearningbeansApplicationTests {

	

	@Test
	void isIocWorking(){
		ApplicationContext context =  new AnnotationConfigApplicationContext(Config.class);
		Company company = context.getBean("company", Company.class);
		ConfigurableApplicationContext config = (ConfigurableApplicationContext) context;
		config.close();
		assertEquals("High Street", company.getAddress().getStreet());
	}

}
