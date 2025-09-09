public class Playlist {
    private Musica[] musicas;
    private int proximaPosicaoLivre;

    public Playlist() {
        musicas = new Musica[20];
        proximaPosicaoLivre = 0;
    }

    public void adicionarMusica(Musica musica) {
        if (proximaPosicaoLivre < musicas.length) {
            musicas[proximaPosicaoLivre] = musica;
            proximaPosicaoLivre++;
        } else {
            System.out.println("Playlist cheia! Não é possível adicionar mais músicas.");
        }
    }

    public void listarMusicas() {
        for (int i = 0; i < proximaPosicaoLivre; i++) {
            System.out.println("Música: " + musicas[i].getNome() + " - Artista: " + musicas[i].getArtista());
        }
    }
}
