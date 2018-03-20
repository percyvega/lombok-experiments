package com.percyvega.lombok;

import static org.assertj.core.api.Assertions.assertThat;

import com.percyvega.lombok.changedefaults.ToStringExampleCD;
import org.junit.jupiter.api.Test;

class ToStringExampleTest {

  @Test
  void test() {
    final ToStringExample example = new ToStringExample("Percy", 38);
    final String s = example.toString();
    System.out.println(s);
    assertThat(s).isEqualTo("ToStringExample(name=Percy, age=38)");
  }

  @Test
  void testExclude() {
    final Point point = new Point();
    final String s = point.toString();
    System.out.println(s);
    assertThat(s).isEqualTo("Point(x=10)");
  }

  @Test
  void testDoNotUseGetters() {
    final Dot dot = new Dot();
    final String s = dot.toString();
    System.out.println(s);
    assertThat(s).isEqualTo("Dot(size=1)");
  }

  @Test
  void testCD() {
    final ToStringExampleCD example = new ToStringExampleCD("Percy", 38);
    final String s = example.toString();
    System.out.println(s);
    assertThat(s).isEqualTo("ToStringExampleCD(Percy, 38)");
  }

  @Test
  void testNoToString() {
    final Line line = new Line();
    final String s = line.toString();
    System.out.println(s);
  }
}
