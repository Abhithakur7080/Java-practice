public class SmallestNumberDivisibleByK {
    public static int lengthOfNumber(int k){
        int num = 1;
        int length = 1;
        for(int i=0; i<k; i++){
            if(num%k == 0) return length;
            num = (num*10 + 1)%k;
            length++;
        }
        return -1;
    }
    public static int lengthOfNumber1(int k){
        return helper(1, 1, k);
    }
    public static int helper(int num, int length, int k){
        if(num%k == 0) return length;
        int newNum = (num*10 + 1)%k;
        if(newNum == 1) return -1;
        return helper(newNum, length+1, k);
    }
    public static void main(String[] args) {
        int k = scanner.s.nextInt();
        System.out.println(lengthOfNumber1(k));
    }
}
