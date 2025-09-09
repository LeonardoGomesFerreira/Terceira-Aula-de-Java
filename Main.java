public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma(5);
        turma.matricularAluno(new Aluno(101, "Maria"));
        turma.matricularAluno(new Aluno(102, "João"));

        System.out.println("Lista de alunos na turma:");
        turma.listarAlunos();

        Aluno busca = turma.buscarAlunoPorRa(102);
        if (busca != null) {
            System.out.println("Aluno encontrado: " + busca.getNome());
        } else {
            System.out.println("Aluno não encontrado");
        }

        Playlist playlist = new Playlist();
        playlist.adicionarMusica(new Musica("Shape of You", "Ed Sheeran"));
        playlist.adicionarMusica(new Musica("Blinding Lights", "The Weeknd"));

        System.out.println("\nLista de músicas na playlist:");
        playlist.listarMusicas();
    }
}
