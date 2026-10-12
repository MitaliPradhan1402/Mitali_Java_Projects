package entity;

public class Student extends Person {

    private int batch;
    private boolean active;

    public Student( String firstName, String lastName, String email,int batch){

        super(firstName,lastName,email);
        this.batch=batch;
        this.active=true;

    }

    public Student( String firstName, String lastName,int batch){

        super(firstName,lastName);
        this.batch=batch;
        this.active=true;

    }

    @Override
    public String toString() {
        return (super.toString()+" "+"Status:" +this.active);

    }

    public void setActive(Student s){
        s.active=true;
    }

    public void setDeActive(Student s){
        s.active=false;
    }






}
