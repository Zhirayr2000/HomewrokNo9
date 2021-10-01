package Statics;

import java.util.Scanner;

public class StaticMethods {
    static long sum(int a,int b){
        return (long)a+b;
    }
    static long cubeOfProduct(int a,int b){
        return (long)(a*a*a)*(b*b*b);
    }
    static char middleOfString(String s) {
        return s.charAt((s.length()-1)/2);
    }
    static void randomInitialization(int[] arr)
    {
        for(int i=0;i<arr.length;i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void valuesOfStringArray(String[] arr){
      for(int i=0;i<arr.length;i++)
          System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("a = ");
        int a=scanner.nextInt();
        System.out.print("b = ");
        int b=scanner.nextInt();
        System.out.println();
        System.out.println("a + b = "+sum(a,b));
        System.out.println("(a * b)^3 = "+cubeOfProduct(a,b));
        System.out.print("s = ");
        String s=scanner.next();
        System.out.println();
        System.out.println("Middle character of the s is : "+middleOfString(s));
        System.out.println();
        System.out.print("n = ");
        int n=scanner.nextInt();
        System.out.println();
        int[] arr=new int[n];
        System.out.println("Random initialized array:");
        randomInitialization(arr);
        String[] array=new String[n];
        System.out.println("Input "+n+" strings:");
        for (int i = 0; i < n; i++) {
            array[i]=scanner.next();
        }
        System.out.println("Values of the string array:Each in a new line.");
        valuesOfStringArray(array);
    }
}
