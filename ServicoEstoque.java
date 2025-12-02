package Lista;

public class ServicoEstoque {
    /**
     * Verifica a disponibilidade do produto no banco de dados.
     * @param product O produto a ser verificado.
     * @return true se disponível, false caso contrário.
     */
    public static boolean isAvailable(Produto product) {
        /*Verifica se o produto está disponível no estoque*/
        System.out.println("-> [Estoque] Verificando disponibilidade de: " + product.name);
        return true; // Simulação: Sempre disponível
    }
}