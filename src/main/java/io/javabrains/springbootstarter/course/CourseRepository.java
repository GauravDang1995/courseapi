package io.javabrains.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String>

{

    //interface is used when we want to extend to a particular repository
    public List<Course> findByTopicId(String topicId);
  //  public List<Course> findByDescription(String foo);
}
