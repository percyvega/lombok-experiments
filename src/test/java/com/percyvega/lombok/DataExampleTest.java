package com.percyvega.lombok;

import static org.assertj.core.api.Assertions.assertThat;

import com.percyvega.lombok.changedefaults.DataExampleCD;
import org.junit.jupiter.api.Test;

class DataExampleTest {

  @Test
  void test() {
    DataExample dataExample = new DataExample();
    dataExample.setStatus("Active");
    dataExample.setLanguage("en");
//    dataExample.

    assertThat(dataExample.getId()).isEqualTo(0);
    assertThat(dataExample.getAge()).isNull();
    assertThat(dataExample.getName()).isNull();
    assertThat(dataExample.getStatus()).isEqualTo("Active");
    assertThat(dataExample.getLanguage()).isEqualTo("en");

    System.out.println(dataExample);
  }

  @Test
  void testCD() {
    DataExampleCD dataExample = new DataExampleCD().setStatus("Active").setLanguage("en");

    assertThat(dataExample.getId()).isEqualTo(0);
    assertThat(dataExample.getAge()).isNull();
    assertThat(dataExample.getName()).isNull();
    assertThat(dataExample.getStatus()).isEqualTo("Active");
    assertThat(dataExample.getLanguage()).isEqualTo("en");

    System.out.println(dataExample);
  }

}
