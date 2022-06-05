package com.tevolvers.bd.utils;

import java.util.Random;

public class GenerateRandom {
    private static Random random = new Random();

    public static String letters(){
        String result="";
        for (int i=0;i<5;i++){
            char r=(char)(random.nextInt(26)+97);
            result=result + r;
        }
          return result;
    }
    public static int numbers(){
        return random.nextInt(70);
    }

    public static String numberString(){
        String result= "";
        for(int i=0;i<6;i++){
            result=result+numbers();
        }
        return result;
    }
}
