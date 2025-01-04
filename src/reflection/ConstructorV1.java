package reflection;

import java.util.Arrays;

public class ConstructorV1 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("reflection.data.BasicData");

        System.out.println(" == constructors() ==");
        Arrays.stream(aClass.getConstructors())
                .forEach(System.out::println);

        System.out.println(" == declaredConstructors() ==");
        Arrays.stream(aClass.getDeclaredConstructors())
                .forEach(System.out::println);
    }
}
