package dev.andrenascimento.javaoo.interfaces;

import dev.andrenascimento.javaoo.excecoes.AbastecimentoVeiculoLigadoException;


public interface Veiculo {

    void abastecer(float litros) throws AbastecimentoVeiculoLigadoException;

    void preparar();

}
