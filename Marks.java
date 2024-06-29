class Marks  
{ 
int pythonMarks;         
int CMarks; 
int CPPMarks; 
int JavaMarks; 
void input(int m1, int m2, int m3, int m4) 
{ 
pythonMarks = m1;         
CMarks = m2; 
CPPMarks = m3; 
JavaMarks = m4; 
} 
} 
class Average extends Marks 
{ 
int total; 
double aggregate; 
void calculate() 
{ 
total = pythonMarks + CMarks + CPPMarks + JavaMarks; 
aggregate = total / 4.0; 
} 
void display() 
{ 
System.out.println("Total = " + total); 
System.out.println("Aggregate = " + aggregate); 
} 
} 
class Grade extends Average 
{ 
void grade_display() 
 { 
         if (aggregate > 75)  
  { 
               System.out.println("DISTINCTION"); 
          }  
  else if (aggregate >= 60 && aggregate < 75)  
  { 
               System.out.println("First Division"); 
          }  
  else if (aggregate >= 50 && aggregate < 60)  
  { 
               System.out.println("Second Division"); 
         }  
  else if (aggregate >= 40 && aggregate < 50)  
  { 
               System.out.println("Third Division"); 
          }  
  else  
  { 
               System.out.println("Fail"); 
          } 
     } 
 public static void main(String[] args)  
 { 
  Grade obj=new Grade(); 
  obj.input(95,90,95,100); 
  obj.calculate(); 
  obj.display(); 
  obj.grade_display(); 
 } 
}