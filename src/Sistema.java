import javax.swing.JOptionPane;
/**
 *
 * @author Marcio Pedro Schiehl and Ricardo Borba
 */
public class Sistema {

    CadastroCliente cadastroCliente = new CadastroCliente();
    EntradaMercadorias entradaMercadorias = new EntradaMercadorias();
    CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
    Vendas maiorVendas = new Vendas();
    public void apresentaMenu() {
        int menu = JOptionPane.showOptionDialog(null, "Clique na opção desejada",
                "Loja de Celular", 0, JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Cliente", "Mercadorias", "Funcionario","Vendas",
                    "Sair"}, "Sair");
        while (menu != 4) {
            switch (menu) {
                case 0:
                    cadastroCliente.apresentaMenuCadastro();
                    break;
                case 1:
                    entradaMercadorias.apresentaMenuCadastroMercadorias();
                    break;
                case 2:
                    cadastroFuncionario.apresentaMenuCadastro();
                    break;
                case 3:
                    maiorVendas.apresentaMenuVendas();
            }
            menu = JOptionPane.showOptionDialog(null, "Clique na opção desejada",
                "Loja de Celular", 0, JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Cliente", "Mercadorias", "Funcionario","Vendas",
                    "Sair"}, "Sair");
            }
        JOptionPane.showMessageDialog(null,
                "Obrigado por escolher o sistema",
                "Loja de Celular", JOptionPane.INFORMATION_MESSAGE);
    }

}
