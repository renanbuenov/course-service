package renan.courseservice.service;

import org.springframework.stereotype.Service;
import renan.courseservice.model.Course;
import renan.courseservice.repository.CourseRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course saveCourse(Course course) {
        course.setCreateTime(LocalDateTime.now());
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);
    }

    @Override
    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }
}