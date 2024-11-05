package br.com.gpavao;

import br.com.gpavao.domain.Eletronico;
import br.com.gpavao.domain.Pedido;
import br.com.gpavao.domain.Produto;
import br.com.gpavao.domain.Roupa;
import br.com.gpavao.domain.DescontoEletronico;
import br.com.gpavao.service.IDesconto;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<IDesconto> descontos = new ArrayList<>();
        descontos.add(new DescontoEletronico());

        Pedido pedido = new Pedido(descontos);

        Produto produto1 = new Eletronico("Macbook",4000);
        Produto produto2 = new Roupa("Camisa Tommy",400);

        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);

        System.out.println("Total pedido: "+ pedido.calcularTotal());
    }
}