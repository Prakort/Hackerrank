// Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

    long arr[] = new long[n];

for (int i = 0; i < queries.length; i++) {

int a = queries[i][0] - 1;
int b = queries[i][1] - 1;
int k = queries[i][2];

    arr[a] += k;
    if (b+1 < n) {
    arr[b+1] -= k;  
    }
}

long max = Long.MIN_VALUE;
for (int i = 1; i < arr.length; i++) {
arr[i] += arr[i-1];
max = Math.max(arr[i], max);
} 

return max;
}
