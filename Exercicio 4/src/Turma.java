public class Turma {
    private String nomeCurso;
    private String codigoTurma;
    private int qtdAlunos;
    private int vagasTotais;
    private boolean aberta;

    public Turma(String nome, String codigo, int vagasTotais) {
        this.setNomeCurso(nome);
        this.setCodigoTurma(codigo);
        this.qtdAlunos = 0;
        this.setVagasTotais(vagasTotais);
        this.aberta = true;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nome) {
        this.nomeCurso = nome.toUpperCase();
    }

    public String getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(String codigo) {
        this.codigoTurma = codigo;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        if (qtdAlunos > vagasTotais) {
            System.out.println("Erro: a quantidade de alunos não pode ser maior que a quantidade de vagas!");
        } else if (qtdAlunos < 0) {
            System.out.println("Erro: a quantidade de alunos não pode ser negativa!");
        } else {
            this.qtdAlunos = qtdAlunos;
        }
    }

    public int getVagasTotais() {
        return vagasTotais;
    }

    public void setVagasTotais(int vagasTotais) {
        if (vagasTotais <= 0) {
            System.out.println("Erro: a quantidade de vagas não pode ser zero ou negativa! Definindo 10 como padrão.");
            this.vagasTotais = 10;
        } else {
            this.vagasTotais = vagasTotais;
        }
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public void matricularAluno() {
        if (this.isAberta() && this.getQtdAlunos() < this.getVagasTotais()) {
            this.qtdAlunos++;
            if (this.getQtdAlunos() == this.getVagasTotais()) {
                this.aberta = false;
                System.out.println("Número máximo de alunos alcançado!");
            } else {
                System.out.println("Matrícula realizada com sucesso!");
            }
        } else {
            System.out.println("Matrícula recusada: Turma fechada ou lotada!");
        }
    }

    public void exibirStatus() {
        System.out.println("Nome do curso: " + this.getNomeCurso());
        System.out.println("Código da turma: " + this.getCodigoTurma());
        System.out.println("Quantidade de vagas: " + this.getVagasTotais());
        System.out.println("Quantidade de alunos: " + this.getQtdAlunos());
        System.out.println("Matrícula disponível: " + (this.isAberta() ? "Sim" : "Não"));
    }
}
