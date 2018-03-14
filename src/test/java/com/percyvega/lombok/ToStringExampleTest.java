package com.percyvega.lombok;

import static org.assertj.core.api.Assertions.assertThat;

import com.percyvega.lombok.changedefaults.ToStringExampleCD;
import org.junit.jupiter.api.Test;

class ToStringExampleTest {

  @Test
  void test() {
    final ToStringExample example = new ToStringExample("Percy", 38);
    final String toString = example.toString();
    System.out.println(toString);
    assertThat(toString).isEqualTo("ToStringExample(name=Percy, age=38)");
  }

  @Test
  void testExclude() {
    final Point point = new Point();
    final String toString = point.toString();
    System.out.println(toString);
    assertThat(toString).isEqualTo("Point(x=10)");
  }

  @Test
  void testDoNotUseGetters() {
    final Dot dot = new Dot();
    final String toString = dot.toString();
    System.out.println(toString);
    assertThat(toString).isEqualTo("Dot(size=1)");
  }

  @Test
  void testCD() {
    final ToStringExampleCD example = new ToStringExampleCD("Percy", 38);
    final String toString = example.toString();
    System.out.println(toString);
    assertThat(toString).isEqualTo("ToStringExampleCD(Percy, 38)");
  }
}
