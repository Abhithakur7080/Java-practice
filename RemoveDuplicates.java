public class RemoveDuplicates {
    public static int removeDuplicates(int arr[]){
        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[i];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = Array.takeinput_1D();
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }
}
