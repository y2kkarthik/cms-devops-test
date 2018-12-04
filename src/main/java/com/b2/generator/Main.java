package com.b2.generator;

//import com.github.lalyos.jfiglet.FigletFont;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedWriter;
import java.io.FileWriter;

@SpringBootApplication
public class Main {

  public static void main(String[] args) {
    try {
      //String gAscii = FigletFont.convertOneLine("Gresham");
      
      String gAscii = "Gresham";
      System.out.print("Working");

      for (int i = 0; i < 5; i++) {
        Thread.sleep(300);
        System.out.print(".");
      }

      BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
      writer.write(gAscii);
      writer.close();

      System.out.println(" Done !");

    } catch (Exception e) {
      System.out.println("Exception : " + e.getMessage());
    }
  }
}
