import java.util.Scanner;

public class Exercitiu11 {

    public static void main(String[] args) {
        //Citirea numerelor de la tastatura pana cand suma lor e>20;
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (sum < 20) {
            int num = scan.nextInt();

            sum = sum + num;
        }
        System.out.println("suma este " + sum);
    }
}
