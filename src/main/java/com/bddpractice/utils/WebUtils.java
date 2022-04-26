package com.bddpractice.utils;

public class WebUtils {

  public static void sleep(long timeInMilliSeconds) {
    try {
      Thread.sleep(timeInMilliSeconds);
    } catch (InterruptedException exception) {

    }
  }
}
