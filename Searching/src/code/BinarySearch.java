package code;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int index1 = BinarySearch.binSearch(arr1, -3, 0, arr1.length - 1);
		System.out.println(index1);
	}

	public static int binSearch(int[] arr, int key, int left, int right) {

			if(right == left) {
				if(arr[right] == key) {
					return right;
				}
			}else if (right > left) {

			int middleIndex = left + (right - left) / 2;

			if (arr[middleIndex] == key) {
				return middleIndex;
			} else if (arr[middleIndex] > key) {
				return BinarySearch.binSearch(arr, key, left, middleIndex);
			} else {
				return BinarySearch.binSearch(arr, key, middleIndex + 1, right);
			}

		}

		return -1;
	}

}
