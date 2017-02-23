package forcaEstruct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class TestaForca {
	static ArrayList<String> jogadores = new ArrayList<>();
	static Random r = new Random();
	static String situacao;
	static String jogador;
	static boolean tema = false;
	static int indicePalavra = r.nextInt(3);
	static int pontos;
	static Set<String> letrasErradas;
	static Set<String> letrasCorretas;
	static Set<String> allLetras;
	static String[] boneco = new String[6];
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String letra = " ";
		List<String> titulo = new ArrayList<>();
		List<String> frutas = new ArrayList<>();
		List<String> animais = new ArrayList<>();
		int op;

		frutas.add("MACA");
		frutas.add("BANANA");
		frutas.add("LARANJA");

		animais.add("MACACO");
		animais.add("ONCA");
		animais.add("LEAO");

		String menu = "\n---     Menu     ---" + "\n 1  - Iniciar nova rodada" + "\n 2  - Score"
				+ "\n 3  - adicionar tema" + "\n 0  - Sair";

		do {
			situacao = "ATIVA";
			pontos = 0;
			letrasErradas = new HashSet<>();
			letrasCorretas = new HashSet<>();
			allLetras = new HashSet<>();
			tema = r.nextBoolean();
			titulo = tema ? frutas : animais;//gerando aleatoriamente o tema
			upallLetras(titulo.get(indicePalavra));
			System.out.println(menu);
			System.out.print("Informe a opcao desejada: ");
			op = leia.nextInt();
			switch (op) {
			case 1:// Criando uma nova rodada
				System.out.print("Informe seu nome: ");
				jogador = leia.next();
				
				do {
					showBoneco(titulo.get(indicePalavra), letra);
					System.out.print("Entre com uma letra: ");
					letra = leia.next();
					findLetters(titulo.get(indicePalavra), letra);
				} while (situacao.equals("ATIVA"));
				break;
			case 2:// Lendo o score
				showScore();
				break;
			case 0:// Sair do jogo
				System.out.println("Fim de jogo.");
				break;
			default:
				System.out.println("Digite uma opcao valida!");
				break;
			}

		} while (op != 0);

	}
	
	public static void showBoneco(String palavra, String c){
		atualizaBoneco(letrasErradas.size());
		System.out.println("-----------------------------------------------");
		System.out.println("Tema: " + (tema ?  "frutas" : "animais") );
		for (String s : boneco) System.out.println(s);
		getPalavrasEscondida(palavra, c);
		System.out.println("Letras acertadas: " + letrasCorretas);
		System.out.println("Letras erradas: " + letrasErradas);
	}

	private static void pontuar(String frase, char c) {
		int cont=0;
		if(frase.contains(String.valueOf(c))){
			for (char chr : frase.toCharArray())
				if(chr == c)
					cont++;
			letrasCorretas.add(String.valueOf(c));
		}else{
			letrasErradas.add(String.valueOf(c));
		}
			
		if(cont == 0) pontos -= 100;
		else pontos += 100 + 15 * cont;
		
		
	}

	public static void findLetters(String word, String c){
			if (word.contains(String.valueOf(c.toUpperCase().charAt(0)))) {
				letrasCorretas.add(String.valueOf(c.toUpperCase().charAt(0)));
				pontuar(word, c.toUpperCase().charAt(0));
				if (allLetras.size() == letrasCorretas.size() ) {
					for (String s : boneco) System.out.println(s);
					getPalavrasEscondida(word, c);
					System.out.println("Voce ganhou!");
					situacao = "GANHA";
					pontuar(word.toString(), c.toUpperCase().charAt(0));
					jogadores.add(jogador+" - "+pontos);
				}
			} else {
				letrasErradas.add((String.valueOf(c.toUpperCase().charAt(0))));
				pontuar(word.toString(), c.toUpperCase().charAt(0));
				
				if (letrasErradas.size() == 6){
					for (String s : boneco) System.out.println(s);
					getPalavrasEscondida(word, c);
					System.out.println("Voce perdeu! :(");
					situacao = "PERDIDA";
					pontuar(word.toString(), c.toUpperCase().charAt(0));
					jogadores.add(jogador+" - "+pontos);
				}
			}
	}
	
	private static void atualizaBoneco(int chances) {
		if (chances == 0) {
			boneco[0] = "---------";
			boneco[1] = "       | ";
			boneco[2] = "         ";
			boneco[3] = "         ";
			boneco[4] = "         ";
			boneco[5] = "\n";
		} else if (chances == 1) {
			boneco[0] = "---------";
			boneco[1] = "       | ";
			boneco[2] = "       0 ";
			boneco[3] = "         ";
			boneco[4] = "         ";
			boneco[5] = "\n";
		} else if (chances == 2) {
			boneco[0] = "---------";
			boneco[1] = "       | ";
			boneco[2] = "       0 ";
			boneco[3] = "      /  ";
			boneco[4] = "         ";
			boneco[5] = "\n";
		} else if (chances == 3) {
			boneco[0] = "---------";
			boneco[1] = "       | ";
			boneco[2] = "       0 ";
			boneco[3] = "      /| ";
			boneco[4] = "         ";
			boneco[5] = "\n";
		} else if (chances == 4) {
			boneco[0] = "---------";
			boneco[1] = "       | ";
			boneco[2] = "       0 ";
			boneco[3] = "      /|\\";
			boneco[4] = "         ";
			boneco[5] = "\n";
		} else if (chances == 5) {
			boneco[0] = "---------";
			boneco[1] = "       | ";
			boneco[2] = "       0 ";
			boneco[3] = "      /|\\";
			boneco[4] = "      /  ";
			boneco[5] = "\n";
		} else if (chances == 6) {
			boneco[0] = "---------";
			boneco[1] = "       | ";
			boneco[2] = "       0 ";
			boneco[3] = "      /|\\";
			boneco[4] = "      / \\";
			boneco[5] = "\n";
		}
	}
	
	public static void showScore(){
		for (String string : jogadores) System.out.println(string);
	}
	
	public static void upallLetras(String word){
		for (char s : word.toCharArray()) allLetras.add(String.valueOf(s));
	}
	
	public static void getPalavrasEscondida(String palavra, String c){
		String palavraEscondida = "";
		for (char ltr : palavra.toCharArray()) {
			if (letrasCorretas.contains(String.valueOf(ltr))) {
				palavraEscondida += ltr + " ";
			} else if (ltr == c.toUpperCase().charAt(0)) {
				palavraEscondida += c + " ";
			} else {
				palavraEscondida += "_" + " ";
			}
		}
		System.out.println("Palavra:   "+palavraEscondida);
	}
}
