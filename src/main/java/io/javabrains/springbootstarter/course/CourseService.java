package io.javabrains.springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private io.javabrains.springbootstarter.course.CourseRepository courseRepository;


//    private List<Course> topics= new ArrayList<>(Arrays.asList(
//
//            new Course("spring","Spring Framework","Spring Framework Description"),
//            new Course("Java","Core Java","Core Java Description"),
//            new Course("javascript","Javascript","Javascript Description")
//    ));

    public CourseService(io.javabrains.springbootstarter.course.CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses(String topicId)
    {

        List<Course> courses =new ArrayList<>();
        courseRepository.findByTopicId(topicId)
                .forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id)

    {

      //  return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course course)
    {
      courseRepository.save(course);
       // topics.add(course);
    }

    public void updateCourse(Course course) {

//        for (int i=0;i<topics.size();i++)
//        {
//            Course t=topics.get(i);
//            if(t.getId().equals(id))
//            {
//                topics.set(i,course );
//                        return;
//            }
//        }
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
       // topics.removeIf(t -> t.getId().equals(id));

        courseRepository.deleteById(id);
    }
}
