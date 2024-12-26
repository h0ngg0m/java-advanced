package io.buffered;

import java.io.FileOutputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.*;

public class CreateFileV2 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        long start = System.currentTimeMillis();

        byte[] buffer = new byte[BUFFER_SIZE];
        int bufferIndex = 0;

        for (int i = 0; i < FILE_SIZE; i++) {
            buffer[bufferIndex++] = 1;

            // 버퍼가 가득 차면 쓰고, 버퍼를 비운다.
            if (bufferIndex == BUFFER_SIZE) {
                fos.write(buffer);
                bufferIndex = 0;
            }
        }

        // 마지막으로 버퍼에 남아있는 데이터를 쓴다.
        if (bufferIndex > 0) {
            fos.write(buffer, 0, bufferIndex);
        }

        fos.close();
        long end = System.currentTimeMillis();

        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE / 1024 / 1024 + " MB");
        System.out.println("Time taken: " + (end - start) + "ms");
    }
}
