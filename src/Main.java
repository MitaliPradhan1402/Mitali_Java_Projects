import entity.Course;
import entity.Enrollment;
import entity.Student;
import exception.InvalidInputException;
import service.CourseService;
import service.EnrollmentService;
import service.StudentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    Scanner sc= new Scanner(System.in);
    int userInput=0;

    //Input objects
    Student s1= new Student("Priya","Das",12);
    Student s2= new Student("Amit","Deo", "amit@yahoo.com",12);
    Student s3= new Student("Priyanka","Dalvi",13);
    Student s4= new Student("Sumit","Pradhan",13);
    Student s5= new Student("Mitali","Pradhan",11);

    Course c1= new Course ("Java","Backend",6);
    Course c2= new Course ("Python","Backend",8);
    Course c3= new Course ("React","Frontend",10);


    Enrollment e1=new Enrollment(1,1);
    Enrollment e2=new Enrollment(1,2);
    Enrollment e3=new Enrollment(2,3);
    Enrollment e4=new Enrollment(2,4);
    Enrollment e5=new Enrollment(3,5);



 //SErvice class objects
    StudentService studentService= new StudentService();
    CourseService courseService= new CourseService();
    EnrollmentService enrollmentService= new EnrollmentService();

    do {
        System.out.println("Student & Course Management System");
        System.out.println("1. Add New Student");
        System.out.println("2. Display all Students");
        System.out.println("3. Remove Student");
        System.out.println("4. Search Student by id");
        System.out.println("5. Add new Course");
        System.out.println("6. View all courses");
        System.out.println("7. Activate existing Course");
        System.out.println("7. Remove Course");
        System.out.println("8. Add new enrollment");
        System.out.println("9. View all Course enrollments");
        System.out.println("10. Activate enrollment status");
        System.out.println("11. Deactivate enrollment status");
        System.out.println("12. Exit");
        try {
            System.out.println("Enter Menu Option in number format(1 to 12) ");
            userInput = sc.nextInt();
        }catch (InvalidInputException e)
        {
            System.out.println("Invalid input. This menu option doesnt exists. Pls reenter"+e.getMessage());
        }
        switch (userInput) {
            case 1:
                studentService.addStudent(s1);
                studentService.addStudent(s2);
                studentService.addStudent(s3);
                break;
            case 2:
                studentService.listStudents();
                break;
            case 3:
                studentService.removeStudent(s1);
                break;
            case 4:
                studentService.searchStudent(1);
                break;
            case 5:
                courseService.addCourse(c1);
                break;
            case 6:
                courseService.listCourses();
                break;
            case 7:
                courseService.removeCourse(c1);
                break;
            case 8:
                enrollmentService.enroll(e1);
                break;
            case 9:
                enrollmentService.getAllEnrollments();
                break;
            case 10:
                enrollmentService.activateEnrollment(e2);
                break;
            case 11:
                enrollmentService.markEnrollmentStatus(e3, "Cancelled");
                break;
            case 12:
                return;
            default: {
                System.out.println("Thank you ! ");
            }
            break;


        }

    } while(userInput!=12);

}
