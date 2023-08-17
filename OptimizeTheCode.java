public class OptimizeTheCode {
    public static long helper(int n, int i) {
        // Do shifting.
        long temp = ((long) n >> (i + 1)) << i;
        System.out.println("temp-1: " + temp);

        // Check whether 'ith' bit is set in 'n'.
        if (((long) n >> i & 1) == 1) {
            temp += (n & ((1L << i) - 1));
            System.out.println("temp-2: " + temp);
        }

        return temp;
    }
    public static long optimizeCode(int a, int b, int c, int d){
         // Write your code here.
        long res = 0;

        // To store count of numbers between 'A' and 'B' and 'C' and 'D'.
        long num0 = b - a + 1;
        long num1 = d - c + 1;

        // Iterate the bits.
        for (int i = 0; i<31; i++) {
            // To store counts.
            long s0 = helper(b + 1, i) - helper(a, i);
            System.out.println("s0: " + s0);
            long s1 = helper(d + 1, i) - helper(c, i);
            System.out.println("s1: " + s1);

            // (Set * Unset).
            res += ((1L << i) * ((s0 * (num1 - s1)) % 1000000007));
            System.out.println("res-1: " + res);
            res %= 1000000007;
            System.out.println("res-2: " + res);

            // (Unset * Set).
            res += ((1L << i) * (((num0 - s0) * s1) % 1000000007));
            System.out.println("res-3: " + res);
            res %= 1000000007;
            System.out.println("res-4: " + res);
        }

        return res;
    }
    public static void main(String[] args) {
        int a = scanner.s.nextInt();
        int b = scanner.s.nextInt();
        int c = scanner.s.nextInt();
        int d = scanner.s.nextInt();
        
        long ans = optimizeCode(a, b, c, d);
        System.out.println(ans);
    }
}
