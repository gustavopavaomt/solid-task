package br.com.gpavao.domain;
import br.com.gpavao.service.IDesconto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
     private List<Produto> produtos = new ArrayList<>();
     private List<IDesconto> descontos = new ArrayList<>();

    public Pedido(List<IDesconto> descontos) {
        this.descontos = descontos;
    }

     public void adicionarProduto(Produto produto) {
         produtos.add(produto);
     }

     public double calcularTotal(){
         double total= 0;
         for(Produto produto : produtos){
             double precoComDesconto = produto.getPreco();
             for(IDesconto desconto : descontos){
                 precoComDesconto -= desconto.calcular(produto);
             }
             total += precoComDesconto;
         }
         return total;
     }

}
