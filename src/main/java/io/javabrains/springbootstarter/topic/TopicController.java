package io.javabrains.springbootstarter.topic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//import org.springframework.beans.factory.annotation.Value;
//import java.lang.reflect.Method;
//import java.util.Arrays;

@RestController
public class TopicController {
    @Autowired
    private io.javabrains.springbootstarter.topic.TopicService topicService;

    //
    @RequestMapping("/topics")
    public List<io.javabrains.springbootstarter.topic.Topic> getAllTopics()
    {

        return topicService.getAllTopics();
    }
    @RequestMapping("/topics/{id}")
    public io.javabrains.springbootstarter.topic.Topic getTopic(@PathVariable String id)
    {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody io.javabrains.springbootstarter.topic.Topic topic)
    {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void updateTopic(@RequestBody io.javabrains.springbootstarter.topic.Topic topic, @PathVariable String id)
    {
        System.out.println("hello in put");
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id)
    {
        topicService.deleteTopic(id);
    }

}
