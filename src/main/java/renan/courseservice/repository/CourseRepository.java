package renan.courseservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import renan.courseservice.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
