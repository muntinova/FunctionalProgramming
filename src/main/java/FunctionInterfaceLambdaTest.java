@FunctionalInterface
interface CustomFunctionalInterface {
    void display();
}


public class FunctionInterfaceLambdaTest {
    public static void main(String args[]) {
        // Using Anonymous inner class
        CustomFunctionalInterface test1 = new CustomFunctionalInterface() {
            public void display() {
                System.out.println("Display using Anonymous inner class");
            }
        };
        test1.display();

        // Using Lambda Expression
        CustomFunctionalInterface test2 = () -> {    // lambda expression
            System.out.println("Display using Lambda Expression");
        };
        test2.display();

        // Using Anonymous inner class
        CustomFunctionalInterface test3 =
                () -> System.out.println("Display using Lambda Expression");
        test3.display();
    }
}
