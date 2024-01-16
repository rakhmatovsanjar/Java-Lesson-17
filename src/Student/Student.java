package Student;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final int course;

    public Student(String firstName, String lastName, int age, int course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
    }

    public void showInfo(){
        System.out.println("Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}');
    }
}
