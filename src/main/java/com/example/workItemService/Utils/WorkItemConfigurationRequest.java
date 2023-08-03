package com.example.workItemService.Utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@AllArgsConstructor
@Getter
public class WorkItemConfigurationRequest {
    private String name;
    private HashMap<String,Object> additionalFields;
}
