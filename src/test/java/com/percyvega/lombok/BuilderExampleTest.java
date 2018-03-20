package com.percyvega.lombok;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BuilderExampleTest {

  @Test
  void test() {
    BuilderExample builderExample = BuilderExample.builder().status("Active").language("en").build();

    assertThat(builderExample).hasFieldOrPropertyWithValue("id", 0);
    assertThat(builderExample).hasFieldOrPropertyWithValue("age", null);
    assertThat(builderExample).hasFieldOrPropertyWithValue("name", null);
    assertThat(builderExample).hasFieldOrPropertyWithValue("status", "Active");
    assertThat(builderExample).hasFieldOrPropertyWithValue("language", "en");

    System.out.println(builderExample);
  }

}
