import java.util.Scanner;

public class Poupança {
	
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		
		double valor;
		double juros;
		double montante = 0;
		int tempo;
		int i;
						
		do{
			System.out.print("Digite o valor aplicado mensalmente: ");
			valor = input.nextDouble();	
			
			System.out.print("Digite a taxa de juros mensal: ");
			juros = input.nextDouble();
			
			System.out.print("Digite o tempo de investimento em meses: ");
			tempo = input.nextInt();
		}while (valor == 0 || juros == 0 || tempo == 0);
		
		for(i=1;i<=tempo;i++){
			montante = (montante + valor) * (1 + juros/100);
		}
		
		System.out.printf("Valor depois de %d meses: %.2f", tempo, montante);
		
		System.exit(0);
		
	}
}
