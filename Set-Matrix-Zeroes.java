1class Solution {
2    public void setZeroes(int[][] matrix) {
3       int m = matrix.length;
4        int n = matrix[0].length;
5        int a[] = new int [m];
6        int b[] = new int [n];
7        for(int i = 0;i<m;i++){
8        for(int j = 0;j<n;j++){
9            if(matrix[i][j]==0 ){
10                a[i] = 1;
11                b[j] = 1;
12
13            }
14        }
15        }
16
17for(int i = 0;i<m;i++){
18        for(int j = 0;j<n;j++){
19            if( a[i]==1  || b[j]==1 ){
20                matrix[i][j] = 0;
21            }
22        }
23        }
24
25    }
26}