1class Solution {
2    public int maxProfit(int[] arr) {
3        int min = arr[0] ;
4      
5        int rp = 0;
6        
7        for(int i = 1;i<arr.length;i++){
8   
9     if(min>arr[i]){
10        min = arr[i];}
11
12    
13       rp = Math.max(arr[i] - min,rp);
14        }
15        return rp;
16    }
17}