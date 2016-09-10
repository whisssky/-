
public class SelectSort {
	
	public static void sort(int []a){
		
		int n  = a.length;
		for(int i=0;i<n-1;i++){
			int min = a[i];
			int minIndex = i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<min)
				{
					min = a[j];
					minIndex = j;
				}
			}
			
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
					
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
