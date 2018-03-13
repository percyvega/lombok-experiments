package com.percyvega.lombok;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RequiredArgsConstructorExample {

  private int x;
  @NonNull
  private String description;

  public void printDescription() {
    System.out.println(description);
  }

}

@RequiredArgsConstructor(staticName = "of")
class RequiredArgsConstructorExample2 {

  private int x;
  @NonNull
  private String description;

  public void printDescription() {
    System.out.println(description);
  }

}
