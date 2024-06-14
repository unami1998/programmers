package Reflaction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class main {
    public static void main(String[] args) throws Exception {
        // 클래스 이름으로부터 클래스 로드
        Class<?> clazz = Class.forName("java.lang.String");

        // 클래스 이름 출력
        System.out.println("Class Name: " + clazz.getName());

        // 클래스의 메서드 목록 출력
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }


    }

}
