package com.example.workItemService.repository;

import com.example.workItemService.entity.WorkItem;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface WorkItemRepository extends ReactiveMongoRepository<WorkItem,String>{
    @Query
    Flux<WorkItem> findAllByConfigurationId(String configurationId);
}
