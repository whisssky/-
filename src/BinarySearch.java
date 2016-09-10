
public class BinarySearch {
	
	public static int search(int[] a,int start,int end,int val){
		if(a==null)
			return -1;

		while(start<=end){
			int mid = (start+end)/2;

			if(a[mid]==val)
				return mid;
			
			if(a[mid]>val)
				end = mid-1;
			else if(a[mid]<val)
				start = mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = {-4,5,6,8,11,56,899,1441,4333,6555,6778};
		int index  = search(a,0,a.length-1,56);
		System.out.println(index);
	}

}
