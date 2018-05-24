
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

    CadastroFuncionario cadastro = new CadastroFuncionario();
    
    int atual =0;
    
    String nomes [] = new String [100];
    String dataNascimentos[] = new  String [100];
    String cpfs [] = new String[100];
    String telephones []=new String[100]; //telefone
    String mobilephones [] = new String [100]; //celular
    String ufs [] = new  String [100]; //bairro
    String cities[] = new String [100]; //Cidades
    String neighborhoods [] = new String[100];//Bairros
    String places [] = new String [100]; // lougradouros
    String numbers [] = new String[100]; //numeros
    String addOns  [] = new String [100];// complementos
   
    
    public void solicitaInformacaoCliente(int posicao) {
       nomes[posicao] = JOptionPane.showInputDialog(null,
                "Informe o nome","Loja de Celular",JOptionPane.QUESTION_MESSAGE);
       dataNascimentos[posicao] = JOptionPane.showInputDialog(null,
                "Informe a data de Nascimento","Loja de Celular",JOptionPane.QUESTION_MESSAGE);
       cpfs[posicao] = JOptionPane.showInputDialog(null,
                "Informe seu CPF/CNPJ","Loja de Celular",JOptionPane.QUESTION_MESSAGE);
       telephones[posicao] = JOptionPane.showInputDialog(null,
                "Informe o Telefone de Contatos","Loja de Celular",JOptionPane.QUESTION_MESSAGE);
       mobilephones[posicao] = JOptionPane.showInputDialog(null,
                "Informe o Celular","Loja de Celular",JOptionPane.QUESTION_MESSAGE);
       ufs[posicao]= JOptionPane.showInputDialog(null,
                "Informe a Unidade Federativa (Estado)","Loja de Celular",JOptionPane.QUESTION_MESSAGE);
       cities[posicao] = JOptionPane.showInputDialog(null,
                "Informe a cidade","Loja de Celular",JOptionPane.QUESTION_MESSAGE);
       neighborhoods[posicao] = JOptionPane.showInputDialog(null,
                "Informe bairro","Loja de Celular",JOptionPane.QUESTION_MESSAGE);
       places[posicao] = JOptionPane.showInputDialog(null,
                "Informe o lougradouro","Loja de Celular",JOptionPane.QUESTION_MESSAGE);
       numbers[posicao] = JOptionPane.showInputDialog(null,
                "Informe o Numero","Loja de Celular",JOptionPane.QUESTION_MESSAGE);
       addOns[posicao]= JOptionPane.showInputDialog(null,
                "Complementos","Loja de Celular",JOptionPane.QUESTION_MESSAGE);
    }        
    public void apresentaMenuCadastro(){
        int menu2 =JOptionPane.showOptionDialog(null, "Clique na opção desejada", 
                "Loja de Celular",0, JOptionPane.PLAIN_MESSAGE, null ,
                new Object[]{"Funcionários","Clientes","Buscar",
                    "Sair"},"Sair");
        if (menu2 == 0){
            cadastro.cadastrarFuncionario();
        }else if(menu2 == 1){
            cadastrar();
            
        }else if(menu2 ==2){
           JOptionPane.showMessageDialog(null, "Em Contrução");
        }else if(menu2 ==3){
           
        }
       
    }
    public void cadastrar(){
            solicitaInformacaoCliente(atual);
            atual++;
}
    public void buscarNomeCliente(){
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");

        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                apresentarInformacao(i);
                }
            }
        
    }
    public void apresentarInformacao(int posicao){
        JOptionPane.showMessageDialog(null, " "
                ,"Loja de Celular",JOptionPane.PLAIN_MESSAGE);
    }
       
}
