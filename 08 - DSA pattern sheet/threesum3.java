//geeks for geeks problem

import java.util.Arrays;

public class threesum3 {
    int countTriplets(int sum, int arr[]) {
		Arrays.sort(arr);
		int n = arr.length;
		int count = 0;
		for (int i = 0; i<n - 2; i++) {
			int left = i + 1;
			int right = n - 1;
			while (left<right) {
				int result = arr[left]+arr[i]+arr[right];
				if (result<sum) {
					count+=right-left;
					left++;
				} else {
					right--;
				}
			}
		}
		return count;
		
	}
}
