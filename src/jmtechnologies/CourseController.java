import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

   @RestController
public class CourseController {

    @Autowired
    private CourseService CourseService;
 
    @RequestMapping("/topics/{id}/courses")
    public List<Course>getAllCourses(@PathVariable String id){
        return courseService.getAllCourses(id);
    }
    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id){
        return courseService.getCourse(id);
    }
    @RequestMapping(method =RequestMethod.POST,value = "/topics/{topicId}/courses")
    public void addCourse (@RequestBody Course course,@PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }
    @RequestMapping(method =RequestMethod.put,value = "/topics/{topicId}/courses/{id}")
    public void updateCourse (@RequestBody Course course,@PathVariable String topicId,@PathVariable String id){
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }
    @RequestMapping(method =RequestMethod.DELETE,value = "/topics/{topicId}/courses/{id}")
    public void deleteTopic (@PathVariable String id){
        courseService.deleteCourse(id);
  }
}