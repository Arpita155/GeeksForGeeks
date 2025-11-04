package GeeksForGeeks.BasicQustionsOnJava.Basics;

import java.util.Scanner;

public class CubeRootOfANumber {

    public static int cubeRoot(int n) {
        // code here
        return (int)Math.cbrt(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();   // For 8
        System.out.println(cubeRoot(n));   // output : 2
    }
}
