
public class NinjaAndTheSecondOrderElement {
    public static int secondLargest(int n, int[] a){
        int large = a[0];
        int slarge = Integer.MIN_VALUE;

        for(int i=1; i<n; i++){
            if(a[i]>large){
                slarge = large;
                large = a[i];
            }
            else if(slarge < a[i] && a[i] < large){
                slarge = a[i];
            }
        }
        return slarge;
    }
    public static int secondSmallest(int n, int[] a){
        int small = a[0];
        int ssmall = Integer.MAX_VALUE;

        for(int i=1; i<n; i++){
            if(a[i]<small){
                ssmall = small;
                small = a[i];
            }
            else if(ssmall > a[i] && a[i] > small){
                ssmall = a[i];
            }
        }
        return ssmall;
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int slargest = secondLargest(n, a);
        int ssmallest = secondSmallest(n, a);
        int ans[] = {slargest, ssmallest};
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = Array.takeinput_1D();
        System.out.println(Array.output_1D(arr));
    }
}
