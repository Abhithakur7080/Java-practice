import java.util.Scanner;

public class Array {

    static Scanner s = new Scanner(System.in);
    
    public static void swap(int a, int b) {
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
    }
    public static void swap_1D(int arr[], int i, int j) {
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void swap_2D(int matrix[][], int i, int j) {
        int temp=0;
        temp=matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public static boolean linearSearch(int arr[], int x) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==x) {
                return true;
            }
        }
        return false;
    }
    public static int sum(int arr[]) {
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void rotateLast(int arr[], int k) {
        int n = arr.length;
        if(arr==null || n==0 || k<0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        if(k>n) {
            k=k%n;
        }
        //length of first part
        int a = n-k;
        reverse_1D(arr, 0, a-1);
        reverse_1D(arr, a, n-1);
        reverse_1D(arr, 0, n-1);
    }
    public static void rotate(int arr[], int k) {
        int n = arr.length;
        if(arr==null || n==0 || k<0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        if(k>n) {
            k=k%n;
        }
        //length of second part
        int a = k;
        reverse_1D(arr, 0, a-1);
        reverse_1D(arr, a, n-1);
        reverse_1D(arr, 0, n-1);
    }
    public static void reverse_1D(int arr[], int i, int j) {
        while(i<j) {
            swap(arr[i++], arr[j--]);
        }
    }
    public static void reverse_2D(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length/2; j++) {
                int temp = 0;
                temp = matrix[i][j]; 
               matrix[i][j] =  matrix[i][matrix.length-j-1];
               matrix[i][matrix.length-j-1] = temp;
            }
        }
    }
    public static int[][] transpose_2D(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0; i<rows; i++) {
            for(int j=i; j<cols; j++) {
                Array.swap_2D(matrix, i, j);
            }
        }
        return matrix;
    }
    public static int largest(int arr[]) {
        int large=arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > large) {
                large = arr[i];
            }
        }
        return large;
    }

    public static int secLargest(int arr[]) {
        int large = arr[0];
        int secLarge = -1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > large) {
                secLarge = large;
                large = arr[i];
            }
            else if(secLarge < arr[i] && arr[i] < large){
                secLarge = arr[i];
            }
        }
        return secLarge;
    }

    public static int[] takeinput_1D() {
        System.out.println("Enter size of Arrays");
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Enter index-" + i + " element: ");
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int[][] takeinput_2D() {
        System.out.println("Enter rows of matrix");
        int rows = s.nextInt();
        System.out.println("Enter column of matrix");
        int cols = s.nextInt();
        int matrix[][] = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print("Enter index-(" + i + ", "+ j + ")" + " element: ");
                matrix[i][j] = s.nextInt();
            }
        }
        return matrix;
    }

    public static int output_1D(int arr[]) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void printArray(int arr[], int start, int end) {
        while(start<=end){
            System.out.print(arr[start]);
            start++;
        }
    }

    public static void output_2D(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
