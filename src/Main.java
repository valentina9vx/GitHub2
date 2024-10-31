public class Main {
    public static void main(String[] args) {

        // 1) Dreierpotenz
        //Ausgabe Dreierpotenz
        //Ausgabe
        System.out.println("Dreierpotenz:");
        System.out.println(istPotenzVonDrei(27));

        // 2) Morsecode
        ausgabe(3,"");
        System.out.println("Letzte Ausgabe");

        // 3) Fibonacci-Zahlen
        for (int i = 0; fibonacciZahl(i) < 100; i++) {
           System.out.println(fibonacciZahl(i));
        }
    }

  // 1) Potenz von 3
    //Hallooooooo
    //Methode für Potenz von 3
  public static boolean istPotenzVonDrei(int zahl){
        if (zahl == 1){
            return true;
        }
        if (zahl % 3 != 0 || zahl <= 0){
            return false;
        }
        return(istPotenzVonDrei(zahl/3));
  }

  // 2) Morsecode
  private static void ausgabe(int n, String zeichenkette){
        if (n==0){
            System.out.println(zeichenkette);
        } else{
            ausgabe(n-1,zeichenkette + ".");
            if (n>1){
                ausgabe(n-2,zeichenkette+"-");
            }
        }
  }

  // 3) Fibonacci-Zahlen
    //Fibonacci
  public static int fibonacciZahl(int n){
        if (n<=1){
            System.out.println("Fibonacci Zahlen lauten:");
            return n;
        }
      System.out.println("Hallo");
        return fibonacciZahl(n-1)+fibonacciZahl(n-2);



  }

  // 4) Suche mit Dichotomie


    }