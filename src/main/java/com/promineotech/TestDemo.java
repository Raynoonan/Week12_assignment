package com.promineotech;
import java.util.Random;
public class TestDemo {

  public int addPositive(int a, int b) {
    if ((b > 0) & (a > 0)) {

      return a + b;

    } else {
      throw new IllegalArgumentException("Both parameters must be positive!");

    }
  }
  
  public static void NewFunctionality() {
  }
  public static int randomNumberSquared() {
    Random random = new Random();
        int randomNum = random.nextInt(10) + 1;
        return randomNum * randomNum;
  }
  public static int getRandomInt() {
    Random random = new Random();
    return random.nextInt(10) + 1;
  }
}

