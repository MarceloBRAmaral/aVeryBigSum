import java.util.Scanner;

public class AVeryBigSum {

    public static void main(String[] args) {

        int quantity;
        long numbers[]; 
        long sum = 0;

        Scanner input = new Scanner(System.in);
        quantity = input.nextInt();
        numbers = new long[quantity];
        for(int i=0;i<quantity;i++){
            numbers[i] = input.nextLong();
            sum += numbers[i];
        }

        System.out.print(sum);
    }
}