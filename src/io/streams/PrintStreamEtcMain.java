package io.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEtcMain {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("temp/print.txt");
        PrintStream printStream = new PrintStream(fos);

        printStream.println("Hello, world!");
        printStream.println(123);
        printStream.println(3.14);
        printStream.println(true);
        printStream.printf("hello %s", "world");
        printStream.close();
    }
}
