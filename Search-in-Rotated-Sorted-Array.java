1class Solution {
2    public int search(int[] nums, int target) {
3        int a = 0;
4 int low = 0;
5 int high = nums.length-1;
6 while(low<=high){
7    int mid = low+(high-low)/2;
8 if (nums[mid] == target) return mid;
9    if(nums[mid]>= nums[low]){
10       if (target >= nums[low] && target < nums[mid]) {
11         high = mid-1;
12    }
13    else{
14        low = mid+1;
15    }
16 }     
17 else{
18     if (target > nums[mid] && target <= nums[high]) {
19        low = mid+1;
20     }
21     else high = mid-1;
22  }}
23 return -1;
24    }
25}