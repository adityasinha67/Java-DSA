//GFG problem
public class maxsubarray {
     public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int low=0;
        int high=k-1;
        int sum=0;
        for(int i=low;i<=high;i++){
            sum+=arr[i];
        }
        int max=sum;
        while(high+1<arr.length){
            sum=sum-arr[low]+arr[high+1];
            if(sum>max){
                max=sum;
            }
            low++;
            high++;
        }
        return max;
    }
}