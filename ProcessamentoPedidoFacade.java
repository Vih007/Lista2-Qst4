package Lista;

/**
 * Facade que simplifica o processo de atendimento de um pedido.
 * O cliente (ex: o método main) só precisa interagir com esta classe.
 */
public class ProcessamentoPedidoFacade {

    /**
     * Processa um pedido, chamando sequencialmente os serviços de Estoque, Pagamento e Remessa.
     * @param product O produto que foi pedido pelo cliente.
     * @return true se o processo completo for bem-sucedido, false caso contrário.
     */
    public boolean processarPedido(Produto product) {
        System.out.println("\n--- INÍCIO do Processamento do Pedido: " + product.name + " ---");

        // 1. Verificar Estoque
        if (!ServicoEstoque.isAvailable(product)) {
            System.err.println("!!! FALHA: Produto esgotado.");
            return false;
        }

        // 2. Processar Pagamento
        if (!ServicoPagamento.makePayment()) {
            System.err.println("!!! FALHA: Pagamento recusado.");
            // Lógica de compensação (rollback) poderia ser adicionada aqui
            return false;
        }

        // 3. Efetuar Remessa
        ServicoRemessa.shipProduct(product);

        System.out.println("--- SUCESSO! Pedido processado e pronto para entrega. ---");
        return true;
    }
}