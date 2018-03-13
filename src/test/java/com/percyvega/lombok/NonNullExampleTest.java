package com.percyvega.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NonNullExampleTest {

  @Test
  void test() {
    final NonNullExample nicholas = new NonNullExample("Nicholas");

    Assertions.assertThrows(NullPointerException.class, () -> {
      new NonNullExample(null);
    });

    nicholas.setLastName("Vega");

    nicholas.setLastName(null);

    nicholas.setNickname("Nico");

    Assertions.assertThrows(NullPointerException.class, () -> {
      nicholas.setNickname(null);
    });

  }

}