package br.com.alura.screenmatch;

public class Recomendacao {
	private String recomendacao;

	public void filtra(Classificavel classificavel) {
		if (classificavel.getClassificacao() >= 4) {
			System.out.println("Esta entre os preferidos do momneto");
		} else if (classificavel.getClassificacao() >= 2) {
			System.out.println("Muito bem avaliado no momento");
		} else {
			System.out.println("Coloque na sua lista para assistir depois");
		}

	}

}
