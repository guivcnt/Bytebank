import java.security.interfaces.EdECKey;

public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Guilherme Vicente");
        String nome = g1.getNome();
        System.out.println(nome);
        g1.setSalario(5000.0);

        EditorVideo e = new EditorVideo();
        e.setNome("Paulos pnc");
        e.setSalario(0500.0);
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(e);
        System.out.println(controle.getSoma());


    }
}
