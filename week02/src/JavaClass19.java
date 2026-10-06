public class JavaClass19 {
    public static void main(String[] args) {
        sayHello();

        int addition = getSum(11, 34);
        System.out.println("The sum is: " + addition);
    }
    static int getSum(int a, int b) {
            int sum = a + b;
            return sum;

        }
    static void sayHello(){
        System.out.println("Hi there! Welcome to Java programming.");
    }
}
