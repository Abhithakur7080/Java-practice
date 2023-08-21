import java.util.*;
public class ReverseCoding {
    public static ArrayList<ArrayList<Integer>> reverseCoding(ArrayList<ArrayList<Integer>> mat){
        for(int i=0; i<mat.size(); i++){
            Arraylist.reverse(mat.get(i));
        }
        return mat;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = Arraylist.takeinput_2D();
        Arraylist.output_2D(reverseCoding(mat));
    }
}
