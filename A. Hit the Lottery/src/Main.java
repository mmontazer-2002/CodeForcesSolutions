import java.util.Scanner;

/**
 * Created by Mahdie Montazeralzohoor on 2/24/2022 12:54 AM
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cash = scanner.nextInt();
        int counter = 0;
        while (cash > 0) {
            if (cash >= 100)
                cash -= 100;
            else if (cash >= 20)
                cash -= 20;
            else if (cash >= 10)
                cash -= 10;
            else if (cash >= 5)
                cash -= 5;
            else
                cash -= 1;

            counter++;
        }
        System.out.println(counter);
    }
}
