package dev.andrenascimento.javaoo.interfaces;

import dev.andrenascimento.javaoo.excecoes.AceleracaoVeiculoDesligadoException;
import dev.andrenascimento.javaoo.excecoes.FrenagemVeiculoDesligadoException;

public interface Andador {
    
    void acelerar() throws AceleracaoVeiculoDesligadoException;

    void frear() throws FrenagemVeiculoDesligadoException;
}
