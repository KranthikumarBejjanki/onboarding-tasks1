package com.bddpractice.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyInitiator {
  public static Properties objectReturn() {
    try {
      Properties obj = new Properties();
      FileInputStream objfile =
          new FileInputStream(System.getProperty("user.dir") + "\\bddDemo.properties");
      obj.load(objfile);
      return obj;
    } catch (Exception j) {
      j.printStackTrace();
      return null;
    }
  }
}
