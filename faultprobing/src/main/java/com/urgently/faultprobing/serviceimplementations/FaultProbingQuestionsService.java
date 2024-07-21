package com.urgently.faultprobing.serviceimplementations;

import com.urgently.faultprobing.dto.request.CreateNodeRequest;
import com.urgently.faultprobing.dto.response.CreateNodeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface FaultProbingQuestionsService {
    public CreateNodeResponse createNode(CreateNodeRequest createNodeRequest);
}
