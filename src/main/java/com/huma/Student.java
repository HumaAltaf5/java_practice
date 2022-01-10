package main.java.com.huma;

public class Student {
    private String name;
    private char grade;
    private int group;
    private String secretNickName = "MySecretNickName";

    Student(String name, char grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    private String getSecretNickName() {
        return secretNickName;
    }

    public char getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public char upGrade() {
        char[] upArray = {'A', 'B', 'C', 'D', 'E', 'F'};
        char newUpGrade = '\0';
        char currentGrade = getGrade();
        if (currentGrade == 'A') {
            System.out.println("Cannot upgrade grade A \n");
            newUpGrade =  currentGrade;
        } else if (currentGrade == 'B' || currentGrade == 'C' || currentGrade == 'D' || currentGrade == 'E' || currentGrade == 'F') {
            for (int i = 0; i <  upArray.length; i++) {
                if (currentGrade == upArray[i]) {
                    newUpGrade = upArray[i - 1];
                    System.out.println("The student is upgraded to " + newUpGrade + "\n");
                    return newUpGrade;
                }
            }

        }
        return newUpGrade;
    }

    public char downGrade() {
        char[] downArray = {'A', 'B', 'C', 'D', 'E', 'F'};
        char newDownGrade = '\0';
        char currentGrade = getGrade();
        if (currentGrade == 'F') {
            System.out.println("Cannot downgrade grade F \n");
            newDownGrade =  currentGrade;
        } else if (currentGrade == 'A' || currentGrade == 'B' || currentGrade == 'C' || currentGrade == 'D' || currentGrade == 'E') {
            for (int i = 0; i <  downArray.length; i++) {
                if (currentGrade == downArray[i]) {
                    newDownGrade = downArray[i + 1];
                    System.out.println("The student is downgraded to " + newDownGrade + "\n");
                    return newDownGrade;
                }
            }

        }
        return newDownGrade;
    }
}
