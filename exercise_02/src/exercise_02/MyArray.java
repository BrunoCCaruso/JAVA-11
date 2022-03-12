package exercise_02;

import java.util.Scanner;

public class MyArray {
    private int[] myArray;
    private int lengthArray;
    private static Scanner read = new Scanner(System.in);

    public MyArray() {
    }

    public MyArray(int[] myArray, int lengthArray) {
        this.myArray = myArray;
        this.lengthArray = lengthArray;
    }

    public void generateArray(){
        System.out.print("Enter the length: ");
        lengthArray = read.nextInt();
        myArray = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++){
            System.out.println("["+i+"]");
        }
    }

    public int findArray(int i){
        return myArray[i];
    }


}
