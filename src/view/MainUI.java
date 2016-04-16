package view;

import repositorio.RepositorioLivros;
import repositorio.RepositorioClientes;
import util.Console;
import view.menu.MainMenu;

/**
 *
 * @author Francke
 */
public class MainUI {
    private RepositorioClientes listaClientes;
    private RepositorioLivros listaLivros;
    
    public MainUI() {
        listaClientes = new RepositorioClientes();
        listaLivros = new RepositorioLivros();
        
    }

    public void executar() {
        int opcao = 0;
        do {
            System.out.println(MainMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção: ");
            switch (opcao) {
                case MainMenu.OP_CLIENTES:
                    new ClienteUI(listaClientes).executar();
                    break;
                case MainMenu.OP_LIVROS:
                    new LivroUI(listaLivros).executar();
                    break;
                case MainMenu.OP_SAIR:
                    System.out.println("Aplicação finalizada!!!");
                    break;
                default:
                    System.out.println("Opção inválida..");

            }
        } while (opcao != MainMenu.OP_SAIR);
    }

}
