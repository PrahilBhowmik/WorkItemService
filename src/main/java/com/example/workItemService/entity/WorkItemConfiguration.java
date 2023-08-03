package com.example.workItemService.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;


@Document
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class WorkItemConfiguration {
    @Id
    String id;
    String name;
    HashMap<String,Object> additionalFields;
    Integer itemCount;
}
