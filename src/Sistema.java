
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
   
   CadastroCliente registroCliente = new CadastroCliente();
   
    public void apresentaMenu(){
        int menu =JOptionPane.showOptionDialog(null, "Clique na opção desejada", 
                "Loja de Celular",0, JOptionPane.PLAIN_MESSAGE, null ,
                new Object[]{"Cadastro","Entrada de Mercadorias","Vendas",
                    "Sair"},"Sair");
        while (menu != 4){
            switch (menu){
                case 0:
                    apresentaMenuCadastro();
                            break;
                case 1:
                    break;
                    default:
                    JOptionPane.showMessageDialog(null,
                            "Obrigado por Utilizar O Sistema", "loja de Celular"
                            ,JOptionPane.PLAIN_MESSAGE);
                        
            }menu = 4;
        }

    }
    public void apresentaMenuCadastro(){
        int menu2 =JOptionPane.showOptionDialog(null, "Clique na opção desejada", 
                "Loja de Celular",0, JOptionPane.PLAIN_MESSAGE, null ,
                new Object[]{"Cadastro de Funcionários","Cadastro de Clientes",
                    "Sair"},"Sair");
        if (menu2 == 0){
            apresentaMenuCadastro();
        }else if(menu2 == 1){
            
        }else if(menu2 ==2){
            apresentaMenu();
    }
               
    }
    
}
   
