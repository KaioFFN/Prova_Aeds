public class Fotos {
    
    private String url;
    private String descricao;

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Fotos(String url , String descricao){
    setUrl(url);
    setDescricao(descricao);
    };
}
