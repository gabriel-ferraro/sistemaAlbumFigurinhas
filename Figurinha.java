package sistemaAlbumFigurinhas;

public class Figurinha {

	public int id;
	public double raridade;
	
	Figurinha() {
		this.id = randomizaFigurinha();
	}
	
	//No enunciado é dito que há 678 figurinhas no album, então o valor randômico gerado pode variar de 0 até 677
	public int randomizaFigurinha() {
		return (int) (Math.random() * 677);
	}
}
