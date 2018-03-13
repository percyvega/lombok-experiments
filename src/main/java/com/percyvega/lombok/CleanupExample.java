package com.percyvega.lombok;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lombok.Cleanup;

public class CleanupExample {

  public void fileToConsole(String filename) throws IOException {
    @Cleanup InputStream in = new FileInputStream(filename);
    @Cleanup OutputStream out = System.out;

    byte[] buffer = new byte[100];

    int readCount = in.read(buffer);
    while (readCount != -1) {
      out.write(buffer, 0, readCount);
      readCount = in.read(buffer);
    }
  }

}

