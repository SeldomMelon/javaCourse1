package lesson_17;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Person.class;

//        Person p = new Person("oleg", 1);
//        Class c2 = p.getClass();
//
//        Class c3 = Class.forName("lesson_17.Person");

        Method[] methods = c.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName() + " " + m.getReturnType() + " " + Arrays.toString(m.getParameterTypes()));

        }



    }
}
