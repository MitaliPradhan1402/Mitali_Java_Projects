package entity;

import util.IdGenerator;

import java.time.LocalDate;
import java.util.*;

/*enum status {
            ACTIVE,COMPLETED,CANCELLED
           }*/
public class Enrollment {
           private int id;
    private int courseId;
    private int studentId;
    private LocalDate enrollmentDate;
    private boolean active;
    private String enrollmentStatus;

    public Enrollment(int courseId, int studentId){
        this.id = IdGenerator.getNextEnrollId();
        this.courseId=courseId;
        this.studentId=studentId;
        this.enrollmentDate=LocalDate.now();
        this.active=true;
        enrollmentStatus="ACTIVE";

    }
    public void setActive(Enrollment e){
        e.active=true;
    }

    public void setEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }



    public int getStudentId() {
        return studentId;
    }
}
