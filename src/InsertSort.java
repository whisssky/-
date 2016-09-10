
public class InsertSort {
	
	public static void sort(int a[]){
		int n = a.length;
		for(int i=1;i<n;i++){
			for(int j=i;(j>0)&&(a[j]<a[j-1]);j--){
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {1,3,45,346,2,4,2,5,356,4,758,96,9,879,76546,57,4};
		sort(a);
		for(int i:a)
		{
			System.out.println(i);
		}
	}


}
