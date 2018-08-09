package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


//    private List<Course> topics= new ArrayList<>(Arrays.asList(
//
//            new Course("spring","Spring Framework","Spring Framework Description"),
//            new Course("Java","Core Java","Core Java Description"),
//            new Course("javascript","Javascript","Javascript Description")
//    ));

    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public List<Topic> getAllTopics()
    {

        List<Topic> topics =new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id)

    {

      //  return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic)
    {
        topicRepository.save(topic);
       // topics.add(course);
    }

    public void updateTopic(String id, Topic topic) {

//        for (int i=0;i<topics.size();i++)
//        {
//            Course t=topics.get(i);
//            if(t.getId().equals(id))
//            {
//                topics.set(i,course );
//                        return;
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
       // topics.removeIf(t -> t.getId().equals(id));

        topicRepository.deleteById(id);
    }
}
