package controle;

import visao.Telas;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Telas telas = new Telas();

		int opcao = 0;
		Scanner ler = new Scanner(System.in);

		telas.MenuPrincipal();
		opcao = ler.nextInt();
		while (opcao != 4) {
			switch (opcao) {
			case 1:
				System.out.println("Digite o título da tarefa: ");
				System.out.println("Digite a descrição da tarefa: ");
				System.out.println("Digite a data de vencimento (formato: YYYY-MM-DD): ");
				System.out.println("Digite o status da tarefa (Pendente, Em andamento, Concluída): ");
				break;
			case 2:
				telas.MenuListar();
				break;
			case 3:
				telas.MenuRemover();
				break;
			}
		}
		System.out.println("Saindo do sistema. Até mais!");
	}

}
