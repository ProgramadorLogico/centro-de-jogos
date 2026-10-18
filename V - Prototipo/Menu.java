// Imports
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

// Classe Menu
public class Menu {

	// Variáveis públicas
	public static Scanner scanner = new Scanner(System.in);

	// Variáveis privadas
	public static boolean rodando = true;
	public static String input = null;
	public static ArrayList<String> opcoes = new ArrayList<> (Arrays.asList("Adivinhe o número", "Sair"));

	// Método construtor
	public Menu() {

		// Inicia o programa
		inicializar();
		
		// Exibi o título
		System.out.println("");
		System.out.println("╔═════════════════════════╗");
		System.out.println("║     Centro de jogos     ║");
		System.out.println("╚═════════════════════════╝");

		// Loop principal
		while(rodando) {

			// Quebra a linha
			System.out.println("");

			// Exibi jogos
			exibirJogos();
			
			// Pega a entrada
			input = pegarEntrada("Digite o número do jogo correspondente: ");

			// Tenta converter a entrada
			int inputInt = 0;

			// Tenta converter
			try {

				// Tenta converter
				inputInt = Integer.parseInt(input);

			// Roda se dar erro
			} catch (NumberFormatException e) {
				System.out.println("Você não digitou número!");
			}
	
			// Verifica a entrada
			switch(inputInt) {

				// Caso seja o primeiro jogo
				case 0:
					System.out.println("Chamando o Adivinhe o número");
					new Jogo1();
					break;

				// Caso seja para sair
				case 1:
					encerrar(0);
					break;

				// Caso não seja nenhum
				default:
					System.out.println("Você não digitou um número correspondente há lista!");
					break;
			}
		}
	}

	// Método que pega a entrada do usuário
	public static String pegarEntrada(String texto) {

		// Printa a mensagem e pega a resposta
		System.out.print(texto);
		String entrada = scanner.nextLine();

		// Retorna o valor recebido
		return entrada;
	}

	// Método de exibição dos jogos
	public static void exibirJogos() {

		// Usa o FOR para listar todos a partir do 0
		for (int i = 0; i < opcoes.size(); i++) {
			System.out.println(i + " - " + opcoes.get(i));
		}
	}

	// Método de encerramento do programa
	public static void encerrar(int erros) {

		// Printa os logs de encerramento
		System.out.println("Nenhuma dependência para resolver");
		System.out.println("Programa encerrado");

		// Fecha o programa
		System.exit(erros);
	}

	// Método que inicializa o Menu
	public static void inicializar() {
		System.out.println("Nenhuma dependência para resolver");
		System.out.println("Programa iniciado");
	}
}

/*
 * Olá usuário, se você lê este arquivo significa que entrou nos códigos do jogos
 * Fico feliz que alguém possa ver meu trabalho, por favor, deixe seu FEEDBACK
 * Ficarei grato!
 */
