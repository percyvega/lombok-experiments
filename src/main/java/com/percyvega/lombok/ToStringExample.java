package com.percyvega.lombok;

import java.math.BigDecimal;
import lombok.ToString;

@ToString
public class ToStringExample {
  private String name;
  private final int age;
  private static final BigDecimal BONUSES = new BigDecimal(3000);

  public ToStringExample(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    System.out.println("Executing getName()");
    return name;
  }
}

@ToString(doNotUseGetters = true)
class Dot {
  private int size = 1;

  public int getSize() {
    System.out.println("Executing getSize()");
    return size;
  }
}

@ToString(exclude = "y")
class Point {
  private int x = 10;
  private int y = 10;
}

class Line {
  private int x1 = 10;
  private int y1 = 10;
  private int x2 = 20;
  private int y2 = 20;
}
