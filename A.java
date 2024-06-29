import java.util.*;
public class A{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int a = sc.nextInt();
	if(a>18){
		System.out.println("Eligible");
	}
	else{
		int b=(18-a);
		System.out.println("Not Eligible, eligible after "+b);
	}
        sc.close();
    }
}
