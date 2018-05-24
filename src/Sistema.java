
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcio Pedro Schiehl and Ricardo Borba
 */
public class Sistema {
  
   CadastroCliente tela2 = new CadastroCliente();
   EntradaMercadorias tela3 = new EntradaMercadorias();
   
    public void apresentaMenu(){
        int menu = JOptionPane.showOptionDialog(null, "Clique na opção desejada", 
                "Loja de Celular",0, JOptionPane.PLAIN_MESSAGE, null ,
                new Object[]{"Cadastro","Mercadorias","Vendas",
                    "Sair"},"Sair");
        while (menu != 4){
            switch (menu){
                case 0:
                    tela2.apresentaMenuCadastro();
                            break;
                case 1:
                    tela3.apresentaMenuCadastroMercadorias();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,
                            "Em Construção", "loja de Celular"
                            ,JOptionPane.PLAIN_MESSAGE);
                    break;
                case 3:
                    menu = 4;
                    break;
                    default:
                        JOptionPane.showMessageDialog(null,
                            "Obrigado por utilizar o sistema.", "loja de Celular"
                            ,JOptionPane.PLAIN_MESSAGE);
                    
                    
            }
            menu =JOptionPane.showOptionDialog(null, "Clique na opção desejada", 
                "Loja de Celular",0, JOptionPane.PLAIN_MESSAGE, null ,
                new Object[]{"Cadastro","Mercadorias","Vendas",
                    "Sair"},"Sair");
        }

    }
}   
   
