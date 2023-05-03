import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String dataCriacao, nomeUsuario, dataNascimento, senha;
        dataCriacao= JOptionPane.showInputDialog("Digite a data de Criação da Rede Socail: ");
        nomeUsuario= JOptionPane.showInputDialog("Digite o seu nome: ");
        dataNascimento= JOptionPane.showInputDialog("Digite a data de nascimento: ");
        senha= JOptionPane.showInputDialog("Digite a sua senha: ");
        RedeSocial redeSocial = new RedeSocial(dataCriacao,nomeUsuario,dataNascimento,senha);
    }
    ArrayList<Publicacao> publi = new ArrayList<>();
    for(int i=0; i<3; i++);
    dataPublicacao
}
