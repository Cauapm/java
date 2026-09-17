public class Turma {
    private String nomeCurso;
    private String codigoTurma;
    private int qtdAlunos;
    private int vagasTotais;
    private boolean aberta;

    public Turma(String nome, String codigo) {
        this.nomeCurso = nome;
        this.codigoTurma = codigo;
        this.qtdAlunos = 0;
        this.vagasTotais = 30;
        this.aberta = true;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nome) {
        this.nomeCurso = nome.trim().toUpperCase();
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
        this.qtdAlunos = qtdAlunos;
    }

    public int getVagasTotais() {
        return vagasTotais;
    }

    public void setVagasTotais(int vagasTotais) {
        this.vagasTotais = vagasTotais;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public void informacoes(){
        System.out.println("Nome do curso: " + this.getNomeCurso());
        System.out.println("Código da turma: " + this.getCodigoTurma());
    }
}
