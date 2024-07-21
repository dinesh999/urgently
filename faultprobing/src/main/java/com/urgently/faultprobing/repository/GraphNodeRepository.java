package com.urgently.faultprobing.repository;

import com.urgently.faultprobing.models.GraphNodeEntity;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphNodeRepository extends Neo4jRepository<GraphNodeEntity, String> {
}
