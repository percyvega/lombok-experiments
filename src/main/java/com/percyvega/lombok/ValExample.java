package com.percyvega.lombok;

import java.util.ArrayList;
import java.util.HashMap;
import lombok.val;

// inferred type with final value
// for any variable except fields
public class ValExample {

  public String lowercase(String greeting) {
    val example = new ArrayList<String>();
    example.add(greeting);

    val foo = example.get(0);
    return foo.toLowerCase();
  }

  public void example2() {
    val map = new HashMap<Integer, String>();
    map.put(0, "zero");
    map.put(5, "five");

    for(val entry : map.entrySet()) {
      System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
    }
  }

  public void example3() {
    val counter = 0;

    for(int i = 0; i < 2; i++) {
//      counter = i;
      System.out.println(counter);
    }
  }

}
