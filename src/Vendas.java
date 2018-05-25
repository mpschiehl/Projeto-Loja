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
    public void cadastrarVenda(){
        solicitarInformacao(atual);
        atual++;
    }
    public void decobrirMaiorVenda(){
        int maiorVendas = Integer.MIN_VALUE;
        String nomeFuncionarMaiorVenda = "";
        String maiorNomeCliente = "";
        String nomeMaiorCelular = "";
        
        if(atual == 0){
            JOptionPane.showMessageDialog(null,"Nada cadastrado");
            return;
        }
        for(int i = 0; i < atual; i++){
            if(maiorVendas < numVendas[i]){
                maiorVendas = numVendas[i];
                nomeFuncionarMaiorVenda = nomeFuncionario[i];
                maiorNomeCliente = nomeCliente[i];
                nomeMaiorCelular = nomeCelular [i];
            }
        }
        
        JOptionPane.showInputDialog(null,
                "Funcionario maior venda: " + nomeFuncionarMaiorVenda
                + "\nQuantidades: " + maiorVendas
                + "\nNome Cliente: " + maiorNomeCliente
                + "\nProduto Vendido: " + nomeMaiorCelular);
    }

        public void apresentaMenuVendas() {
        int opcaoEscolhida = JOptionPane.showOptionDialog(null, "Clique na opção desejada",
                "Loja de Celular", 0, JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Cadastrar Venda", "Maior Vendas", "Sair"}, "Sair");
        if (opcaoEscolhida == 0) {
            cadastrarVenda();
        } else if (opcaoEscolhida == 1) {
            decobrirMaiorVenda();
        } else if (opcaoEscolhida == 2) {
            
        }
    }
}