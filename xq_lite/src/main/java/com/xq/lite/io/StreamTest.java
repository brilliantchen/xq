package com.xq.lite.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;

public class StreamTest {

  public static void main(String[] args) throws Exception{
    StreamTest stream = new StreamTest();
    stream.streamCloseOrNot();
  }

  /**
   * 使用字节流不关闭执行
   * 1.字符流使用了缓冲区
   * 2.关闭字符流时会强制性地将缓冲区中的内容进行输出，但是没有关闭，缓冲区内容是无法输出
   * 3.不关闭时将字符流的内容全部输出，使用Writer类中的flush()方法完成
   */
  private void streamCloseOrNot() throws Exception{
    File f = new File("d:" + File.separator + "test1.txt"); // 声明File  对象
    OutputStream out = new FileOutputStream(f);
    String str = "Hello World!!!";
    byte b[] = str.getBytes();
    out.write(b);
    // out.close();// 此时没有关闭, Hello World!!!会写入文本

    File f2 = new File("d:" + File.separator + "test2.txt");// 声明File 对象
    Writer out2 = new FileWriter(f2);;
    out2.write(str);
    // out2.close();// 此时没有关闭,文件中没有任何内容
    // out2.flush();// 如果没有关闭,flush后也可完成输出


  }


}
