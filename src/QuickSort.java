public class QuickSort {

	public static int partition(int[] a, int low, int high) {

		int val = a[low];

		while (low < high) {
			while (low < high && a[high] >= val)
				high--;
			if (low < high) {
				a[low] = a[high];
				low++;
			}
			while (low < high && a[low] <= val)
				low++;
			if (low < high) {
				a[high] = a[low];
				high--;
			}
		}
		a[low] = val;

		return low;


	}
	public static void sort(int a[],int low,int high){
		int mid;
		if(low<high)
		{
			mid = partition(a, low, high);
			sort(a, low, mid-1);
			sort(a, mid+1, high);
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1,3,45,346,2,4,2,5,356,4,758,96,9,879,76546,57,4};
		sort(a,0,a.length-1);
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
