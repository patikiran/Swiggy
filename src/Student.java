public class Student{

    public String name;
    public String fatherName;

    public Student(String name, String fatherName) {
        this.name = name;
        this.fatherName = fatherName;
    }
    Student student = new Student("kirankumar","prabhakarrao");
    System.out.println(student);
}