package modelos;

public class Musica{
    private String album;
    private String cantor;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getClassificacao() {
        if(this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }

	private int getTotalReproducoes() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getTitulo() {
		// TODO Auto-generated method stub
		return null;
	}
}
