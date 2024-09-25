public class OopsParameterizedConstructure {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya kumar");
        System.out.println(s1.name);
    }
}

class Student{
    String name;
    int roll;

    Student(String name){
        this.name = name;
        System.out.println("Hii, I am within the Parameterized Constructure and I execute first");
    }
}