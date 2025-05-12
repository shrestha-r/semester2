public class Public {
    public static void main(String args[]){
        System.out.println(("Hello World is the first program I am testing to Java."));
        People person1 = new People("Sandesh Kumar",32);
        person1.introduce();
    }
}

class People{
    String name;
    int age;
    
   People(String n, int a){
     name = n;
     age = a;
   }
   void introduce(){
    System.out.println("My name is "+ name+" I am "+age+ " years old.");
   }
}





