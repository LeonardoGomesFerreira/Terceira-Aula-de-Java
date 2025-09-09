public class Turma {
    private Aluno[] alunos;
    private int proximaPosicaoLivre;

    public Turma(int capacidadeMaxima) {
        alunos = new Aluno[capacidadeMaxima];
        proximaPosicaoLivre = 0;
    }

    public void matricularAluno(Aluno aluno) {
        if (proximaPosicaoLivre < alunos.length) {
            alunos[proximaPosicaoLivre] = aluno;
            proximaPosicaoLivre++;
        } else {
            System.out.println("Turma cheia! Não é possível matricular mais alunos.");
        }
    }

    public void listarAlunos() {
        for (int i = 0; i < proximaPosicaoLivre; i++) {
            System.out.println("Aluno: " + alunos[i].getNome() + " - RA: " + alunos[i].getRa());
        }
    }

    public Aluno buscarAlunoPorRa(int ra) {
        for (int i = 0; i < proximaPosicaoLivre; i++) {
            if (alunos[i].getRa() == ra) {
                return alunos[i];
            }
        }
        return null; 
    }
}
