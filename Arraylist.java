import java.util.Scanner;
import java.util.ArrayList;

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
}
