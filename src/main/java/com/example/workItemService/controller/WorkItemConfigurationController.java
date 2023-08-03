package com.example.workItemService.controller;

import com.example.workItemService.entity.WorkItemConfiguration;
import com.example.workItemService.service.WorkItemConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/configuration")
public class WorkItemConfigurationController {
    @Autowired
    private WorkItemConfigurationService workItemConfigurationService;

    @GetMapping
    public Flux<WorkItemConfiguration> getAllWorkItemConfigurations(){
        return workItemConfigurationService.getAllWorkItemConfigurations();
    }

    @GetMapping("/{id}")
    public Mono<WorkItemConfiguration> getWorkItemConfigurationById(@PathVariable String id){
        return workItemConfigurationService.getWorkItemConfigurationById(id);
    }

    @PostMapping
    public Mono<WorkItemConfiguration> addWorkItemConfiguration(@RequestBody WorkItemConfiguration workItemConfiguration){
        return workItemConfigurationService.saveWorkItemConfiguration(workItemConfiguration);
    }

    @PutMapping
    public Mono<WorkItemConfiguration> updateWorkItemConfiguration(@RequestBody WorkItemConfiguration workItemConfiguration){
        return workItemConfigurationService.saveWorkItemConfiguration(workItemConfiguration);
    }

    @DeleteMapping
    public Mono<Void> deleteWorkItemConfiguration(@RequestBody WorkItemConfiguration workItemConfiguration){
        return workItemConfigurationService.deleteWorkItemConfiguration(workItemConfiguration);
    }
}
