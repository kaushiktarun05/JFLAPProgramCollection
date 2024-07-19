import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        String input = reader.readLine();
        EndsWith11 scanner = new EndsWith11(new StringReader(input));
        boolean result = scanner.isEndsWith11();
        if (result) {
            System.out.println("The input ends with '11'.");
        } else {
            System.out.println("The input does not end with '11'.");
        }
    }
}
