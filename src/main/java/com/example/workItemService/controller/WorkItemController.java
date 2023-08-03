package com.example.workItemService.controller;

import com.example.workItemService.entity.WorkItem;
import com.example.workItemService.service.WorkItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/workitem")
public class WorkItemController {
    @Autowired
    private WorkItemService workItemService;

    @GetMapping
    public Flux<WorkItem> getAllWorkItems(){
        return workItemService.getAllWorkItems();
    }

    @GetMapping("/{id}")
    public Mono<WorkItem> getWorkItemById(@PathVariable String id){
        return workItemService.getWorkItemById(id);
    }

    @GetMapping("/configuration={id}")
    public Flux<WorkItem> getWorkItemsByConfiguration(@PathVariable String id){
        return workItemService.getAllByConfiguration(id);
    }

    @PostMapping
    public Mono<WorkItem> addWorkItem(@RequestBody WorkItem workItem){
        return workItemService.saveWorkItem(workItem);
    }

    @PutMapping
    public Mono<WorkItem> updateWorkItem(@RequestBody WorkItem workItem){
        return workItemService.saveWorkItem(workItem);
    }

    @DeleteMapping
    public Mono<Void> deleteWorkItem(@RequestBody WorkItem workItem){
        return workItemService.deleteWorkItem(workItem);
    }
}
