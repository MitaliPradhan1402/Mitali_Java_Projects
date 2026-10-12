package service;

import entity.Course;

import exception.EntityNotFoundException;
import exception.InvalidInputException;
import util.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class CourseService {

    private final List<Course> courses = new ArrayList();

    public  void addCourse(Course c) {

        courses.add(c);
       // c.setActive(c);
        System.out.println(courses.toString());
        System.out.println("Course added successfully");
    }

    public  void listCourses() {

        System.out.println("Display all Courses");
        System.out.println(courses.toString());
    }

    public  void removeCourse(Course c) {

        try {
            int index = courses.indexOf(c);

            if (courses.contains(c)) {
                c.setDeActive(c);
            }
            System.out.println(courses.get(index).toString());
            System.out.println("Course removed successfully");
        } catch (EntityNotFoundException e) {
            System.out.println("Course not found "+e.getMessage());
        }
        catch (InvalidInputException e) {
            System.out.println("Invalid course "+e.getMessage());
        }
    }
    public  void activateCourse(Course c) {

        if (courses.contains(c)) {
            c.setActive(c);
        }
        System.out.println("Course activated successfully");
    }
    }

