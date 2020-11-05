package collections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

// Properties에 저장된 데이터를 store()와 storeToXML()을 이용하여 저장하는 방법
public class Properties03 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("timeout","30");
        prop.setProperty("language","한글");
        prop.setProperty("size","10");
        prop.setProperty("capacity","10");

        try {
            prop.store(new FileOutputStream("output.txt"), "Properties Example");       // output.txt 파일 생성
            prop.storeToXML(new FileOutputStream("output.xml"),  "Properties Example");  // output.xml 파일 생성
            // 한글이 포함된 경우 storeToXml을 이용하는것이 좋다.
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
