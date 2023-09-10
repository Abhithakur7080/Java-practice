import java.util.*;

class Solution {

	public int coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here.
		int n = mat.size();
		int m = mat.get(0).size();
		int count = 0;
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(mat.get(i).get(j) == 0){
					//right
					if((i+1)<n&&(mat.get(i+1).get(j)==1)){
						count++;
					}
					//left
					if(i>0&&(mat.get(i-1).get(j)==1)){
						count++;
					}
					//top
					if(j>0&&(mat.get(i).get(j-1)==1)){
						count++;
					}
					//bottom
					if((j+1)<m&&(mat.get(i).get(j+1)==1)){
						count++;
					}
				}
			}
		}
		return count;
	}
}
public class SumOfZeroes{
    public static void main(String[] args) {
        Solution sol = new Solution();
        ArrayList<ArrayList<Integer>> mat = Arraylist.takeinput_2D();
        System.out.println(sol.coverageOfMatrix(mat));//err
    }
}