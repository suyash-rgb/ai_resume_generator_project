package com.resumegenerator.backend.resume_ai_backend.service;

import java.io.IOException;

public interface IResumeService {

    String generateResumeResponse(String userResumeDescription) throws IOException;


}
