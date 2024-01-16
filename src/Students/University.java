package Students;

public class University {
    private final String name;
    private final String location;

    public University(String name, String location) {
        this.name = name;
        this.location = location;
    }

    class Student {
        private final String firstName;
        private final String lastName;
        private final int course;

        public Student(String firstName, String lastName, int course) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.course = course;
        }

        public void showInfo() {
            System.out.println(location + "da joylashgan " + name + " universitut " + course + "-kurs talabasi:");
            System.out.println(firstName + " " + lastName);
        }
    }
}
