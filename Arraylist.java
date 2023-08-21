import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    static Scanner s = new Scanner(System.in);
    public static ArrayList<Integer> takeinput_1D(){
        System.out.println("Enter size of Arrays");
        int size = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<size; i++) {
            System.out.print("Enter index-" + i + " element: ");
            arr.add(i, s.nextInt());
        }
        return arr;
    }
    public static void output_1D(ArrayList<Integer> arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<ArrayList<Integer>> takeinput_2D(){
        System.out.println("Enter row of Arrays");
        int rows = s.nextInt();
        System.out.println("Enter column of Arrays");
        int col = s.nextInt();
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        for(int i=0; i<rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<col; j++){
                System.out.print("Enter index-" + i + "," + j + " element: ");
                row.add(j, s.nextInt());
            }
        }
        return mat;
    }
    public static void output_2D(ArrayList<ArrayList<Integer>> mat) {
        for(int i=0; i<mat.size(); i++){
            for(int j=0; j<mat.get(i).size(); j++){
                System.out.print(mat.get(i).get(j) + " ");
            }
        }
    }
    public static ArrayList<Integer> reverse(ArrayList<Integer> arr){
		int start = 0;
		int end = arr.size()-1;
		while(start<end){
			Collections.swap(arr, start++, end--);
		}
		return arr;
	}
}
