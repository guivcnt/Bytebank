public class TesteSistema {

    public static void main(String[] args) {
        Gerente guilherme = new Gerente();
        guilherme.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(guilherme);
    }
}