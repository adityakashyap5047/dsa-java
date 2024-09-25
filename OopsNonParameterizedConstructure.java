public class OopsNonParameterizedConstructure {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("Hii, I am within the Non-parameterized Constructure");
    }
}
