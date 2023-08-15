public class SecondLargest {
    public static int secondLargest(int arr[]){
        int large= arr[0];
        int secLarge=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>large){
                secLarge=large;
                large=arr[i];
            }
            else if(secLarge<arr[i] && arr[i]<large){
                secLarge=arr[i];
            }
        }
        return secLarge;
    }
    public static void main(String[] args) {
        int arr[] = Array.takeinput_1D();
        int ans = secondLargest(arr);
        System.out.println(ans);
    }
}
