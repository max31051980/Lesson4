package TaskInputOutput;

import java.util.Scanner;

public class MyArray {
    private int[] array = new int[10];
    Scanner scan = new Scanner(System.in);

    public void input() {
        System.out.print("Input 10 numbers of array ");
        for (int i = 0; i < 10; i++) {
            array[i] = scan.nextInt();
        }
    }

    public void bubbleSort() {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public void output() {
        System.out.println("You array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}