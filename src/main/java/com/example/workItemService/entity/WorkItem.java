package com.example.workItemService.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class WorkItem {
    @Id
    String id;
    String configurationId;
    String name;
    String type;
    ArrayList<Object> additionalFields;
}
