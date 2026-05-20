package com.flowerdesk.utils;

import java.util.Scanner;

public class InputGetter {
    private static final Scanner SCANNER= new Scanner(System.in);
    public static Scanner getScanner(){
        return SCANNER;
    }
    public static void getScannerClose(){
        SCANNER.close();
    }
}
