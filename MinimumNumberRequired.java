import java.util.*;
public class MinimumNumberRequired {
    public static int minimumNumberRequired(ArrayList<Integer> arr, int sum, int maxVal){
        int n = arr.size();
        int arr_sum = 0;
        for(int i=0; i<n; i++){
            arr_sum += arr.get(i);
        }
        System.out.println("array sum: "+arr_sum);
        int diff = Math.abs(sum-arr_sum);
        System.out.println("diff: "+diff);
        if(diff%maxVal==0){
            System.out.println("diff/maxVal: " + diff/maxVal);
            return diff/maxVal;
        }
        else{
            System.out.println("diff/maxVal + 1: " + (diff/maxVal+1));
            return diff/maxVal+1;
        }
    }
    public static void main(String[] args) {
        int sum = scanner.s.nextInt();
        int maxVal = scanner.s.nextInt();
        ArrayList<Integer> arr = Arraylist.takeinput_1D();
        int ans = minimumNumberRequired(arr, sum, maxVal);
        System.out.println(ans);
    }
}
