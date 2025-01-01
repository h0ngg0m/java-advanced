package io.text;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ReaderWriterMainV3 {

    public static void main(String[] args) throws IOException {
        String writeString = "abc";
        System.out.println("write string: " + writeString);

        // 파일에 쓰기
        FileWriter fileWriter = new FileWriter(FILE_NAME, UTF_8);
        fileWriter.write(writeString);
        fileWriter.close();

        // 파일에서 읽기
        StringBuilder sb = new StringBuilder();
        FileReader fileReader = new FileReader(FILE_NAME, UTF_8);
        int ch;
        while ((ch = fileReader.read()) != -1) {
            sb.append((char) ch);
        }
        fileReader.close();

        System.out.println("read string: " + sb);
    }
}
