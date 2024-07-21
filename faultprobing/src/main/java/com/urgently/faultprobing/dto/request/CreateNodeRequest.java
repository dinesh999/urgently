package com.urgently.faultprobing.dto.request;

import lombok.Data;

import org.springframework.data.neo4j.core.schema.Property;

import javax.validation.constraints.NotNull;

@Data
public class CreateNodeRequest {

    @NotNull(message = "nodeid cannot be null")
    String nodeId;

    @NotNull(message = "Text cannot be null")
    String text;

    @NotNull(message = "Type cannot be null")
    String type;

    @NotNull(message = "Action cannot be null")
    String action;
}
