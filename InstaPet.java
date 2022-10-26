public class InstaPet {
    Usuario cadastro = new Usuario();
    private int numU = 0;
    public void cadastra_usuario(String nome , String email){
        cadastro.setNome(nome);
        cadastro.setEmail(email);
        numU++;

    }
    public void cadastra_foto(String email , String link , String desc){

    }
    public int qnt_pets(String email){
        return 0;
    }
    public int qnt_usuarios()
    {
        return numU;
    }
    public Fotos[] listarFotos()
    {
        
        return null;
    } 
    public Usuario[] listar_usuarios(){
        System.out.println(cadastro.getNome());
        System.out.println(cadastro.getEmail());
        return null;
    }
    public void altera_descricao(String email , int n , String desc)
    {

    }
}
