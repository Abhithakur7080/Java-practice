import java.util.ArrayList;

public class ContainerWithMaximumWater {
    //Brute
    public static int maxAreaContainer1(ArrayList<Integer> arr) {
		// Write your code here.
		int n = arr.size();
		int area = Integer.MIN_VALUE;
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				int side1 = j-i;
				int side2 = Math.min(arr.get(i), arr.get(j));
				area = Math.max(area, side1*side2);

			}
		}
		return area;
	}
    //Optimized
    public static int maxAreaContainer(ArrayList<Integer> arr) {
		// Write your code here.
		int n = arr.size();
		int area = Integer.MIN_VALUE;
		int left = 0;
		int right = n-1;
		while(left<right){
			int leftHeight = arr.get(left);
			int rightHeight = arr.get(right);
			int side1 = right-left;
			int side2 = Math.min(leftHeight, rightHeight);
			area = Math.max(area, side1*side2);
			if(leftHeight<rightHeight){
				left++;
			}
			else{
				right--;
			}

		}
		return area;
	}
    public static void main(String[] args) {
        ArrayList<Integer> arr = Arraylist.takeinput_1D();
        int ans = maxAreaContainer(arr);
        System.out.println(ans);
    }
}
