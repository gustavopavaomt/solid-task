package br.com.gpavao.domain;

import br.com.gpavao.service.IDesconto;

public class DescontoEletronico implements IDesconto {

    @Override
    public double calcular(Produto produto) {
        return produto.getPreco() * 0.10;
    }
}
