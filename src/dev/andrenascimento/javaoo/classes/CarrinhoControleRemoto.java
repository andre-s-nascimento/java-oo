package dev.andrenascimento.javaoo.classes;

import dev.andrenascimento.javaoo.excecoes.AceleracaoVeiculoDesligadoException;
import dev.andrenascimento.javaoo.excecoes.FrenagemVeiculoDesligadoException;
import dev.andrenascimento.javaoo.interfaces.Andador;
import dev.andrenascimento.javaoo.interfaces.Ligador;

public class CarrinhoControleRemoto implements Ligador, Andador {

    @Override
    public void acelerar() throws AceleracaoVeiculoDesligadoException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'acelerar'");
    }

    @Override
    public void frear() throws FrenagemVeiculoDesligadoException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'frear'");
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desligar'");
    }

}
