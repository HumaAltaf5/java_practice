package main.java.com.huma;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Student 1:");
        Student st1 = new Student ("Pam", 'B', 2);
        System.out.println("Student name is " + st1.getName());
        System.out.println("Student grade is " + st1.getGrade());
        System.out.println("Requesting upgrade :  ");
        st1.upGrade();

        System.out.println("Student 2:");
        Student st2 = new Student ("Sam", 'C', 1);
        System.out.println("Student name is " + st2.getName());
        System.out.println("Student grade is " + st2.getGrade());
        System.out.println("Requesting downgrade :  ");
        st2.downGrade();

        System.out.println("Student 3:");
        Student st3 = new Student ("Jane", 'A', 4);
        System.out.println("Student name is " + st3.getName());
        System.out.println("Student grade is " + st3.getGrade());
        System.out.println("Requesting upgrade :  ");
        st3.upGrade();

        System.out.println("Student 4:");
        Student st4 = new Student ("Jim", 'F', 3);
        System.out.println("Student name is " + st4.getName());
        System.out.println("Student grade is " + st4.getGrade());
        System.out.println("Requesting downgrade :  ");
        st4.downGrade();
    }
}
