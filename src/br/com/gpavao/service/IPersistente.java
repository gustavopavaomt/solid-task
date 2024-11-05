package br.com.gpavao.service;

public interface IPersistente {

    void salvar();
}

class PedidoPersistente implements IPersistente {

    @Override
    public void salvar() {
        System.out.println("Salvando pedido no banco...");
    }
}
