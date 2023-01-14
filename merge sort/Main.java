import java.util.*;
import java.io.*;

// faith that spilt the array in two and both the arrays will be sorted now just merge both the arrays and you have your result ! 
class Solution {
	public static void mergeSortedArrays(int arr[],int left , int mid , int right ){
		int si = left;
		int sesi = mid+1;
		int ei1 = mid;
		int ei2 = right;
		int k   = 0;
		int ans[] = new int[right - left +1];

		while(si<=ei1 && sesi <=ei2){
			if(arr[si] < arr[sesi]){
				ans[k] = arr[si];
				si++;
			}else{
				ans[k] = arr[sesi];
				sesi++;
			}
			k++;
		}
		while(si<=ei1){
			ans[k] = arr[si];
			si++;
			k++;
		}
		while(sesi<=ei2){
			ans[k] = arr[sesi];
			sesi++;
			k++;
		}
		k=0;
		for(int idx =left;idx<=right;idx++,k++){
			arr[idx] = ans[k];
		}
	}
public static void mergeSort(int[] arr,int l,int r){
	
	if(l==r){
		return;
	}
	int mid = (l+r)/2;
	mergeSort(arr,l,mid);
	mergeSort(arr,mid+1,r);
	mergeSortedArrays(arr, l,mid,r);
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for(int i= 0; i < n; i++)
            a[i] = input.nextInt();
        Solution Obj = new Solution();
        Obj.mergeSort(a,0,n-1);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}