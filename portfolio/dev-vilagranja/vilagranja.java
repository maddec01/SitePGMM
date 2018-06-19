import java.util.InputMismatchException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class vilagranja {
	//variaveis globais
	static Scanner in = new Scanner(System.in);
	static int segundosDia = 60;
	static Timer tempo;
	static String[][] terreno = new String[50][20];
	static int[][] lotes = new int[0][4];
	static int[] tempoColheitaLote = new int[0];
	static String[] plantadoLote = new String[0];
	static boolean jogoActivo;
	static int ouro = 1500;
	static String[] produtos = {"batata", "cenoura", "alface", "morango", "abobora", "milho", "tomate", "pessego", "laranja", "banana", "couve", "espargo", "alho", "cebola", "cereja", "nespra", "kiwi"};
	static String[] produtosIcon = {"b", "C", "a", "m", "f", "u", "o", "p", "l", "h", "U", "e", "g", "O", "j", "S", "w"};
	static int[] produtosPreco = {10, 8, 20, 11, 22, 6, 12, 18, 20, 25, 10, 80, 5, 8, 50, 70, 50};
	static int[] produtosLucro = {15, 12, 30, 17, 35, 8, 15, 30, 30, 50, 16, 150, 10, 17, 100, 120, 120};
	static int[] produtosTempo = {90, 80, 110, 70, 150, 60, 70, 100, 160, 95, 70, 150, 70, 80, 100, 120, 130};

	public static void main(String[] args) {
		System.out.println("**************** Bem-vindo ao VilaGranja ****************");
		System.out.println("*                                                       *");
		System.out.println("*      Criado por: Paulo Costa nº9263 - Multimédia      *");
		System.out.println("*                  Pedro Gomes nº9155 - Multimédia      *");
		System.out.println("*                    ISMT 2012                          *");
		System.out.println("*                                                       *");
		System.out.println("*********************************************************");
		System.out.println("");
		System.out.println("Neste jogo poder criar uma pequena quinta e transforma-la");
		System.out.println("num gigantesco complexo agricola!");
		System.out.println("");
		System.out.println("Prima ENTER para começar a plantar.");
		
		in.nextLine();
		comecaJogo();
			
		boolean sairPrograma = true;
		
		while (sairPrograma) {
			System.out.println("Escreva 'sair' para sair, ou 'voltar'.");
			String voto = in.next();
			
			if (voto.equals("sair")) {
				System.out.println("A sair do programa..");
				sairPrograma = false;
				tempo.stop();
				System.out.print("Sucesso!");
			}
			else if (voto.equals("voltar")) {
				tempo.start();
				jogoActivo = true;
				comecaJogo();
			}
			else {
				System.out.println("Comando inválido.");
			}
		}
	}
	
	//escuta o evento timer
	static ActionListener actionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			descontaDias(1);
		}
	};
	
	public static void comecaJogo () {
		//primeira vez que abre o jogo
		if (!jogoActivo) {
			System.out.println("Bem-vindo á sua quinta!");
			preencheTerreno(terreno);
			imprimeTerreno(terreno);
			//começa a contar os dias.
			tempo = new Timer(segundosDia*1000, actionListener);
			tempo.start();
			System.out.println("Para obter ajuda sobre os comandos e sobre o jogo digite 'ajuda'.");
			System.out.println("Também pode digitar 'pausa' em qualquer altura para parar o jogo");
			System.out.println("e/ou poder sair.");
		}
		//voltando da pausa
		else {
			System.out.println("Ainda bem que decidio regressar á sua quinta!");
			imprimeTerreno(terreno);
		}
		
		jogoActivo = true;
		
		//fica a espera de instruções
		while (jogoActivo) {
			//limpa o buffer evitando repetições
			in = new Scanner(System.in);
			
			System.out.println("\nComando:");
			String voto = in.next();
			//pausa
			if (voto.equals("pausa")) {
				tempo.stop();
				jogoActivo = false;
			}
			//ajuda
			else if (voto.equals("ajuda")) {
				listaComandos();
			}
			//mostra terreno
			else if (voto.equals("terreno")) {
				imprimeTerreno(terreno);
			}
			//intervalo
			else if (voto.equals("intervalo")) {
				int seg = 0;
				try {
					System.out.println("Quantos segundos terá o seu dia? ATENÇÃO: minimo 10 segundos");
					seg = in.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("ERRO: So pode inserir numeros");
				}
				if (seg < 10) {
					System.out.println("ERRO: Minimo 10 segundos.");
				}
				else if (seg >= 10) {
					alterarTempo(seg);
				}
			}
			//saltar dias
			else if (voto.equals("saltardias")) {
				try {
					System.out.println("Quantos dias pretende adiantar?");
					int dias = in.nextInt();
					descontaDias(dias);
				} catch (InputMismatchException e) {
					System.out.println("ERRO: So pode inserir numeros");
				}
			}
			//comprar terreno
			else if (voto.equals("comprar")) {
				int linhas = 0;
				if (ouro > 200) {
					try {
						System.out.println("Quantas linhas deseja adicionar? (200ouros por linha)");
						linhas = in.nextInt();
						if ((linhas*200) <= ouro) {
							comprarTerreno(terreno,linhas);
						}
						else {
							System.out.println("ERRO: Não tem ouros suficientes.");
						}
					} catch (InputMismatchException e) {
						System.out.println("ERRO: So pode inserir numeros");
					}
				}
				else {
					System.out.println("ERRO: Não tem ouros suficientes. (Minimo: 200)");
				}
			}
			//lista de produtos
			else if (voto.equals("produtos")) {
				listaProdutos();
			}
			//lista de lotes
			else if (voto.equals("lotes")) {
				mostraTabelaLotes();
			}
			//plantar lote
			else if (voto.equals("plantar")) {
				try {
					System.out.println("Qual o lote que deseja plantar?");
					int l = in.nextInt();
					plantaConfirmacao(l);
				} catch (InputMismatchException e) {
					System.out.println("ERRO: So pode inserir numeros");
				}
			}
			//ver lucros ao fim de x dias
			else if (voto.equals("lucros")) {
				try {
					System.out.println("Deseja simular quantos dias?");
					int dias = in.nextInt();
					calculaLucros(dias);
				} catch (InputMismatchException e) {
					System.out.println("ERRO: So pode inserir numeros");
				}
			}
			//colher o lote
			else if (voto.equals("colher")) {
				try {
					System.out.println("Qual o lote que deseja colher?");
					int l = in.nextInt();
					colherConfirmacao(l);
				} catch (InputMismatchException e) {
					System.out.println("ERRO: So pode inserir numeros");
				}
			}
			//eleminar lote
			else if (voto.equals("eliminalote")) {
				try {
					System.out.println("Qual o lote que deseja apagar?");
					int l = in.nextInt();
					eliminaLoteConfirmacao(l);
				} catch (InputMismatchException e) {
					System.out.println("ERRO: So pode inserir numeros");
				}
			}
			//cria um lote no terreno
			else if (voto.equals("crialote")) {
				int inicioL = 0; int inicioC = 0;
				try {
					System.out.println("Digite as coordenadas para a posição inicial: [linha - coluna]:");
					inicioL = in.nextInt();
					inicioC = in.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("ERRO: So pode inserir numeros");
				}
				try {
					System.out.println("Digite as coordenadas para a posição final: [linha - coluna]:");
					int fimL = in.nextInt();
					int fimC = in.nextInt();
					criaLote(terreno, inicioL, inicioC, fimL, fimC);
				} catch (InputMismatchException e) {
					System.out.println("ERRO: So pode inserir numeros");
				}
			}
			//erro
			else {
				System.out.println("Comando inválido!");
			}
		}
	}
	
	//lista de comandos
	public static void listaComandos () {
		System.out.println("\nLista de comandos:");
		System.out.println("intervalo                 - permite alterar a duração do dia (valor por defeito: 60segundos");
		System.out.println("crialote                  - permite criar novos lotes");
		System.out.println("saltardias                - permite avançar X dias na sua quinta");
		System.out.println("eliminalote               - permite eliminar lotes existentes");
		System.out.println("plantar                   - permite plantar nos lotes");
		System.out.println("colher                    - permite remover os produtos do lote");
		System.out.println("comprar                   - permite adicionar mais area de terreno");
		System.out.println("terreno                   - mostra o terreno");
		System.out.println("produtos                  - mostra lista dos produtos disponiveis");
		System.out.println("lotes                     - mostra informação sobre os lotes");
		System.out.println("lucros                    - mostra informação sobre os lucros ao fim de X dias");
		System.out.println("pausa                     - pausa o jogo e permite sair");
		System.out.println();
	}
	
	//imprime o terrno na consola
	public static void imprimeTerreno (String [][] t) {
		System.out.println();
		//marcas linha
		System.out.print("   ");
		int contador = 1;
		for(int n = 0; n < t.length; n++) {
			if (n == 0) {
				System.out.print(".");
				contador++;
			}
			else if (contador == 5) {
				System.out.print(".");
				contador = 1;
			}
			else {
				System.out.print(" ");
				contador++;
			}
		}
		System.out.println(" ");
		//primeira linha
		System.out.print("  -");
		for(int n = 0; n < t.length; n++) {
			System.out.print("-");
		}
		System.out.println("-");
		//conteudo
		contador = 1;
		for(int m = 0; m < t[m].length; m++) {
			if (m == 0) {
				System.out.print("-| ");
				contador++;
			}
			else if (contador == 5) {
				System.out.print("-| ");
				contador = 1;
			}
			else {
				System.out.print(" | ");
				contador++;
			}
			for(int n = 0; n < t.length; n++) {
				System.out.print(t[n][m]);
			}
			System.out.println(" |");
		}
		//ultima linha
		System.out.print("  -");
		for(int n = 0; n < t.length; n++) {
			System.out.print("-");
		}
		System.out.println("-");
		System.out.println("    Ouro: " + ouro + "          Duração do dia: " + segundosDia + " segundos." );
		System.out.println();
	}
	
	//preenche o terreno com espaços
	public static void preencheTerreno (String [][] t) {
		for(int n = 0; n < t.length; n++) {
			for(int m = 0; m < t[n].length; m++) {
				t[n][m]=" ";
			}
		}
	}
	
	//comando que cria um lote novo no array lotes e volta a criar a matrix terreno
	public static void criaLote (String [][] t, int inicioL, int inicioC, int fimL, int fimC) {
		//verifica se está dentro dos limites do terreno
		if ((inicioL > t[0].length) || (fimL > t[0].length)) {
			System.out.println("ERRO: O lote que quer criar está fora dos limites do terreno.");
			return;
		}
		else if ((inicioC > t.length) || (fimC > t.length)) {
			System.out.println("ERRO: O lote que quer criar está fora dos limites do terreno.");
			return;
		}
		//verifica se está a escrever em cima de outro lote
		for(int n = (inicioC - 1); n < fimC; n++) {
			for(int m = (inicioL - 1); m < fimL; m++) {
				if (!t[n][m].equals(" ")) {
					System.out.println("ERRO: O lote que quer criar sobrepõe um existente.");
					return;
				}
			}
		}
		//acrescenta uma posição no array lotes e guarda as coordenadas
		int[][] lotesTemp = new int[lotes.length][4];
		for(int n = 0; n < lotes.length; n++) {
			for(int m = 0; m < lotes[n].length; m++) {
				lotesTemp[n][m] = lotes[n][m];
			}
		}
		lotes = new int[lotesTemp.length + 1][4];
		for(int n = 0; n < lotesTemp.length; n++) {
			for(int m = 0; m < lotesTemp[n].length; m++) {
				lotes[n][m] = lotesTemp[n][m];
			}
		}
		lotes[lotes.length - 1][0] = inicioL; lotes[lotes.length - 1][1] = inicioC; lotes[lotes.length - 1][2] = fimL; lotes[lotes.length - 1][3] = fimC;
		
		//acrecenta uma posição no array tempoColheitaLote
		int[] tempoColheitaTemp = new int[tempoColheitaLote.length];
		for(int n = 0; n < tempoColheitaLote.length; n++) {
			tempoColheitaTemp[n] = tempoColheitaLote[n];
		}
		tempoColheitaLote = new int[tempoColheitaTemp.length + 1];
		for(int n = 0; n < tempoColheitaTemp.length; n++) {
			tempoColheitaLote[n] = tempoColheitaTemp[n];
		}
		
		//acrecenta uma posição no array tempoColheitaLote
		String[] plantadoTemp = new String[plantadoLote.length];
		for(int n = 0; n < plantadoLote.length; n++) {
			plantadoTemp[n] = plantadoLote[n];
		}
		plantadoLote = new String[plantadoTemp.length + 1];
		for(int n = 0; n < plantadoTemp.length; n++) {
			plantadoLote[n] = plantadoTemp[n];
		}
		plantadoLote[plantadoLote.length - 1] = "+";
		tempoColheitaLote[tempoColheitaLote.length - 1] = 0;
		
		//desenha os lotes no array terreno
		desenhaLotes();
		//sucesso
		System.out.println("Lote " + lotes.length + ", criado com sucesso!");
		imprimeTerreno(terreno);
	}
	
	//desenha os lotes no array terreno
	public static void desenhaLotes () {
		//apaga primeiro tudo e cria de novo
		preencheTerreno(terreno);
		for(int l = 0; l < lotes.length; l++) {
			for(int n = (lotes[l][1] - 1); n < lotes[l][3]; n++) {
				for(int m = (lotes[l][0] - 1); m < lotes[l][2]; m++) {
					if ((n == (lotes[l][1] - 1)) && (m == (lotes[l][0] - 1))) {
						terreno[n][m] = "" + (l + 1);
					}
					else if ((n == (lotes[l][3] - 1)) && (m == (lotes[l][2] - 1))) {
						terreno[n][m] = "" + (l + 1);
					}
					else {
						//busca o simbolo ao array lotes plantados
						terreno[n][m] = plantadoLote[l];
					}
				}
			}
		}
	}
	
	//confirmação da eliminaçao do lote
	public static void eliminaLoteConfirmacao (int l) {
		if (l > (lotes.length)) {
			System.out.println("ERRO: O lote que está a tentar apagar nao existe!");
			return;
		}
		//caso esteja livre
		if (plantadoLote[l-1].equals("+")) {
			System.out.println("Tem a certeza que quer eliminar o lote? [sim / nao]");
			String temp = in.next();
			if (temp.equals("sim")) {
				eliminaLote(l);
				desenhaLotes();
				imprimeTerreno(terreno);
			}
			else if (temp.equals("nao")) {
				return;
			}
			else {
				System.out.println("ERRO: So pode responder 'sim' ou 'nao'.");
				eliminaLoteConfirmacao(l);
			}
		}
		//caso esteja plantado
		else {
			System.out.println("O lote está já plantado! Para elimina-lo terá de pagar uma taxa de 50 ouros. Deseja continuar? [sim / nao]");
			String temp = in.next();
			if (temp.equals("sim")) {
				ouro = ouro - 50;
				eliminaLote(l);
				desenhaLotes();
				imprimeTerreno(terreno);
			}
			else if (temp.equals("nao")) {
				return;
			}
			else {
				System.out.println("ERRO: So pode responder 'sim' ou 'nao'.");
				eliminaLoteConfirmacao(l);
			}
		}
	}
	
	//elimina lote definitivamente
	public static void eliminaLote (int l) {
		//puxa todos os lotes depois do que se quer apagar para tras e apaga o ultimo
		for(int n = 0; n < lotes.length; n++) {
			for(int m = 0; m < lotes[n].length; m++) {
				if ((n >= (l - 1)) && (n < (lotes.length - 1))) {
					lotes[n][m] = lotes[n+1][m];
				}
			}
		}
		for(int n = 0; n < tempoColheitaLote.length; n++) {
			if ((n >= (l - 1)) && (n < (tempoColheitaLote.length - 1))) {
				tempoColheitaLote[n] = tempoColheitaLote[n+1];
			}
		}
		for(int n = 0; n < plantadoLote.length; n++) {
			if ((n >= (l - 1)) && (n < (plantadoLote.length - 1))) {
				plantadoLote[n] = plantadoLote[n+1];
			}
		}
		//reduz o comprimento do array lotes 1 unidade
		//lotes
		int[][] lotesTemp = new int[lotes.length][4];
		for(int n = 0; n < lotes.length; n++) {
			for(int m = 0; m < lotes[n].length; m++) {
				lotesTemp[n][m] = lotes[n][m];
			}
		}
		lotes = new int[lotesTemp.length - 1][4];
		for(int n = 0; n < lotes.length; n++) {
			for(int m = 0; m < lotes[n].length; m++) {
				lotes[n][m] = lotesTemp[n][m];
			}
		}
		//tempoColheitaLotes
		int[] tempoColheitaTemp = new int[tempoColheitaLote.length];
		for(int n = 0; n < tempoColheitaLote.length; n++) {
			tempoColheitaTemp[n] = tempoColheitaLote[n];
		}
		tempoColheitaLote = new int[tempoColheitaTemp.length - 1];
		for(int n = 0; n < tempoColheitaLote.length; n++) {
			tempoColheitaLote[n] = tempoColheitaTemp[n];
		}
		//plantadoLote
		String[] plantadoTemp = new String[plantadoLote.length];
		for(int n = 0; n < plantadoLote.length; n++) {
			plantadoTemp[n] = plantadoLote[n];
		}
		plantadoLote = new String[plantadoTemp.length - 1];
		for(int n = 0; n < plantadoLote.length; n++) {
			plantadoLote[n] = plantadoTemp[n];
		}
	}
	
	//elimina o que esta plantado no lote 'l'
	public static void eliminaConteudo (int l) {
		tempoColheitaLote[l-1] = 0;
		plantadoLote[l-1] = "+";
		desenhaLotes();
	}
	
	//confirmação do comando plantar
	public static void plantaConfirmacao (int l) {
		//caso nao exista
		if (l > (lotes.length)) {
			System.out.println("ERRO: O lote que está a tentar plantar nao existe!");
			return;
		}
		//caso esteja plantado
		if(plantadoLote[l - 1] != "+") {
			System.out.println("ERRO: O lote " + l + " já está plantado!");
			return;
		}
		
		boolean escolha = true;
		
		//espera de escolha (erro se n for nenhuma e continua a espera)
		while (escolha) {
			System.out.println("Qual o produto que deseja plantar? (Pode tambem escrever 'voltar' ou 'produtos')");
			String produto = in.next();
			
			if (produto.equals("voltar")) {
				escolha = false;
			}
			else if (produto.equals("produtos")) {
				listaProdutos();
			}
			else if (verificaProduto(produto)) {
				if (custoPlantarLote(produto,l) > ouro ) {
					System.out.println("ERRO: Não tem ouro suficiente para pantar " + produto + " no lote " + l + ". Custo " + custoPlantarLote(produto,l) + "\n");
				}
				else {
					plantaProduto(produto,posicaoProduto(produto),l,custoPlantarLote(produto,l));
					escolha = false;
				}
			}
			//erro
			else {
				System.out.println("ERRO: Produto ou comando inválido!");
			}
		}
	}
	
	//confirmação para plantar o produto p no lote l
	public static void plantaProduto (String produto, int p, int l, int q) {
		System.out.println("Tem a certeza que quer plantar " + produto + "s no lote " + l + "? Custo: " + q + " [sim / nao]");
		String temp = in.next();
		if (temp.equals("sim")) {
			plantadoLote[l-1] = produtosIcon[p];
			tempoColheitaLote[l-1] = produtosTempo[p];
			ouro = ouro - q;
			desenhaLotes();
			System.out.println("Lote " + l + ", plantado com sucesso!");
			imprimeTerreno(terreno);
		}
		else if (temp.equals("nao")) {
			return;
		}
		else {
			System.out.println("ERRO: Comando inválido!");
			plantaProduto(produto,p,l,q);
		}
	}
	
	//confirmação para colher o lote l
	public static void colherConfirmacao (int l) {
		//caso não exista o lote
		if (l > (lotes.length)) {
			System.out.println("ERRO: O lote que está a tentar colher nao existe!");
			return;
		}
		//caso nao esteja plantado
		else if(plantadoLote[l-1].equals("+")) {
			System.out.println("ERRO: Este lote não tem nada plantado.");
		}
		else {
			//verifica o tempo que falta para colher
			if(tempoColheitaLote[l-1] >= 1) {
				System.out.println("Como o produto não está pronto para colheita terá de pagar 50 ouros de taxa e não receberá lucros." );
				System.out.println("Tem a certeza que quer remover " + buscaNomeProdutoLote(l) + " do lote? [sim / nao]" );
				String temp = in.next();
				if (temp.equals("sim")) {
					ouro = ouro - 50;
					eliminaConteudo(l);
					imprimeTerreno(terreno);
				}
				else if (temp.equals("nao")) {
					return;
				}
				else {
					System.out.println("ERRO: Comando inválido!");
					colherConfirmacao(l);
				}
			}
			//e se estiver pronto
			else {
				System.out.println("Tem a certeza que quer remover " + buscaNomeProdutoLote(l) + " do lote? Lucro: " + lucrosLotePlantado(l) + " [sim / nao]" );
				String temp = in.next();
				if (temp.equals("sim")) {
					ouro = ouro + lucrosLotePlantado(l);
					eliminaConteudo(l);
					imprimeTerreno(terreno);
				}
				else if (temp.equals("nao")) {
					return;
				}
				else {
					System.out.println("ERRO: Comando inválido!");
					colherConfirmacao(l);
				}
			}
		}
	}
	
	//desconta d dias na simulação
	public static void descontaDias (int d) {
		for(int n = 0; n < tempoColheitaLote.length; n++) {
			if (tempoColheitaLote[n] > 0) {
				tempoColheitaLote[n] = tempoColheitaLote[n] - d;
			}
		}
		for(int n = 0; n < tempoColheitaLote.length; n++) {
			if (tempoColheitaLote[n] < 0) {
				tempoColheitaLote[n] = 0;
			}
		}
		for(int n = 0; n < tempoColheitaLote.length; n++) {
			if ((tempoColheitaLote[n] == 0) && (plantadoLote[n] != "+")) {
				System.out.println("Lote: " + (n+1) + "		Produto: " + buscaNomeProdutoLote(n+1) + "		Está pronto a ser colhido.");
			}
		}
	}
	
	//verifica se o produto existe
	public static boolean verificaProduto (String p) {
		for(int n = 0; n < produtos.length; n++) {
			if(p.equals(produtos[n])) {
				return true;
			}
		}
		return false;
	}
	
	//devolve o nome do produto do lote l
	public static String buscaNomeProdutoLote (int l) {
		for(int n = 0; n < produtosIcon.length; n++) {
			if(plantadoLote[l-1].equals(produtosIcon[n])) {
				return produtos[n];
			}
		}
		return "nenhum";
	}
	
	//calcula o custo para plantar p produto no lote l
	public static int custoPlantarLote (String p, int l) {
		int quantidade = 0;
		for(int n = (lotes[l-1][1] - 1); n < lotes[l-1][3]; n++) {
			for(int m = (lotes[l-1][0] - 1); m < lotes[l-1][2]; m++) {
				quantidade++;
			}
		}
		return produtosPreco[posicaoProduto(p)]*quantidade;
	}
	
	//calcula os lucros do lote l
	public static int lucrosLotePlantado (int l) {
		int quantidade = 0;
		for(int n = (lotes[l-1][1] - 1); n < lotes[l-1][3]; n++) {
			for(int m = (lotes[l-1][0] - 1); m < lotes[l-1][2]; m++) {
				quantidade++;
			}
		}
		return produtosLucro[posicaoProduto(buscaNomeProdutoLote(l))]*quantidade;
	}
	
	//devolve a posição do produto 'p' no array produtos
	public static int posicaoProduto (String p) {
		int pNumero = 0;
		for(int n = 0; n < produtos.length; n++) {
			if(p.equals(produtos[n])) {
				pNumero = n;
			}
		}
		return pNumero;
	}
	
	//confirmação para adicionar linhas ao terreno
	public static void comprarTerreno (String[][] t, int linhas) {
		System.out.println("Tem a certeza que quer continuar? [sim / nao] Custo: " + (linhas *200));
		String temp = in.next();
		if (temp.equals("sim")) {
			//cria terreno temporario para aumentar o original
			String tempTerreno [][] = new String[t.length][t[1].length];
			for(int n = 0; n < t.length; n++) {
				for(int m = 0; m < t[n].length; m++) {
					tempTerreno [n][m] = t[n][m]; 
				}
			}
			terreno = new String[tempTerreno.length][tempTerreno[1].length + linhas];
			for(int n = 0; n < t.length; n++) {
				for(int m = 0; m < t[n].length; m++) {
					t[n][m] = tempTerreno [n][m]; 
				}
			}
			ouro = ouro - (linhas * 200);
			desenhaLotes();
			imprimeTerreno(terreno);
			System.out.println("Adicionou com sucesso " + linhas + " linha(s) ao seu terreno.");
		}
		else if (temp.equals("nao")) {
			return;
		}
		else {
			System.out.println("ERRO: Comando inválido.");
			comprarTerreno(t,linhas);
		}
	}
	
	//mostra uma lista dos produtos disponiveis
	public static void listaProdutos () {
		System.out.println("\nProdutos	Icon		Preco		Lucro		Tempo");
		for(int n = 0; n < produtos.length; n++) {
			System.out.println(produtos[n] + "		" + produtosIcon[n] + "		" + produtosPreco[n] + "		" + produtosLucro[n] + "		" + produtosTempo[n]);
		}
		System.out.println();
	}

	//confirmação para alteração da duração dos dias
	public static void alterarTempo (int seg) {
		System.out.println("Tem a certeza que quer continuar? [sim / nao]");
		String temp = in.next();
		if (temp.equals("sim")) {
			tempo.stop();
			segundosDia = seg;
			tempo = new Timer(segundosDia*1000, actionListener);
			tempo.start();
			System.out.println("Tempo alterado com sucesso!\n");
			imprimeTerreno(terreno);
			return;
		}
		else if (temp.equals("nao")) {
			return;
		}
		else {
			System.out.println("ERRO: Comando inválido.");
			alterarTempo(seg);
		}
	}
	
	//mostra uma tabela com informação sobre os lotes
	public static void mostraTabelaLotes () {
		System.out.println("Tabela dos lotes:\n");
		for(int n = 0; n < plantadoLote.length; n++) {
			System.out.println("Lote: " + (n+1) + "		Produto: " + buscaNomeProdutoLote(n+1) + "		Dias para colheita: " + tempoColheitaLote[n]);
		}
	}
	
	//mostra informação sobre os lucros ao fim de X dias
	public static void calculaLucros (int d) {
		System.out.println("Tabela de lucros ao fim de " + d + " dia(s):\n");
		int lucro = 0;
		for(int n = 0; n < plantadoLote.length; n++) {
			if ((tempoColheitaLote[n] <= d) && (plantadoLote[n] != "+")) {
				System.out.println("Lote: " + (n+1) + "		Produto: " + buscaNomeProdutoLote(n+1) + "		Lucro: " + lucrosLotePlantado(n + 1));
				lucro = lucro + lucrosLotePlantado(n + 1);
			}
		}
		System.out.println("Lucros ao fim de " + d + " dia(s): " + lucro + "\n");
	}
}