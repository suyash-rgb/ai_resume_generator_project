package com.resumegenerator.backend.resume_ai_backend;

import com.resumegenerator.backend.resume_ai_backend.service.IResumeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class ResumeAiBackendApplicationTests {

	@Autowired
	private IResumeService iResumeService;

	@Test
	void contextLoads() throws IOException {
		iResumeService.generateResumeResponse("I am Suyash Baoney with 2 year of Java experience.");
	}

}
