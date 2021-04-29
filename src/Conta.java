public class Conta {

    private Cliente titular;
    private double saldo;
    private int agencia;
    private int numero;

    public void deposita(double valor){
        this.saldo = saldo + valor;
    }

    public boolean saca(double valor){
        if(saldo >= valor){
            this.saldo = saldo - valor;
            System.out.println("O saque no valor de " + valor + " foi efetuado com sucesso!");
            return true;
        }else{
            System.out.println("Lamento, não foi possível sacar, pois não há saldo suficiente.");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            //destino.saldo = saldo + valor;
            destino.deposita(valor);
            System.out.println("A transferência foi efetuada com sucesso");
            return true;
        }else{
            System.out.println("Não foi possível efetuar a transferência, pois o saldo é insuficiente!");
            return false;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
