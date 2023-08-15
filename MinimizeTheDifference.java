import java.util.* ;

public class MinimizeTheDifference {

    public static int minimizeIt(int[] A, int K) {
        // Write your code here.
        int n = A.length;
        if(n==1){
            return 0;
        }
        Arrays.sort(A);
        int min = 0;
        int max = 0;

        int minDiff = A[n-1] - A[0];

        for(int i=1; i<n; i++){ // T=O(n)
            int diff = A[i] - K;
            if(diff<0){
                continue;
            }
            else{
                max = Math.max(A[i-1]+K, A[n-1]-K);
                min = Math.min(A[0]+K, A[i]-K);
                minDiff = Math.min(minDiff, max-min);
            }
        }
        return minDiff;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = Array.takeinput_1D();
        int k = s.nextInt();
        s.close();
        System.out.println(minimizeIt(arr, k));
    }
}