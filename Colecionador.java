package sistemaAlbumFigurinhas;

public class Colecionador {
	
	public String nome;
	public Album album;
	
	//Percorre a lista de figurinhas e as imprime
	public void figurinhasObtidas() {
		for(int i = 0; i < album.figurinhas.size(); i++) {
			System.out.println("Figurinha id: " + album.figurinhas.get(i).id);
		}
	}
	
	//Checa se existem figurinhas repetidas e quantas
	public void figurinhasRepetidas() {
		int repetidas = 0;
		
		for(int i = 0; i < album.figurinhas.size()-1; i++) {
			for(int j = i+1; j < album.figurinhas.size(); j++) {
				if(album.figurinhas.get(i).id == album.figurinhas.get(j).id) {
					System.out.println("id repetida: " + album.figurinhas.get(i).id);
					repetidas++;
				}
			}
		}
		
		System.out.println("Qtde figurinhas repetidas: " + repetidas);
	}
}
