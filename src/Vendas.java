import javax.swing.JOptionPane;

/**
 *
 * @author Rciardo Borba & Marcio Pedro Schiehl
 */
public class Vendas {
    
    

    int[] numVendas = new int[100]; 
    String[] nomeCelular = new String [100];
    String[] nomeFuncionario= new String[100];
    String[] nomeCliente= new String[100];
    double[] valorVendas = new double[100];
    int atual = 0;

    public void solicitarInformacao(int posicao) {
        nomeFuncionario[posicao] = JOptionPane.showInputDialog("Digite a Funcionario");
        numVendas[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade vendida"));
        nomeCliente[posicao] = JOptionPane.showInputDialog("Digite 0 Cliente");
        nomeCelular[posicao] = JOptionPane.showInputDialog("Digite produto vendido");
    }
    public void cadastrar(){
        solicitarInformacao(atual);
        atual++;
    }
    public void decobrirAMaiorVenda(){
        int maiorVendas = Integer.MIN_VALUE;
        String nomeFuncionarMaiorVenda = "";
        int valorVendas = 0;
        String maiorNomeCliente = "";
        String nomeMaiorCelular = "0";
        for(int i = 0; i < atual; i++){
            if(maiorVendas > numVendas[i]){
                nomeFuncionarMaiorVenda = nomeFuncionario[i];
                maiorNomeCliente = nomeCliente[i];
                nomeMaiorCelular = nomeCelular [i];
            }
        }
        JOptionPane.showInputDialog(null,
                "Funcionario do MÊS: " + nomeFuncionarMaiorVenda
                + "\nQuantidade: " + maiorVendas
                + "\nNome Cliente: " + maiorNomeCliente
                + "\nCelular Maior Preço: " + nomeMaiorCelular);
    }
}
