public class Largest{
    public static int largest(int arr[]){
        int large = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){ // T= O(n)
            if(arr[i]>large){
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int arr[] = Array.takeinput_1D();
        int ans = largest(arr);
        System.out.println(ans);
    }
}