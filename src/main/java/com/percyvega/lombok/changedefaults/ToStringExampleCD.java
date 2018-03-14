package com.percyvega.lombok.changedefaults;

import java.math.BigDecimal;
import lombok.ToString;

@ToString
public class ToStringExampleCD {
  private String name;
  private final int age;
  private static BigDecimal BONUSES = new BigDecimal(3000);

  public ToStringExampleCD(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    System.out.println("Executing getName()");
    return name;
  }
}