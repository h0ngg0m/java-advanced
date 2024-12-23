package charset;

import java.nio.charset.Charset;
import java.util.Set;
import java.util.SortedMap;

public class AvailableCharsetsMain {

    public static void main(String[] args) {
        // 이용 가능한 모든 Charset 자바 + OS
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        charsets.forEach((key, value) -> System.out.println(key + " : " + value));

        System.out.println("====================================");

        // 문자로 조회(대소문자 구분X) MS949, ms949
        Charset charset = Charset.forName("MS949");
        System.out.println("charset = " + charset);

        // 별칭 조회
        Set<String> aliases = charset.aliases();
        aliases.forEach(alias -> System.out.println("alias = " + alias));

        // UTF-8
        Charset utf8 = Charset.forName("UTF-8");
        System.out.println("utf8 = " + utf8);

        // 시스템 default charset
        Charset defaultCharset = Charset.defaultCharset();
        System.out.println("defaultCharset = " + defaultCharset);
    }
}
