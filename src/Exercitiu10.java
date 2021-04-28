public class Exercitiu10 {
    public static void main(String[] args) {
        //Afisare n!
        int a = 4;
        int produs = 1;
        for (int i = 1; i < a + 1; i++) {
            produs = produs * i;
        }
        System.out.println("n factorial are valoarea " + produs);
    }
}
