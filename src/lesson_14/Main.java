//package lesson_14;
//
//import org.apache.log4j.Logger;
//
//public class Main {
//    public static final Logger LOGGER = Logger.getLogger(Main.class);
//    public static void main(String[] args) {
//        System.out.println(standardFactorial(5));
//        System.out.println(factorial(6));
//    }
//
//    public static int standardFactorial (int x) {
//        int result = 1;
//        for (int i = 1; i <=x ; i++) {
//            result = result * i;
//        }
//        LOGGER.error("Call from method standardFactorial");
//        return result;
//    }
//    public static int factorial (int x) {
//        if (x == 1) {
//            return x;
//        }
//        return x * factorial(x-1);
//    }
//}
