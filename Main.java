import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
		
		String nome;
		int idade;
		String sexo;
		float peso;
		String telefone;
		
		System.out.println("Informe o seu nome:");
		nome = ler.nextLine();
		
		System.out.println("Informe a sua idade:");
		idade = ler.nextInt();
		
		System.out.println("Informe o seu sexo:");
		ler.nextLine();
		sexo = ler.nextLine();
		
		System.out.println("Informe o seu peso:");
		peso = ler.nextFloat();
		
		System.out.println("Informe o seu telefone:");
		ler.nextLine();
		telefone = ler.nextLine();
    
  }
}