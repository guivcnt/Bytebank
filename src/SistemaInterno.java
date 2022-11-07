public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autentica fa){
        boolean autenticou = fa.autentica(this.senha);
        if(autenticou){
            System.out.println("Logado");
        } else{
            System.out.println("Não foi possível logar");
        }
    }
}
