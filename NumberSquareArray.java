import java.util.*;
import java.lang.Math;
class king{
public static void main(String arg[]){
	int i,j,k,n,m,a;
	int arr[][] = new int[100][100];
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the lower range:");
	m = s.nextInt();
	System.out.print("Enter the upper range:");
	n = s.nextInt();
	k = n-m+1;
	for(i=0;i<k;i++){
	arr[i][0] = m;
	m++;
	}
	for(i=0;i<n;i++){
	a = arr[i][0];
	arr[i][1] = (int)Math.pow(a, 2);
	}
	for(i=0;i<k;i++){
			System.out.println("("+arr[i][0]+","+arr[i][1]+")");
	}
}
}