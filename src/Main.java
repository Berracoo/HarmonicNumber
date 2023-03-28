import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // n variable will be taken from the user
        // 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
        // loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number for n : ");
        int n = scanner.nextInt();
        System.out.println("**************");

        double partition = 0;

        for(int i = 1; i <= n; i++){
            // to be able to get the result in double type all other variables should be double as well
            // if we didn't make the 1 1.0 the result wouldn't be true ,or you could make i double
            partition += (1.0/i);

        }
        System.out.println(partition);
    }
}