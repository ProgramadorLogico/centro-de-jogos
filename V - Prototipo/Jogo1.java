// Imports
import java.util.Scanner;
import java.util.Random;

// Classe Jogo1
public class Jogo1 {

	// Variáveis públicas
	public Scanner scanner;
	public Random random;

	// Variáveis privadas
	private boolean rodando;
	private String input;
	private int chances;
	private boolean inputValido;
	private int numeroAleatorio;
	
	// Construtor
	public Jogo1() {

		// Inicia o jogo
		iniciar();

		// Exibe o título
		System.out.println("");
		System.out.println("╔═══════════════════════════╗");
		System.out.println("║     Adivinhe o número     ║");
		System.out.println("╚═══════════════════════════╝");

		// Loop
		while (rodando) {

			System.out.println("Hello?");

			// Pega a entrada
			input = pegarEntrada("Digite um número de 1 a 100: ");

			// Tenta converter
			try {

				// Tenta converter
				int inputInt = Integer.parseInt(input);

				// Caso seja válido
				if (input == numeroAleatorio) {

					// Logs
					System.out.println("");
					System.out.println("Você venceu!");

					// Encerra
					encerrar();

				// Caso não seja
				} else {
					System.out.println("Não foi dessa vez, tente novamente");
				}

			// Roda se dar erro
			} catch (NumberFormatException e) {
				System.out.println("Você não digitou número!");
			}
		}
	}

	// Método de inicialização
	public void iniciar() {

		// Começa os logs
		System.out.println("A dependências a resolver");
		System.out.println("Iniciando...");

		// Carrega variáveis
		System.out.println("Carregando variáveis...");
		scanner = new Scanner(System.in);
		random = new Random();
		rodando = true;
		input = null;
		chances = 5;
		inputValido = false;
		setarNumero();
		System.out.println("Variáveis carregadas");
	}

	// Método que pega a entrada do usuário
	public static String pegarEntrada(String texto) {

		// Printa a mensagem e pega a resposta
		System.out.print(texto);
		String entrada = scanner.nextLine();

		// Retorna o valor recebido
		return entrada;
	}

	// Método para selecionar um número
	public void setarNumero() {

		// Altera a variável 
		numeroAleatorio = random.nextInt(100) + 1;
	}

	// Método de encerramento
	public void encerrar(int erros) {

		// Logs de encerramento
		System.out.println("Encerrando...");
		System.out.println("Nenhuma dependência a resolver");	
		System.out.println("Programa encerrado");

		// Fecha o programa
		new Menu();
	}
}
