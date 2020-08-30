
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        System.out.println("Enter an integer to get the digits in descending order");
        Scanner in = new Scanner(System.in);

        int number=in.nextInt();


        List<Integer> numbers = new LinkedList<>();
        for (int i = number; i > 0; i /= 10)
            numbers.add(i % 10);
        numbers.stream().sorted().forEach(System.out::println);
    }

}
