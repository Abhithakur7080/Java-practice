public class BoringFactorials {
    public static int boringFactorials(int n, int p){
        int fact = 1;
        for(int i=1;i<=n; i++){
            fact = (fact*i)%p;
        }
        return fact;
    }
    public static int boringFactorials1(int n, int p){
        if(n==0) return 1;
        return (n*(boringFactorials1(n-1, p)))%p;
    }
    public static void main(String[] args) {
        int n = scanner.s.nextInt();
        int p = scanner.s.nextInt();
        // System.out.println(boringFactorials(n, p));
        System.out.println(boringFactorials1(n, p));
    }
}
