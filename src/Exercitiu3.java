public class Exercitiu3 {
    public static void main(String[] args) {
//        Citire a unui numar de la tastatura.
//        Daca numarul este mai mare decat 0 si mai mic decat 10 vom afisa “numarul mai mic decat 10”/
//        Daca numarul este mai mare sau egal cu 10 si mai mic decat 20 vom afisa “numarul este intre 10 - 20”
//        Daca numarul este mai mare decat 30 vom afisa  “numarul mai mare decat 30”


        int nr = 4;
        if ((nr > 0) && (nr < 10)) {
            System.out.println("numarul este mai mic decat 10");
        } else if ((nr >= 10) && (nr < 20)) {
            System.out.println(" numarul este intre 10 si 20");

        } else if (nr > 30) {
            System.out.println("numarul este mai mare de 30");
        }
    }
}




