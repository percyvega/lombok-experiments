package com.percyvega.lombok;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ValExampleTest {

  @Test
  void lowercase() {
    String greeting = new ValExample().lowercase("Hola!");

    assertThat(greeting.toLowerCase()).isEqualTo("hola!");
  }

  @Test
  void example2() {
    new ValExample().example2();
  }

  @Test
  void example3() {
    new ValExample().example3();
  }

}
