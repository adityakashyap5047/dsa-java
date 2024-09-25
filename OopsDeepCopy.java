public class OopsDeepCopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.roll = 123;
        s1.setPass("abcd");
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        s1.marks[3] = 91;

        Student s2 = new Student(s1); //copy
        s2.setPass("xyz");

        s1.name = "Aditya Kumar";
        s1.roll = 456;

        s1.marks[2] = 95;

        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s1.getPass());
        System.out.println(s2.getPass());
        for (int i = 0; i < 4; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    private String password;
    int marks[] = new int[4];

    void setPass(String password){
        this.password = password;
    }

    String getPass(){
        return password;
    }

    //Deep copy constructure
    Student(Student std){
        this.name = std.name;
        this.roll = std.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = std.marks[i];
        }
    }     

    Student(){
        System.out.println("constructure is called...");
    }
}
