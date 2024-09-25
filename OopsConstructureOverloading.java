public class OopsConstructureOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rohan");
        Student s3 = new Student(12345);
        //Student s4 = new Student("Sohan", 67890);  //This will give error because no such constructure exist where 1st parameter is String and 2nd parameter is int
    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("constructure is called...");
    }

    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}
