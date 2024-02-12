package uk.ac.leedsbeckett.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uk.ac.leedsbeckett.student.model.Course;
import uk.ac.leedsbeckett.student.model.CourseRepository;

@Configuration
public class MiscellaneousBeans {
   @Bean
    CommandLineRunner initDatabase(CourseRepository courseRepository){
       return args -> {
           Course myCourse = new Course();
           myCourse.setTitle("CCD");
           myCourse.setDescription("Cloud Computing Development");
           myCourse.setFee(20.00);
           courseRepository.save(myCourse);
       };
   }
}
