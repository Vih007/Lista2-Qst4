package Lista;

public class ServicoRemessa {
    /**
     * Conecta-se a um serviço web de logística externa para enviar o produto.
     * @param product O produto a ser enviado.
     */
    public static void shipProduct(Produto product) {
        /*Conecta-se a serviço externo de logística para enviar o produto*/
        System.out.println("-> [Remessa] Enviando produto: " + product.name + " para o endereço do cliente.");
    }
}