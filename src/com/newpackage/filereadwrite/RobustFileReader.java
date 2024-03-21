package com.newpackage.filereadwrite;

import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the name of the file you wish to read");
        String fileName = input.next();

        try (FileReader reader = new FileReader(fileName)) {
            int read;
            while ((read = reader.read()) != -1) {
                System.out.println((char)read);
            }
        } catch (IOException exception) {
            System.out.printf("exception occurred: %s",
                    exception.getMessage());
        }
    }
}
