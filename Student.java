class Student 
{ 
String name; 
int regno; 
int total; 
double average; 
int m1,m2,m3,m4,m5; 
Student(String student_name,int number,int a,int b,int c,int d,int e) 
 { 
  name=student_name; 
  regno=number; 
  m1=a; 
  m2=b; 
  m3=c; 
  m4=d; 
  m5=e; 
 } 
 void calculate() 
 { 
   total=(m1+m2+m3+m4+m5); 
   average=total/5; 
 } 
 void display() 
 { 
  System.out.println("Name:"+name); 
  System.out.println("Reg.No:"+regno); 
  System.out.println("Mark1:"+m1); 
  System.out.println("Mark2:"+m2); 
  System.out.println("Mark3:"+m3); 
  System.out.println("Mark4:"+m4); 
  System.out.println("Mark5:"+m5); 
  System.out.println("Average of above marks:"+average); 
 } 
 public static void main(String[] args) 
 { 
           Student obj=new Student("Vijaya Lakshmi",19210200,90,80,85,90,99); 
           obj.calculate(); 
           obj.display(); 
 } 
} 