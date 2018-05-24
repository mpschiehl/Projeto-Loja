
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo Borba and Márcio Pedro Schiehl
 */
public class EntradaMercadorias {

    String marca[] = new String[100];
    String modelo[] = new String[100];
    double camera[] = new double[100];
    int memoriaRam[] = new int[100];
    String sistemaOp[] = new String[100];
    String acessorios[] = new String[100];
    int atual = 0;

    public void cadastrar() {
        solicitarInformacao(atual);
        atual++;
    }

    public void buscarPelaMarca() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");

        for (int i = 0; i < atual; i++) {
            if (marca[i].contains(busca)) {
                apresentarInformacao(i);
            }
        }
    }

    public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null,
                "Marca: " + marca[posicao]
                + "\nModelo: " + modelo[posicao]
                + "\nCamera: " + camera[posicao]
                + "\nMemoria ram: " + memoriaRam[posicao]
                + "\nSistema Operacional: " + sistemaOp[posicao]
                + "\nAcessórios: " + acessorios[posicao]);
    }

    public void solicitarInformacao(int posicao) {
        marca[posicao] = JOptionPane.showInputDialog("Digite a Marca");
        modelo[posicao] = JOptionPane.showInputDialog("Digite a Modelo");
        camera[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Digite o Pixel da Camera"));
        memoriaRam[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite a Memoria Ram"));
        sistemaOp[posicao] = JOptionPane.showInputDialog("Digite a Sistema Operacional");
        acessorios[posicao] = JOptionPane.showInputDialog("Digite o acessório");
    }

    public void apresentaMenuCadastroMercadorias() {
        int opcaoEscolhida = JOptionPane.showOptionDialog(null, "Clique na opção desejada",
                "Loja de Celular", 0, JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Cadastrar", "Editar", "Buscar", "Sair"}, "Sair");
        if (opcaoEscolhida == 0) {
            cadastrar();
        } else if (opcaoEscolhida == 1) {
            editar();
        } else if (opcaoEscolhida == 2) {
            buscarPelaMarca();
        }
    }

    private void editar() {
    }
}
