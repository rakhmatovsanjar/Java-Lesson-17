package Students;

public class Main {
    public static void main(String[] args) {
        University university = new University("TATU Qarshi filiali", "Qarshi");
        University.Student student1 = university.new Student("Sanjar", "Rahmatov", 3);
        University.Student student2 = university.new Student("Shaxzod", "Sheravatov", 3);
        student1.showInfo();
        student2.showInfo();
    }
}
