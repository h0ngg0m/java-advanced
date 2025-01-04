package reflection;

import reflection.data.BasicData;

import java.util.Arrays;

public class MethodV1 {

    public static void main(String[] args) {
        Class<BasicData> helloClass = BasicData.class;

        System.out.println(" == methods() =="); // 해당 클래스 + 상위 클래스 모든 public 메서드
        Arrays.stream(helloClass.getMethods())
                .forEach(System.out::println);

        System.out.println(" == declaredMethods() =="); // 직접 선언한 모든 메서드
        Arrays.stream(helloClass.getDeclaredMethods())
                .forEach(System.out::println);
    }
}
