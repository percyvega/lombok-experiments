package com.percyvega.lombok;

import org.junit.jupiter.api.Test;

class RequiredArgsConstructorExampleTest {

  @Test
  void testConstructor() {
    RequiredArgsConstructorExample example = new RequiredArgsConstructorExample("This is a description");
    example.printDescription();
  }

  @Test
  void testConstructor2() {
    RequiredArgsConstructorExample2 example2 = RequiredArgsConstructorExample2.of("This is a description2");
    example2.printDescription();
  }

}
