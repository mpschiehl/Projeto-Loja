
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
                    apresentaMenu();
            }
        }

    }
    public void apresentaMenuCadastro(){
        int menu2 =JOptionPane.showOptionDialog(null, "Clique na opção desejada", 
                "Loja de Celular",0, JOptionPane.PLAIN_MESSAGE, null ,
                new Object[]{"Cadastro de Funcionários","Cadastro de Clientes",
                    "Sair"},"Sair");
        while (menu2 != 3){
            switch (menu){
                case 0:
                    apresentaMenuCadastro();
                            break;
                case 1:
                    break;
                case 2:
                    break;
                default:
                    apresentaMenu();
            }
    }
    
}
}    
