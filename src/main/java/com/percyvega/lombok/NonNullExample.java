package com.percyvega.lombok;

import lombok.NonNull;
import lombok.Setter;

public class NonNullExample {

  private String firstName;

  @NonNull
  private String lastName;

  @NonNull
  @Setter
  private String nickname;

  public NonNullExample(@NonNull String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

}
