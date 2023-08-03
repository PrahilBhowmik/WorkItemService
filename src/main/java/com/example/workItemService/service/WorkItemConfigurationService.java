package com.example.workItemService.service;

import com.example.workItemService.entity.WorkItemConfiguration;
import com.example.workItemService.repository.WorkItemConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WorkItemConfigurationService {
    @Autowired
    private WorkItemConfigurationRepository workItemConfigurationRepository;

    public Flux<WorkItemConfiguration> getAllWorkItemConfigurations(){
        return workItemConfigurationRepository.findAll();
    }
    public Mono<WorkItemConfiguration> getWorkItemConfigurationById(String id){
        return workItemConfigurationRepository.findById(id);
    }

    public Mono<WorkItemConfiguration> saveWorkItemConfiguration(WorkItemConfiguration workItemConfiguration) {
        return workItemConfigurationRepository.save(workItemConfiguration);
    }

    public Mono<Void> deleteWorkItemConfiguration(WorkItemConfiguration workItemConfiguration){
        return workItemConfigurationRepository.delete(workItemConfiguration);
    }
}