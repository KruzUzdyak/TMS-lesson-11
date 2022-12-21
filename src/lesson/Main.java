package lesson;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static String strNull = null;

    public static void main(String[] args) throws FileNotFoundException {

        try {
            System.out.println("try start");
            method1();
            method2();
            method3();


            System.out.println("try end");

            // daughter exception
        } catch (FileNotFoundException  e) {
            e.printStackTrace();
            throw e;  // trespasses rest catch blocks

            //parent exception
        } catch (IOException e) {
            String message = e.getMessage();
            System.err.println(e.getMessage());
            Throwable cause = e.getCause();
            System.out.println("catch");
            throw new UncheckedException(e);
        }

        System.out.println("End program");
    }

    // проверяемое (checked)
    public static int method1() throws FileNotFoundException {
        boolean b = true;
        if (b) {
            throw new FileNotFoundException();
        }
        return 0;
    }

    public static void method2() throws IOException {
        // code
        throw new IOException();
    }

    // непроверяемое (unchecked)
    public static void method3() throws RuntimeException {
        strNull.length();
    }
}
