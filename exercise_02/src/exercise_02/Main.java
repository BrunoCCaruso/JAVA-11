//////////////////////// exercise 02 //////////////////////
/*
Define a Class that contains some array data type and add the code to
throw and catch an ArrayIndexOutOfBoundsException (array index
out of range).
 */


package exercise_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        MyArray array = new MyArray();
        array.generateArray();

        try{
            System.out.print("Enter an index: ");
            int i = read.nextInt();
            array.findArray(i);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The following exception occurs: "+e.getClass().getSimpleName());
            System.out.println("This exception can appear when an index is out of range.");
        }finally {
            System.out.println("Finalized.");
        }

    }
}
