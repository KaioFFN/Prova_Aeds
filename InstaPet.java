public class InstaPet {
    private Usuario[] user = new Usuario[0];
    int numU = 0;
    public void cadastra_usuario(String nome , String email){
        Usuario[] baffer = new Usuario[numU + 1];
        for (int i = 0; i < user.length; i++) {
            baffer[i] = user[i];
        }
        baffer[numU] = new Usuario(nome , email);
        user = baffer;
        numU++;

    }
    public void cadastra_foto(String email , String link , String desc){
        String baffer ;
        for (int j = 0; j < numU; j++) {
            baffer = user[j].getEmail();
            if (email.equals(baffer)) {
                user[j].cadastra_foto(link, desc);
                return;
            }    
        }
        System.out.println("\t\t EMAIL INVALIDO");
    }
    public void qnt_pets(String email){
        int j = 0;
        for (int i = 0; i < user.length; i++) {
            
                if (email.equals(user[i].getEmail())) {
                    while (user[i].registro[j] != null) {
                    j++;
                   } 
                        
                }
        }
        System.out.println("\t\tO usuario "+ email +" possui "+ j + " fotos");
        System.out.println();
    }
    public int qnt_usuarios()
    {
        return numU;
    }
    public void listarFotos(String email)
    {
        int j = 0;
        for (int i = 0; i < user.length; i++) {
            
                if (email.equals(user[i].getEmail())) {
                    while (user[i].registro[j] != null) {
                    System.out.println();
                    System.out.println("\t\tURL: " + user[i].registro[j].getUrl());  
                    System.out.println("\t\tDescrição: " + user[i].registro[j].getDescricao());
                    System.out.println();
                    j++;
                   } 
                        
                }
        }
    } 
    public Usuario[] listar_usuarios(){
        for (int i = 0; i < user.length; i++) {
            System.out.println();
            System.out.print("\t\t" + "NOME: ");
            System.out.println( user[i].getNome());
            System.out.print("\t\t" + "EMAIL: ");
            System.out.println(user[i].getEmail());
            System.out.println();
        }
        return null;
    }
    public void altera_descricao(String email , int nf , String desc)
    {
        int registrada = 0;
        for (int i = 0; i < user.length; i++) {
            if(user[i] == null){
            }else{
                registrada++;
            }
        }
        user[registrada - 1].alteradescricao(nf , desc);
    }
}
