package TaskInputOutput;

public class InputOutput {

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.input();
        myArray.output();
        System.out.println("");
        myArray.bubbleSort();
        myArray.output();
    }
}