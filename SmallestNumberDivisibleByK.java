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
    public static void main(String[] args) {
        int k = scanner.s.nextInt();
        System.out.println(lengthOfNumber(k));
    }
}
