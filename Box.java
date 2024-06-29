class Box  
{ 
    double width; 
    double height; 
    double depth; 
    Box() 
    { 
        width = 10.5; 
        height = 20.5; 
        depth = 5.5; 
    } 
    void volume()  
    { 
        double v= width * height * depth; 
 System.out.print("Volume of Box = "+v); 
    } 
public static void main(String[] args)  
{ 
Box myBox = new Box(); 
myBox.volume(); 
} 
} 