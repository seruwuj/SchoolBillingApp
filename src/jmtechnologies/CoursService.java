package com.jmtechnologies;

import java.util.ArrayList;


@Service
public class CoursService {
@Autowired
private CourseRepository courseRepository;

public List<Course> getAllCourse(String topicId) {
List<Course>courses = new ArrayList<>();
courseRepository.findByTopicId(topicId)
.forEach(courses::add);
return courses;
}
public Course getCourse(String id){
return courseRepository.findOne(id);
}
public void addCourse(Course course){
  courseRepository.save(course);
}
public void updateCourse(Course course){
    courseRepository.save(course);
}
public void deleteCourse(String id){
    CourseRepository.delete(id);
}

}




