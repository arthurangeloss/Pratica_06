public class Publicacao {
    private String dataPublicacao,textoPublicacao,linkMedia;
    public static double contadorPublicacao;

    public Publicacao(String dataPublicacao, String textoPublicacao, String linkMedia) {
        this.dataPublicacao = dataPublicacao;
        this.textoPublicacao = textoPublicacao;
        this.linkMedia = linkMedia;
        contadorPublicacao++;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public String getLinkMedia() {
        return linkMedia;
    }

    public void setLinkMedia(String linkMedia) {
        this.linkMedia = linkMedia;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }

    public static void setContadorPublicacao(double contadorPublicacao) {
        Publicacao.contadorPublicacao = contadorPublicacao;
    }
}
