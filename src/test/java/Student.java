public class Student {
    String name;
    int age;

    public void output() {
        System.out.println(" student name : " + name);
        System.out.println(" student age : " + age);
    }
    Student(String name,int age ){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Student d=new Student("Hima sekhar",26);
        Student d1=new Student("Roman",36);
        Student d2=new Student("teja",23);

        d.output();
        d1.output();
        d2.output();
    }
}
/*Simple Points to Say

I created a Student class with two instance variables: name and age.

I used a constructor to initialize these variables when creating an object.

I added an output() method to print the student details.

In the main() method, I created three objects of Student with different values.

For each object, I called the output() method to display the student’s name and age.

The program demonstrates object creation, constructor usage, and method calling in Java.

👉 This way, you’re showing the interviewer that you understand:

Class & Object

Constructor

Method

Printing object data*/