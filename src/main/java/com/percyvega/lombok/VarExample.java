package com.percyvega.lombok;

import lombok.experimental.var;

// inferred type with mutable value
// for any variable except fields
public class VarExample {

  public void example3() {
    var counter = 0;

    for (int i = 0; i < 2; i++) {
      counter = i;
      System.out.println(counter);
    }
  }

}
