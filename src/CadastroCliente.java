
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marcio Pedro Schiehl And Ricardo Borba
 */
public class CadastroCliente {

    int atual = 0;
    String nomes[] = new String[100];
    String dataNascimentos[] = new String[100];
    String cpfs[] = new String[100];
    String telephones[] = new String[100]; //telefone
    String mobilephones[] = new String[100]; //celular
    String ufs[] = new String[100]; //bairro
    String cities[] = new String[100]; //Cidades
    String neighborhoods[] = new String[100];//Bairros
    String places[] = new String[100]; // lougradouros
    String numbers[] = new String[100]; //numeros
    String addOns[] = new String[100];// complementos
    String maiorIdade = "",nomeCliente = "";
    int ano=0,idade =0,anoatual = 2018;

    public void solicitaInformacaoCliente(int posicao) {
        nomes[posicao] = JOptionPane.showInputDialog(null,
                "Informe o nome", "Loja de Celular", JOptionPane.QUESTION_MESSAGE);
        dataNascimentos[posicao] = JOptionPane.showInputDialog(null,
                "Informe a data de Nascimento", "Loja de Celular", JOptionPane
                .QUESTION_MESSAGE).trim().replace(".", "").replace("-", "").replace("\\","").replace(",", "").replace("/", "");
        cpfs[posicao] = JOptionPane.showInputDialog(null,
                "Informe seu CPF/CNPJ", "Loja de Celular", JOptionPane.QUESTION_MESSAGE)
                .replace(".", "").replace("-", "").replace("\\","").replace(",", "").replace("/", "");
        telephones[posicao] = JOptionPane.showInputDialog(null,
                "Informe o Telefone de Contatos", "Loja de Celular", JOptionPane
                .QUESTION_MESSAGE).replace(".", "").replace("-", "").replace("\\","").replace(",", "").replace("/", "");
        mobilephones[posicao] = JOptionPane.showInputDialog(null,
                "Informe o Celular", "Loja de Celular", JOptionPane
                .QUESTION_MESSAGE).replace(".", "").replace("-", "").replace("\\","").replace(",", "").replace("/", "");
        ufs[posicao] = JOptionPane.showInputDialog(null,
                "Informe a Unidade Federativa (Estado)", "Loja de Celular", JOptionPane.QUESTION_MESSAGE);
        cities[posicao] = JOptionPane.showInputDialog(null,
                "Informe a cidade", "Loja de Celular", JOptionPane.QUESTION_MESSAGE);
        neighborhoods[posicao] = JOptionPane.showInputDialog(null,
                "Informe bairro", "Loja de Celular", JOptionPane.QUESTION_MESSAGE);
        places[posicao] = JOptionPane.showInputDialog(null,
                "Informe o lougradouro", "Loja de Celular", JOptionPane.QUESTION_MESSAGE);
        numbers[posicao] = JOptionPane.showInputDialog(null,
                "Informe o Numero", "Loja de Celular", JOptionPane.QUESTION_MESSAGE);
        addOns[posicao] = JOptionPane.showInputDialog(null,
                "Complementos", "Loja de Celular", JOptionPane.QUESTION_MESSAGE);
        
    }
    public void clienteMaisVelho(){
        for(int i = 0; i<atual; i++){
           maiorIdade = dataNascimentos[i].substring(4,8);
           ano = Integer.parseInt(maiorIdade);
           idade = anoatual - ano;
          /* if(ano <()){
               
           }*/
            
            
        }JOptionPane.showMessageDialog(null, ano);
    }

    public void apresentaMenuCadastro() {
        int menu2 = JOptionPane.showOptionDialog(null, "Clique na opção desejada",
                "Loja de Celular", 0, JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Cadastro", "Editar", "Buscar","Cliente mais velho" ,"Sair"}, "Sair");
        if (menu2 == 0) {
            cadastrar();
        } else if (menu2 == 1) {
            editar();
        } else if (menu2 == 2) {
            buscarNomeCliente();
        } else if (menu2 == 3) {
            clienteMaisVelho();
        }else if (menu2 == 4) {
            
        }
    }

    public void cadastrar() {
        solicitaInformacaoCliente(atual);
        atual++;
    }

    public void buscarNomeCliente() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");

        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                apresentarInformacao(i);
            }
        }

    }

    public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null, "Nome: " + nomes[posicao]
                + "\nData de Nascimento: " + dataNascimentos[posicao]
                + "\nCNPJ/CPF: " + cpfs[posicao] + "\nTelefone: "
                + telephones[posicao] + "\nCelular: " + mobilephones[posicao]
                + "\nUnidade Federativa: " + ufs[posicao] + "\nCidade: "
                + cities[posicao] + "\nBairro: " + neighborhoods[posicao]
                + "\n" + places[posicao] + "   Numero: " + numbers[posicao]
                + "\nComplementos: " + addOns[posicao], "Loja de Celular",
                JOptionPane.PLAIN_MESSAGE);
    }

    private void editar() {
        String buscar = JOptionPane.showInputDialog("Digite o nome para editar");
        for (int i = 0; i<atual;i++){
            if (nomes[i].equals(buscar)){
                solicitaInformacaoCliente(i);
                return;
            }
        }
    }
    private void dados(){
    
    }
    

}
