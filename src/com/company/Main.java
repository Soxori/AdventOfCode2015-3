package com.company;

import java.util.HashSet;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        final File file = new File("src/com/company/input");
        Scanner sc = new Scanner(file);
        final HashSet<Coordinates> set = new HashSet<>();
        int x = 0;
        int y = 0;
        final String input = sc.nextLine();
        final String[] splitter = input.split("");

        for (String c : splitter) {
            switch (c) {
                case "<" : x -= 1;
                case ">" : x += 1;
                case "v" : y -= 1;
                case "^" : y += 1;
            }
            final Coordinates coordinate = new Coordinates(x, y);
            set.add(coordinate);
        }
        System.out.println(set.size()+1);
    }
}
