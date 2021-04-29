public class TesteSacaNegativo {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        //System.out.println(conta.saca(200));
        //System.out.println(conta.saldo);

        //usar esse exemplo antes de aplicar getters e setters
        //usamos getters e setters, pois o ideal é trabalhar com o objeto através dos métodos dele e não dos atributos, ou seja, encapsulado
        //para podermos esconder (encapsular) o atributo, proteger ele, precisamos deixar privado.
        //conta.saldo = conta.saldo - 101;
        //System.out.println(conta.saldo);

        /*usar getter e setter nos possibilita maior agilidade, até mesmo para prestar manutenção ou criar um novo método
        * pois não precisamos mexer diretamente no atributo e sim apenas em um novo método ou método existente*/

        conta.saca(101);
        System.out.println(conta.getSaldo());

    }
}
