package com.example;

import java.util.HashMap;
import java.util.Map;

import java.util.concurrent.ThreadLocalRandom;

public class test {
    public static void main(String args[]){
      int numberRandom = ThreadLocalRandom.current().nextInt();
		numberRandom = (numberRandom>0)?numberRandom:-numberRandom;
      System.out.println(numberRandom); 
   }

}
