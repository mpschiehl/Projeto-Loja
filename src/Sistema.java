
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

    CadastroCliente cadastroCliente = new CadastroCliente();
    EntradaMercadorias entradaMercadorias = new EntradaMercadorias();

    public void apresentaMenu() {
        int menu = JOptionPane.showOptionDialog(null, "Clique na opção desejada",
                "Loja de Celular", 0, JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Cliente", "Mercadorias", "Vendas",
                    "Sair"}, "Sair");
        while (menu != 3) {
            switch (menu) {
                case 0:
                    cadastroCliente.apresentaMenuCadastro();
                    break;
                case 1:
                    entradaMercadorias.apresentaMenuCadastroMercadorias();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,
                            "Em Construção", "loja de Celular", JOptionPane.PLAIN_MESSAGE);
                    break;
            }
            menu = JOptionPane.showOptionDialog(null, "Clique na opção desejada",
                    "Loja de Celular", 0, JOptionPane.PLAIN_MESSAGE, null,
                    new Object[]{"Cadastro", "Mercadorias", "Vendas",
                        "Sair"}, "Sair");
        }
        JOptionPane.showMessageDialog(null,
                "Obrigado por escolher o sistema",
                "Loja de Celular", JOptionPane.INFORMATION_MESSAGE);
    }

}
