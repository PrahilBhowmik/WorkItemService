package com.example.workItemService.repository;

import com.example.workItemService.entity.WorkItemConfiguration;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkItemConfigurationRepository extends ReactiveMongoRepository<WorkItemConfiguration,String>{
}