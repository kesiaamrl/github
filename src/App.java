public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta1=new ContaBancaria();
        ContaBancaria conta2=new ContaBancaria();

        conta1.setTitular("Kesia");
        conta1.setNumeroConta(6101);
        conta1.setSaldo(400);

        conta2.setTitular("Luciano");
        conta2.setNumeroConta(9050);
        conta2.setSaldo(1000);

        conta1.depositar(600);
        conta1.sacar(300);
        conta1.transferir(1000, "Jose");
        conta2.depositar(1000);
    }
}
