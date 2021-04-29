public class TestaGetESet {

    public static void main(String[] args) {

        Conta conta = new Conta();
        //qual vantagem de usar setNumero?
        // dentro do setNumero eu posso inserir if's para verificar quantidade de dígitos,
        // se a conta está ativa ou não, entre outras necessidades

        conta.setNumero(1337);
        System.out.println(conta.getNumero());
    }
}
