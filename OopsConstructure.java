public class OopsConstructure {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya Kumar");  //making a Student object 's1' with the help of 'Student()' constructure and initialize a property 'name'
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int roll;

    Student(String name){  //create a constructure
        this.name = name;  //initialization of properties
        // System.out.println();

        System.out.println("Constructure is called..."); //we can also do some other work in Constructure rather than initializing a property
    }
}