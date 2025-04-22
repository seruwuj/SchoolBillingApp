package com.jmtechnologies;

import javax.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String description;
    private int period;
    @ManyToOne
    private Topic topic;

    public Cours() {
    }
    public Cours (String id, String name, String description,String topicId){
        Super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId,"","");
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPeriod() {
        return period;
    }
    public void setPeriod(int period) {
        this.period = period;
    }
    
}
