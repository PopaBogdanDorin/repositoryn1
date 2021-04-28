public class Exercitiu4 {
    public static void main(String[] args) {
        // Realizati o aplicatie ce imita un calculator.
        // De la tastatura se pot introduce : - , = , / , * si doua valori a si b
        // In functie de valoarea introdusa afisati suma , diferenta , impartirea sau inmultirea lui a la b
        // Utilizati structura CASE . Expresia evaluata vva fi unul din semnele introduse de la tastatura .
        int a = 6;
        int b = 3;
        String semn = "*";
        switch (semn) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "*":
                System.out.println(a * b);
                break;
        }

    }
}
