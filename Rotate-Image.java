1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4        int A[][] = new int[n][n];
5
6     int r = 0;
7     int c = 0;
8     for(int j = 0;j<n;j++){
9        for(int i = n-1;i>=0;i--){
10A[r][c] = matrix[i][j];
11c++;
12if(c==n){
13    c = 0;
14    r++;
15}
16        }
17     }
18      for (int i = 0; i < n; i++) {
19            for (int j = 0; j < n; j++) {
20                matrix[i][j] = A[i][j];
21            }
22        }
23    }
24}