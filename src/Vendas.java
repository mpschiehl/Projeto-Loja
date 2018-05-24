
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Vendas {

    int maiorVendas = Integer.MIN_VALUE;
    int maiorCliente = Integer.MIN_VALUE;
    String[] marcas = new String [100];
    String nomesFuncionario[] = new String[100];
    String nomesCliente[] = new String[100];
    String marcaMaiorPreco[] = new String[100];
    int atual = 0;

    public void solicitarInformacao(int posicao) {
        nomesFuncionario[posicao] = JOptionPane.showInputDialog("Digite a Funcionario");
        nomesCliente[posicao] = JOptionPane.showInputDialog("Digite a Cliente");
        marcas[posicao] = JOptionPane.showInputDialog("Digite produto vendido");
    }

    for(int i=0;i<atual;i++){
        if(nomesFuncionario[i] > maiorVendas[i]){
                maiorVendas[i] = nomesFuncionario[i];
        }
        if(nomesCliente[i] > maiorCliente[i]){
                maiorCliente[i] = nomesCliente[i];
        }
        if(marcas[i] > marcaMaiorPreco[i]){
                marcaMaiorPreco[i] = marcas[i];
    }
}
    public void apresentarVendas(int posicao) {
        JOptionPane.showInputDialog(null,
                "Funcionario do MÊS: " + maiorVendas
                + "\nNome Cliente: " + maiorClient
                + "\nCelular Maior Preço: " + marcaMaiorPreco);

    }
}
