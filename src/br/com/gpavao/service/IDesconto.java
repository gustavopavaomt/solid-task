package br.com.gpavao.service;

import br.com.gpavao.domain.Produto;

public interface IDesconto {

    double calcular(Produto produto);
}
