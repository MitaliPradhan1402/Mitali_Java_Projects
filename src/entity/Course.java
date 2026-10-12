package entity;


import util.IdGenerator;

public class Course {



    private int courseId;
    private String courseName;
    private String description;
    private int durationInWeeks;
    private boolean active;


    public Course( String courseName, String description,int durationInWeeks ){

        this.courseName=courseName;
        this.description=description;
        this.durationInWeeks=durationInWeeks;
        this.active=true;
        this.courseId=IdGenerator.getNextCourseId();

    }


    public void setActive(Course c){
        c.active=true;
    }

    public void setDeActive(Course c){
        c.active=false;
    }





}
