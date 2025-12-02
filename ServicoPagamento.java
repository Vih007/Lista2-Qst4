package Lista;

public class ServicoPagamento {
    /**
     * Conecta-se a um serviço externo de pagamento para processar o pagamento do pedido.
     * @return true se o pagamento for bem-sucedido, false caso contrário.
     */
    public static boolean makePayment() {
        /*Conecta-se a um serviço externo para efetuar o pagamento*/
        System.out.println("-> [Pagamento] Processando pagamento...");
        return true; // Simulação: Pagamento sempre bem-sucedido
    }
}