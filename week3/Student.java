public class Student
{
    private double gpa;
    private String studentID;
    private String name;
    private int age;

    public Student(String name, String studentId, int age)
    {
       this.gpa = 0.0;
       this.name = name;
       this.studentID = studentID;
       this.age = age;
    }

    public static void main (String[] args)
    {
        Student Raymetro = new Student("Raymetro","672587",16);
        System.out.println(Raymetro);
    }
}