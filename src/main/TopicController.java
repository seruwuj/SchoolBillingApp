import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
    
   @RestController

public class TopicController {
 
    @RequestMapping("/topics")
    public list<Topic>getAllTopics(){
        return Arrays.asList(
        new Topic("spring","spring Framework","spring Framework Description"),
        new Topic("java","core java","core java Description"),
        new Topic("javascript","javascript","javascript Description")
        );
    }
}
