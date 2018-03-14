package com.percyvega.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class GetterSetterExample {

  @Getter
  @Setter
  private int age = 1;
}

class GetterExample {

  @Getter
  private int age = 2;
}

class PrivateGetterExample {

  @Getter(AccessLevel.PRIVATE)
  protected int age = 3;
}

class SetterExample {

  @Setter
  protected int age = 4;
}
