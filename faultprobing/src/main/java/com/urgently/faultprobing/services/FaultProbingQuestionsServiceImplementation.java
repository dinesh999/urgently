package com.urgently.faultprobing.services;

import com.urgently.faultprobing.dto.request.CreateNodeRequest;
import com.urgently.faultprobing.dto.response.CreateNodeResponse;
import com.urgently.faultprobing.models.GraphNodeEntity;
import com.urgently.faultprobing.repository.GraphNodeRepository;
import com.urgently.faultprobing.serviceimplementations.FaultProbingQuestionsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FaultProbingQuestionsServiceImplementation implements FaultProbingQuestionsService {

    @Autowired
    private GraphNodeRepository graphNodeRepository;

    @Override
    public CreateNodeResponse createNode(CreateNodeRequest createNodeRequest) {
        CreateNodeResponse createNodeResponse = new CreateNodeResponse();
        try {
            GraphNodeEntity graphNodeEntity = new GraphNodeEntity();
            graphNodeEntity.setText(createNodeRequest.getText());
            graphNodeEntity.setType(createNodeRequest.getType());
            graphNodeEntity.setAction(createNodeRequest.getAction());
            graphNodeEntity.setNodeId(createNodeRequest.getNodeId());
            graphNodeRepository.save(graphNodeEntity);
            createNodeResponse.setSuccess(true);
        } catch(Exception e) {
            log.debug(e.getMessage(), e);
            createNodeResponse.setSuccess(false);
        }
        return createNodeResponse;
    }
}
