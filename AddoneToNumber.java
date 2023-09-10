import java.util.* ;
class Solution
{
public ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr)
    {
        // Write your code here.
        //if 0 is in first and array morethan 1 size like arr=[0,1,2]->remove-0->arr=[1,2]
        while(arr.size()>1 && arr.get(0)==0) {
            arr.remove(0);
        }
        int carry = 1;//add 1 initially
        for(int i=arr.size()-1; i>=0; i--){
            int sum = arr.get(i) + carry; //add 1 first then add updated carry
            arr.set(i, sum%10); // set existing value else excceded then more than multiple of 10s
            carry = sum/10; // carry last to pass another
        }
        //if last carry will extra then pass new inde-0 in first and add carry value
        if(carry>0){
            arr.add(0, carry);
        }
        return arr;
    }
}
public class AddoneToNumber {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ArrayList<Integer> arr = Arraylist.takeinput_1D();
        Arraylist.output_1D(sol.addOneToNumber(arr));
    }
}

