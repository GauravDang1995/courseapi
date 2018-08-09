package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String>

{
    //interface is used when we want to extend to a particular repository
    //getAllTopics()
    //getTopic(String id)
    //updateTopic(Course t)
    //deleteTopic(String id)
}
