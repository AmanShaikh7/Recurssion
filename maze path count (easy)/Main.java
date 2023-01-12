import java.io.*;
import java.util.*;


// total counts will be counts after recurssive call of 'h' and counts after recurssive call of 'v'
public class Main{
    static int countMazePath(int n, int m,int i,int j)
    {
		if(i>=n || j>=m){
			return 0;
		}
		if(i==n-1 && j==m-1){
			return 1;
		}
		int hcount = countMazePath(n,m,i,j+1);
		int vcount = countMazePath(n,m,i+1,j);
		int total = hcount +vcount ;
		return total;
        
    }
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n;
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println(countMazePath(n, m,0,0));
    }
}