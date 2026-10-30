public class Calculator{
int a;
int b;
int add(int a, int b){
return a+b;
}
int sub(int a, int b){
return a-b;
}
int multi(int a, int b){
return a*b;
}
double div(int a, int b){
return a/b;
}
public static void main(String [] args){
Calculator c1=new Calculator();
int Addition=c1.add(8,2);
int Subtraction=c1.sub(8,2);
int Multiplication=c1.multi(8,2);
double Division=c1.div(8,2);
System.out.println(Addition);
System.out.println(Subtraction);
System.out.println(Multiplication);
System.out.println(Division);
}
}

