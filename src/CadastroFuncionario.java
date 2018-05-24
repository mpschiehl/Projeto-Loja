import javax.swing.JOptionPane;
/**
 *
 * @author Marcio Pedro Schiehl and Ricardo Borba
 */
public class CadastroFuncionario {
    
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
   
    
    public void solicitaInformacaoFuncionario(int posicao) {
       nomes[posicao] = JOptionPane.showInputDialog(null,
                "Informe o nome do colaborador","Loja de Celular",JOptionPane.QUESTION_MESSAGE);
       dataNascimentos[posicao] = JOptionPane.showInputDialog(null,
                "Informe a data de Nascimento","Loja de Celular",JOptionPane.QUESTION_MESSAGE);
       cpfs[posicao] = JOptionPane.showInputDialog(null,
                "Informe seu CPF","Loja de Celular",JOptionPane.QUESTION_MESSAGE);
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

    
    public void cadastrarFuncionario(){
            solicitaInformacaoFuncionario(atual);
            atual++;
    }
}       

