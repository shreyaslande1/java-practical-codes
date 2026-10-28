class Student {
    int rollno;
    String name;
    String branch;
    float percentage;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public void input1(String b) {
        branch = b;
    }

    public void input2(float p) {
        percentage = p;
    }

    public void display() {
        System.out.println("Name = " + name + " Roll No = " + rollno + " Branch = " + branch + " Percentage = " + percentage);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student s1 = new Student(62, "uday");
        Student s2 = new Student(59, "shreyas");
        Student s3 = new Student(63, "yash");

        s1.input1("IT");
        s1.input2(62.5f);
        s2.input1("AI");
        s2.input2(89.91f);
        s3.input1("TX");
        s3.input2(62.91f);

        s1.display();
        s2.display();
        s3.display();
    }
}