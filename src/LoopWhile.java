import java.util.Scanner;


public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		int idade, quantAlunos, contador;
		double media;
		idade = 0;
		media = 0;
		contador = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, digite a quantidade de alunos:");
		quantAlunos = leitor.nextInt();
		while ( contador < quantAlunos) {
			System.out.println("Por favor, digite a idade do " + (contador + 1) + "� aluno:");
			idade = leitor.nextInt();
			media = idade + media;
			contador++;
		}
		leitor.close();
		media = media / quantAlunos;
		System.out.println("A m�dia de idade dos alunos �:" + media);

	}

}
