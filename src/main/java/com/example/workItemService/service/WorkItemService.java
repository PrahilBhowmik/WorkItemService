package com.example.workItemService.service;

import com.example.workItemService.entity.WorkItem;
import com.example.workItemService.repository.WorkItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WorkItemService {
    @Autowired
    private WorkItemRepository workItemRepository;

    public Flux<WorkItem> getAllWorkItems(){
        return workItemRepository.findAll();
    }
    public Mono<WorkItem> getWorkItemById(String id){
        return workItemRepository.findById(id);
    }

    public Flux<WorkItem> getAllByConfiguration(String configurationId){
        return workItemRepository.findAllByConfigurationId(configurationId);
    }

    public Mono<WorkItem> saveWorkItem(WorkItem workItem) {
        return workItemRepository.save(workItem);
    }

    public Mono<Void> deleteWorkItem(WorkItem workItem){
        return workItemRepository.delete(workItem);
    }
}
