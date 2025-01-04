package reflection;

import reflection.data.Calculator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MethodV3 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("호출 메서드: ");
        String methodName = scanner.nextLine();

        System.out.println("숫자1: ");
        int number1 = scanner.nextInt();

        System.out.println("숫자2: ");
        int number2 = scanner.nextInt();

        Calculator calculator = new Calculator();

        Class<? extends Calculator> aClass = calculator.getClass();
        Method method = aClass.getMethod(methodName, int.class, int.class);
        Object result = method.invoke(calculator, number1, number2);
        System.out.println("result = " + result);
    }
}
