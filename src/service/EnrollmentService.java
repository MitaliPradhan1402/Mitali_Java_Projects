package service;

import entity.Course;
import entity.Enrollment;
import entity.Student;
import exception.EntityNotFoundException;
import util.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentService {


    private final List<Enrollment> enrollments = new ArrayList();

    public  void enroll(Enrollment e){

        enrollments.add(e);
        System.out.println(enrollments.toString());
        System.out.println("Enrollments added successfully");

    }

    public  void getAllEnrollments(){

        System.out.println("Display all Enrollments");
        System.out.println(enrollments.toString());


    }

    public  void getEnrollment(int studentId) {
        try {
            for (Enrollment e : enrollments) {
                if (e.getStudentId() == studentId) {
                    System.out.println("Enrollment with id" + studentId + "found");
                    System.out.println(enrollments.get(enrollments.indexOf(e)).toString());
                }
            }
        }catch(EntityNotFoundException e){
                System.out.println("Enrollment not found"+e.getMessage());
            }


    }


    public  void activateEnrollment(Enrollment e) {

        if (enrollments.contains(e)) {
            e.setActive(e);
        }
    }

    public  void markEnrollmentStatus(Enrollment e, String status){
        e.setEnrollmentStatus(status);
    }
}
