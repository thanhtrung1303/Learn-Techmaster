package com.company;

import java.util.Scanner;

public class Draw {
    public static void drawSquare() {
        for (int i = 0; i < 4;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void drawTriangle() {
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
