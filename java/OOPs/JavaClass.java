class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("New data has been succefully added!");
    }
}

public class JavaClass {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 20);
    }   
}



// base class 
// derived class