public class JavaClass21 {
     public static void main(String[] args) {
        evenOrOdd(12);
        evenOrOdd(11);
        evenOrOdd(20);
        evenOrOdd(15);
        evenOrOdd(39);
    
    }
    static void evenOrOdd(int num)
    {
        if(num % 2 == 0)
            System.out.println(num + " is Even Number.");
        else
            System.out.println(num + " is Odd Number.");
    }
}
