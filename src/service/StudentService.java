package service;

import entity.Student;
import exception.EntityNotFoundException;
import exception.InvalidInputException;
import util.IdGenerator;
import util.InputValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StudentService {

    private final List<Student> students = new ArrayList();

    public  void addStudent(Student s) {

        students.add(s);
        System.out.println(students.toString());
        System.out.println("Student added successfully");
    }



    public  void removeStudent(Student s) throws EntityNotFoundException {

        try {

            int index = students.indexOf(s);

            if (students.contains(s)) {
                s.setDeActive(s);
            }
            System.out.println(students.get(index).toString());
            System.out.println("Student removed successfully");
        } catch (InvalidInputException e) {
            System.out.println(" Student ID doesnt exist/Invalid input"+e.getMessage());

        }
    }
    public  void listStudents() {

        System.out.println("Display all Students");
        System.out.println(students.toString());

    }

    public  void searchStudent(int id) throws EntityNotFoundException {

    try {
                 for (Student s : students) {
                         if (s.getId() == id) {
                            System.out.println("Student with id" + id + "found");
                            System.out.println(students.get(students.indexOf(s)).toString());
                         }
                 }



    } catch (RuntimeException e) {
        System.out.println("No Student found");
    throw new EntityNotFoundException(e.getMessage());

}

    }

    public  void updateStudent(int id, String firstName,String lastName, String email) {

        for (Student s : students) {
            if (s.getId() == id) {

                if (firstName != null) {
                    s.setFirstName(firstName);
                }
                if (lastName != null) {
                    s.setLastName(lastName);
                }
                if(email !=null)
                {
                    s.setEmail(email);
                }
            }
         System.out.println("Students updated ");

        }

    }
}
