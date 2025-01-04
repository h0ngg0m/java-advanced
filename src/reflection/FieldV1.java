package reflection;

import reflection.data.BasicData;

import java.util.Arrays;

public class FieldV1 {

    public static void main(String[] args) {
        Class<BasicData> helloClass = BasicData.class;

        System.out.println(" == fields() ==");
        Arrays.stream(helloClass.getFields())
                .forEach(System.out::println);

        System.out.println(" == declaredFields() ==");
        Arrays.stream(helloClass.getDeclaredFields())
                .forEach(System.out::println);
    }
}
