package entity;

import util.IdGenerator;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    /*public int setId() {
        this.id = IdGenerator.getNextStudentId();
        return this.id;
    }*/

    public Person ( String firstName, String lastName, String email)
    {
        this.id=IdGenerator.getNextStudentId();
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;


    }
    public Person (String firstName,String lastName)
    {
        //this.id = id;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name='" + this.firstName + this.lastName + "', email=" + this.email + " ";
    }
}
