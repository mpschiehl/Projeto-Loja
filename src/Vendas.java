
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Vendas {

    int maiorVendas = Integer.MIN_VALUE;
    int maiorCliente = Integer.MIN_VALUE;
    int marcaMaiorPreco = Integer.MIN_VALUE;

    String nomesFuncionario[] = new String[100];
    String nomesCliente[] = new String[100];
    String marcaMaiorPreco[] = new String[100];
    int atual = 0;

    public void solicitarInformacao(int posicao) {
        nomeFuncionario[posicao] = JOptionPane.showInputDialog("Digite a Funcionario");
        nomeCliente[posicao] = JOptionPane.showInputDialog("Digite a Cliente");
        marca[posicao] = JOptionPane.showInputDialog("Digite produto vendido")
    
    
    );
    }

    if(nomeFuncionario > maiorVendas

    
        ){
            maiorVendas = nomeFuncionario;
    }
    if(nomeCliente > maiorCliente

    
        ){
            maiorCliente = nomeCliente;
    }
    if(marca > marcaMaiorPreco

    
        ){
            marcaMaiorPreco = marca;
    }

    public void apresentarVendas(int posicao) {
        JOptionPane.showInputDialog(null,
                "Funcionario do MÊS: " + maiorVendas
                + "\nNome Cliente: " + maiorClient
                + "\nCelular Maior Preço: " + marcaMaiorPreco);

    }
}
