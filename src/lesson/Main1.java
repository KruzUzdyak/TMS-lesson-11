package lesson;

import java.io.FileNotFoundException;

public class Main1 {

    public static void main(String[] args) {

        try {
            method1();
        } catch (CheckedException e) {
            e.printStackTrace();
        }
        System.err.println("-------------------");

        try {
            method3();
        } catch (UncheckedException e) {
            System.err.println("CATCHED Unchecked:");
            e.printStackTrace();
        }

        method3();

    }

    // проверяемое (checked)
    public static void method1() throws CheckedException {
        try {
            FileNotFoundException exception = new FileNotFoundException();
            // code
            throw exception;
        } catch (FileNotFoundException e) {
            throw new CheckedException(e);
        }
    }

    // непроверяемое (unchecked)
    public static void method3() {
        throw new UncheckedException("test unchecked");
    }

    static void method4() throws Exception {

    }
}
