package com.percyvega.lombok;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GetterSetterExampleTest {

  @Test
  void test() {
    final GetterSetterExample example = new GetterSetterExample();
    example.setAge(11);
    System.out.println(example.getAge());

    final GetterExample getterExample = new GetterExample();
//    getterExample.setAge(12); // error because method doesn't exist
    System.out.println(getterExample.getAge());

    final PrivateGetterExample privateGetterExample = new PrivateGetterExample();
//    privateGetterExample.setAge(13); // error because not accessible
    System.out.println(privateGetterExample.age);

    final SetterExample setterExample = new SetterExample();
    setterExample.setAge(14);
    System.out.println(setterExample.age);
  }
}
