package Lista;

public class MainTest {
    public static void main(String[] args) {
        // 1. Instanciação dos dados (Produto)
        Produto livro = new Produto(101, "Livro: Padrões de Projeto");
        Produto caneca = new Produto(202, "Caneca Personalizada");

        // 2. Instanciação da Facade
        ProcessamentoPedidoFacade facade = new ProcessamentoPedidoFacade();

        System.out.println("=================================================");
        System.out.println("SIMULAÇÃO DE PEDIDO #1: " + livro.name);
        boolean sucessoLivro = facade.processarPedido(livro);
        System.out.println("Resultado Final do Pedido #1: " + (sucessoLivro ? "✅ BEM-SUCEDIDO" : "❌ FALHOU"));

        System.out.println("\n=================================================");
        System.out.println("SIMULAÇÃO DE PEDIDO #2: " + caneca.name);
        boolean sucessoCaneca = facade.processarPedido(caneca);
        System.out.println("Resultado Final do Pedido #2: " + (sucessoCaneca ? "✅ BEM-SUCEDIDO" : "❌ FALHOU"));
        System.out.println("=================================================");
    }
}