package io.dc.models;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Node
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue
    private long id;
    private String code;
    private String title;
    private String teacher;
}
