public class Usuario {
    private String nome;
    private String email;
    public Fotos[] registro = new Fotos[10];
    
    public Fotos[] getRegistro() {
        return registro;
    }
    public Usuario(String nome , String email)
    {
        this.nome = nome;
        this.email = email;
    };
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
     public void cadastra_foto(String link , String desc)
    {
        int registrada = 0;
        for (int i = 0; i < registro.length; i++) {
            if(registro[i] == null){
    
            }else{
                registrada++;
            }
        }
        registro[registrada] = new Fotos(link, desc);
       
    }
    public void alteradescricao(int n , String desc)
    {
        registro[n - 1].setDescricao(desc);
    }
}
