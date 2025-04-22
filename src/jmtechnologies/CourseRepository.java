package com.jmtechnologies;

import java.util.List;


public interface CourseRepository extends CrudRepository<Course,String> {

    public List<Course>findbyTopicId(String topicId);

}
