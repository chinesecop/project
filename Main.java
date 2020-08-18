package lesson_sixth;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\79224\\Documents\\MyFile.txt";
        String path2 = "C:\\Users\\79224\\Documents\\MyFile2.txt";

        FileOutputStream fos = new FileOutputStream(path1);
        fos.write(randomString(100).getBytes());

        FileOutputStream fos2 = new FileOutputStream(path2);
        fos2.write(randomString(100).getBytes());

        fos.flush();
        fos.close();
        fos2.flush();
        fos2.close();

// Create a stream to read bytes from a files (MyFile, MyFile2)
        FileInputStream fis = new FileInputStream(path1);
        FileInputStream fis2 = new FileInputStream(path2);

// Create a stream of writing bytes to the created file (MyFile3)
        String path3 = "C:\\Users\\79224\\Documents\\MyFile3.txt";
        FileOutputStream fos3 = new FileOutputStream(path3);
        rewrite(fis, fos3);
        rewrite(fis2, fos3);

        fis.close();
        fis2.close();
        fos3.close();
// word check
        String matcher = "abc";
        if (readUsingFiles(path3).contains(matcher))
            System.out.println("file contains: " + matcher);
        else System.out.println("file not contains: " + matcher);

    }

    public static void rewrite(FileInputStream from, FileOutputStream in) throws IOException {
        byte[] buffer = new byte[1000];
        while (from.available() > 0) // while there are still unread bytes
        {
            int count = from.read(buffer);
            in.write(buffer, 0, count);
        }
    }

    public static String randomString(final int length) {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder(length);
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            char c = chars[r.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();
    }

    private static String readUsingFiles(String path3) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path3)));
    }
}
