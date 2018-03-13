package com.percyvega.lombok;

import java.io.IOException;
import org.junit.jupiter.api.Test;

class CleanupExampleTest {

  @Test
  void fileToConsole() throws IOException {
    new CleanupExample().fileToConsole("/etc/hosts");
  }
}