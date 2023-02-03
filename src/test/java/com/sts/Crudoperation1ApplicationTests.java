package com.sts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sts.Entity.MarketingApp;
import com.sts.RepositoryLayer.Repository;

@SpringBootTest
class Crudoperation1ApplicationTests {

	@Autowired
	Repository repository;
	@Test
	void saveData() {
		MarketingApp m=new MarketingApp();
		m.setName("Biswajit");
		m.setCourse("java");
		m.setFees(1000);
		
		repository.save(m);
	}

}
