public class JavaClass15 {
      public static void main(String[] args) {
        int sum = 0;
        int a[][] = {{6, 9, 3}, {4, 2, 6}};
        for(int i =0; i<2; i++){
            for(int j =0; j<3; j++){
                System.out.print(a[i][j] + " ");
                sum += a[i][j];
            }
            System.out.println();
        }
        System.out.println("average value: " + (double)sum / 6);
    }
}
