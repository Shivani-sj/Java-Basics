public class Student{
String name;
String dept;
int age;
void display(){
System.out.println("Name: "+name);
System.out.println("Department: "+dept);
System.out.println("Age: "+age);
}
public static void main(String [] args){
Student s1=new Student();
s1.name="Jeevan";
s1.dept="CSE";
s1.age=20;
s1.display();
}
}