package modelos;

public class MinhasPreferidas {


    public void inclui(Musica minhaMusica) {
        if(minhaMusica.getClassificacao() >= 9) {
            System.out.println(minhaMusica.getTitulo() + " é considerado sucesso absoluto" +
                    " e preferido por todos!");
        } else {
            System.out.println(minhaMusica.getTitulo() + " também é um dos que todo mundo está " +
                    "curtindo");
        }
    }
}
