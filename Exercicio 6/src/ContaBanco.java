

public class ContaBanco {
    private int numConta;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(int nC, String d){
        this.numConta = nC;
        this.dono = d;
        this.saldo = 0.0;
        this.status = false;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int nC){
        this.numConta = nC;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void contaBanco(){
        System.out.println("--- Conta de " + dono + " ---\n");
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Quantidade de dinheiro: " + this.getSaldo());
    }
}
