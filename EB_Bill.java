class EB_Bill 
{ 
  
 int cno; 
 String cname; 
 int pmr; 
 int cmr; 
 int u; 
 double amt=0.0; 
 void get(int consumerno, String consumername, int previousmonthreading, int 
currentmonthreading) 
 { 
  cno=consumerno; 
  cname=consumername; 
  pmr=previousmonthreading; 
  cmr=currentmonthreading; 
 } 
 void cal() 
 { 
  u=cmr-pmr; 
  System.out.println("Consumer Number = "+cno); 
  System.out.println("Consumer Name = "+ cname); 
  System.out.println("Previous Month Reading = "+pmr); 
  System.out.println("Current Month Reading = "+cmr); 
  System.out.println("Unit used this month = "+u); 
 } 
 void tariff() 
 { 
  if(u<=100) 
  { 
   amt=u*1.0; 
   System.out.println("Amount="+amt); 
  } 
  else if(u>=101&&u<=200) 
  { 
   amt=u*2.50; 
   System.out.println("Amount="+amt); 
  } 
  else if(u>=201&&u<=500) 
  { 
   amt=u*4.0; 
   System.out.println("Amount="+amt); 
  } 
  else if(u>=501) 
  { 
   amt=u*6.0; 
   System.out.println("Amount="+amt); 
  } 
  else 
  { 
   System.out.println("invalid input"); 
  } 
 } 
 public static void main(String[]args) 
 { 
  EB_Bill obj=new EB_Bill(); 
  obj.get(100201,"Hema",1850,2550); 
  obj.cal(); 
  obj.tariff(); 
 } 
} 