public class Principal {

    public static void main(String[] args) {
        Filme f=new Filme();

        f.setCodigo(24);
        f.setNome("A abobora");
        f.setValor(25.00);
        f.setDisponivel(true);
        if(f.isDisponivel()) {
            System.out.println("Codigo do filme: " + f.getCodigo());
            System.out.println("Nome do filme: " + f.getNome());
            System.out.println("Valor intero: " + f.getValor());
        }else{
            System.out.println("Filme não disponivel");
        }
    }
    
}
