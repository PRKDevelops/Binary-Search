
package array;
public class new_array {
	public static int BinarySearch(int numbers[], int key){
		int start = 0, end = numbers.length-1;
		
		while(start <= end) {
			int mid = (start+ end)/2;
			
			if(numbers[mid] == key) {
				return mid;
			}
			if(numbers[mid] < key) {
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		return -1;
	}
public static void main(String args[]) {
	int numbers[] = {21,5,45,55,98,90,67,35};
	int key = 55;

	System.out.println("Index for key is :"+ BinarySearch(numbers,key));
}

}

