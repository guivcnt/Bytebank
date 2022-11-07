public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        Funcionario gerente = new Gerente();

        g1.setNome("Guilherme");
        g1.setCpf("3232313213131");
        g1.setSalario(500000);
        g1.setSenha(213415122);
        g1.getBonificacao();
        System.out.println(g1.getBonificacao());
        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());
        System.out.println(g1.getCpf());
        System.out.println(g1.autentica(213415122));
    }
}
