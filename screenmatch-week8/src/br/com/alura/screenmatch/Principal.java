package br.com.alura.screenmatch;
public class Principal {

	public static void main(String[] args) {

		// criando variavel do Filme
		Filme meuFilme = new Filme();
		// alimentando os atributos
		 meuFilme.setNome("O poderoso chefão");
	        meuFilme.setAnoDeLancamento(1970);
	        meuFilme.setDuracaoEmMinutos(180);
	        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

		// imprimindo na tela para usuario ver linha 14 e 15
		// System.out.println(meuFilme.nome);
		// System.out.println(meuFilme.anoDeLancamento);

		// imprimindo na tela pelo void incluido na class Filme sem ser privado
	        meuFilme.exibeFichaTecnica();
	        meuFilme.avalia(8);
	        meuFilme.avalia(5);
	        meuFilme.avalia(10);
	        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
	        System.out.println(meuFilme.pegaMedia());
	        //meuFilme.somaDasAvaliacoes = 10;
	        //meuFilme.totalDeAvaliacoes = 1;
	        //System.out.println(meuFilme.pegaMedia());
		
	        Serie lost = new Serie();
	        lost.setNome("Lost");
	        lost.setAnoDeLancamento(2000);
	        lost.exibeFichaTecnica();
	        lost.setTemporadas(10);
	        lost.setEpisodiosPorTemporada(10);
	        lost.setMinutosPorEpisodio(50);
	        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

	        Filme outroFilme = new Filme();
	        outroFilme.setNome("Avatar");
	        outroFilme.setAnoDeLancamento(2023);
	        outroFilme.setDuracaoEmMinutos(200);

	        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
	        calculadora.inclui(meuFilme);
	        calculadora.inclui(outroFilme);
	        calculadora.inclui(lost);
	        System.out.println(calculadora.getTempoTotal());
	        
	        Recomendacao filtro = new Recomendacao();
	        filtro.filtra(meuFilme);
	        
	        Episodio episodio = new Episodio();
	        episodio.setNumero(1);
	        episodio.setSerie(lost);
	        episodio.setTotalVisualizacoes(300);
	        filtro.filtra(episodio);
	        
	}
}
