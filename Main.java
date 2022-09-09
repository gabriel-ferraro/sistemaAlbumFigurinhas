package sistemaAlbumFigurinhas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Album album = new Album();
		Colecionador colecionador = new Colecionador();
		Scanner scan = new Scanner(System.in);
		
		colecionador.album = album;
		
		System.out.println("Qual e o nome do colecionador?");
		colecionador.nome = scan.next();
		
		System.out.printf("Quantas figurinhas tem %s? \n", colecionador.nome);
		colecionador.album.qtdeFigurinhas = scan.nextInt();
		
		//Instancia a quantidade de figurinhas que o colecionador possui
		for(int i = 0; i < colecionador.album.qtdeFigurinhas; i++) {
			colecionador.album.figurinhas.add(new Figurinha());
		}

		System.out.printf("Lista de figurinhas de %s:\n\n", colecionador.nome);
		colecionador.figurinhasObtidas();
		
		System.out.println("\nFigurinhas repetidas: " + colecionador.figurinhasRepetidas());
		
		System.out.println("\nAlbum completo: " + colecionador.isAlbumCompleto());
	}
}
