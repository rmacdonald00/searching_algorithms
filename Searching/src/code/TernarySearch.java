package code;

public class TernarySearch {

	public static void main(String[] args) {
		
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int index1 = TernarySearch.ternSearch(arr1, 5, 0, arr1.length - 1);
		System.out.println(index1);
		
		
		int[] arr2 = {10};
		int index2 = TernarySearch.ternSearch(arr2, 10, 0, arr2.length - 1);
		System.out.println(index2);
	}

	public static int ternSearch(int[] arr, int key, int left, int right) {

		if (right >= left) {

			int leftMiddleIndex = (right - left / 3) + left;
			
			if (arr[leftMiddleIndex] == key) {
				return leftMiddleIndex;
			} else if (arr[leftMiddleIndex] > key) {
				return TernarySearch.ternSearch(arr, key, left, leftMiddleIndex - 1);
			} else {
				int rightMiddleIndex = right - (right - left) / 3;
				if (arr[rightMiddleIndex] == key) {
					return rightMiddleIndex;
				} else if (arr[rightMiddleIndex] > key) {
					return TernarySearch.ternSearch(arr, key, leftMiddleIndex, rightMiddleIndex - 1);
				} else {
					return TernarySearch.ternSearch(arr, key, rightMiddleIndex, right);
				}
			}

		}

		return -1;
	}

}
