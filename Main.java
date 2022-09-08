import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    int diasto, anos, meses, dias;

    System.out.println("Qual o valos de dias totais?");
    diasto = scan.nextInt ();


    anos = diasto / 365;
    
    double anosf = (double)  (Math.round(anos*1.0) / 1.0);

    System.out.println(anosf);

    
  }
}