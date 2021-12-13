package renan.courseservice.service;

import renan.courseservice.model.Course;

import java.util.List;

public interface CourseService {

    Course saveCourse(Course course);

    void deleteCourse(Long courseId);

    List<Course> findAllCourses();
}