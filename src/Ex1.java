import java.util.Scanner;

/**
 * Exercício 1)
 * <br>
 * Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar
 * com o número 0
 * <br>
 * Ao final, calcule a média das alturas informadas.
 */
public class Ex1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double somaAltura = 0;
		int contador = 0;

		System.out.println("Insira a altura(para sair insira 0): ");
		double altura = input.nextDouble();

		while (altura != 0) {
			somaAltura += altura;
			contador++;
			System.out.println("Insira a altura(para sair insira 0): ");
			altura = input.nextDouble();
		}
		if (contador > 0){
			System.out.println("Média de altura: "
					+ (somaAltura/contador)
					+ " metros");
		}else {
			System.out.println("Nenhuma altura foi informada.");
		}

		input.close();
	}

}
