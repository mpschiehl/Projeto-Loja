
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class TelaBuscas {
    CadastroCliente cliente = new CadastroCliente();
    CadastroFuncionario funcionario = new CadastroFuncionario();
    
 public void apresentaMenuBusca(){   
    int menu =JOptionPane.showOptionDialog(null, "Clique na opção desejada", 
                "Loja de Celular",0, JOptionPane.PLAIN_MESSAGE, null ,
                new Object[]{"Funcionários","Clientes","Sair"},"Sair");
        if (menu == 0){
            funcionario.buscarNomeFuncionario();
        }else if(menu == 1){
            cliente.buscarNomeCliente();
        }else if(menu ==2){
           
           
                 
        }
    
    }
}
