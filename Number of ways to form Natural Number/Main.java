import java.io.*;
import java.util.*;
public class Main {
    public static long ways(int sum, int ld){
		if(sum==0){
			return 1;
		}
		long ans = 0;

		for(int i=ld+1; i<=sum; i++){
			long smallAns = ways(sum - i, i);
			ans = ans + smallAns;
		}

		return ans;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(ways(n, 0));
    }
}