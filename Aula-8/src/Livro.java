public class Livro implements Gerenciador{
    private String titulo;
    private String autor;
    private String leitor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;

    public Livro() {
        this.titulo = "Não informado";
        this.autor = "Não informado";
        this.leitor = "Não informado";
        this.totPaginas = 0;
        this.pagAtual = 0;
        this.aberto = false;
    }

    public Livro(String titulo, String autor, String leitor, int totPaginas, boolean aberto) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setLeitor(leitor);
        this.setTotPaginas(totPaginas);
        this.pagAtual = 0;
        this.aberto = false;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo ;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getLeitor(){
        return this.leitor;
    }
    public void setLeitor(String leitor){
        this.leitor = leitor;
    }
    public int getTotPaginas(){
        return this.totPaginas;
    }
    public void setTotPaginas(int totPaginas){
        this.totPaginas = totPaginas;
    }
    public int getPagAtual(){
        return this.pagAtual;
    }
    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }
    public boolean getAberto(){
        return this.aberto;
    }
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear() {
        if(this.aberto == true && this.pagAtual < getTotPaginas()){
            this.pagAtual++;
        }
        else{
            System.out.println("Erro ao folhear o livro para a proxima pagina");
        }
    }

//    @Override Não faz sentido existir
//    public void avancarpagina() {
//        if(this.aberto == true && this.pagAtual < getTotPaginas()){
//            this.pagAtual++;
//        }
//        else{
//            System.out.println("Erro ao avançar para a proxima pagina");
//        }
//    }

    @Override
    public void voltarpagina() {
        if(this.aberto == true && this.pagAtual < getTotPaginas()){
            this.pagAtual--;
        }
        else{
            System.out.println("Erro ao voltar a ultima pagina");
        }
    }
}
