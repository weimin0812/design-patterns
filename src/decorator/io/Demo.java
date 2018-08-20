package decorator.io;

import java.io.*;

/**
 * @author weimin02
 * @date 2018/8/16
 * @project design-patterns
 */
public class Demo {

    public static void main(String[] args) {
        String pathname = "/Users/weimin/Desktop/fileTest.txt";
        File f = new File(pathname);
        String text = "你好大世界，hello world";
        try {
            OutputStream outputStream = new FileOutputStream(f);
            byte[] bytes = text.getBytes();
            outputStream.write(bytes);
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }




}
