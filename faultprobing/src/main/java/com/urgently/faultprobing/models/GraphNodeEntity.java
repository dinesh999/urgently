package com.urgently.faultprobing.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

import javax.swing.*;

@Node
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GraphNodeEntity {
    @Id
    @GeneratedValue
    String id;

    @Property("key")
    String nodeId;

    @Property("text")
    String text;

    @Property("type")
    String type;

    @Property("action")
    String action;

    @Property("service_details_displayable")
    boolean serviceDetailsDisplayable;

    @Property("retrieve_service_details")
    boolean retrieveServiceDetails;

    @Property("service_id")
    String serviceId;

    @Property("auto_choice_type")
    String autoChoiceType;

    @Property("service_code")
    String serviceCode;
}
