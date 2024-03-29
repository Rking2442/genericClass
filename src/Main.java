import java.lang.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 4);
        MyGenericClass<String, Integer> myString = new MyGenericClass<>("hello", 5);


        System.out.println(myInt.getValue());
        System.out.println(myString.getValue());


        }
    }