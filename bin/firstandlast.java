public class firstandlast {
    public static void main(String[] args){
        int arr[]={5,7,7,8,8,10};
        Solution s=new Solution();
        int result[]=s.searchRange(arr,8);
        System.out.println(result[0]+","+result[1]);
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid;
        int []index=new int[2];
        while(left<right){
            mid=left+(right-left)/2;
            if(nums[mid]==target){
                if(nums[mid-1]==target){
                    index[0]=mid-1;
                    index[1]=mid;
                }
                else if(nums[mid+1]==target){
                    index[0]=mid;
                    index[1]=mid+1;
                }
            }
            else if(nums[mid]>target){
                right=mid;
            }
            else if(nums[mid]<target){
                left=mid;
            }
            else{
                index[0]=-1;
                index[1]=-1;
            }
        }
        return index;
    }
}