import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Mahdie Montazeralzohoor on 2/24/2022 1:51 AM
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int k = 0;
        int male = scanner.nextInt();
        int[] maleArray = new int[male];
        for (int i = 0; i < male; i++)
            maleArray[i] = scanner.nextInt();

        int female = scanner.nextInt();
        int[] femaleArray = new int[female];

        for (int i = 0; i < female; i++)
            femaleArray[i] = scanner.nextInt();

        Arrays.sort(maleArray);
        Arrays.sort(femaleArray);

        for (int i = 0; i < male; i++) {
            for (int j = k; j < female; j++) {
                if (femaleArray[j] == maleArray[i] || femaleArray[j] == (maleArray[i] - 1) || femaleArray[j] == (maleArray[i] + 1)) {
                    counter++;
                    k = j + 1;
                    break;
                }
            }
        }
        System.out.println(counter);
    }
}
