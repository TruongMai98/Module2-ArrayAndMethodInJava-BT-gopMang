import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        System.out.print("arr1: ");
        for (int i = 0; i < 10; i++) {
            arr1[i] = (int) (Math.random() * 11);
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n");
        System.out.print("arr2: ");
        for (int i = 0; i < 10; i++) {
            arr2[i] = (int) (Math.random() * 11);
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\n");
        System.out.print("arr3: ");
        merge(arr1,arr2);
    }
    public static void merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[20];
        for (int i = 0; i < 10; i++) {
            arr3[i] = arr1[i];
            System.out.print(arr3[i] + " ");
        }
        for (int i = 10; i < 20; i++) {
            arr3[i] = arr2[i - 10];
            System.out.print(arr3[i] + " ");
        }
    }
}