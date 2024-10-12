package dev.andrenascimento.javaoo.classes;

import dev.andrenascimento.javaoo.excecoes.AceleracaoVeiculoDesligadoException;

import dev.andrenascimento.javaoo.excecoes.FrenagemVeiculoDesligadoException;

public final class Moto extends VeiculoBase {
    public Moto() {
        this.quantidadeRodas = 2;
    }


    public Moto(String nome, String marca) {
        this.quantidadeRodas = 2;
        this.setNome(nome);
        this.setMarca(marca);
    }


    @Override
    public void acelerar() throws AceleracaoVeiculoDesligadoException {
        if(this.isLigado()){
            this.velocidade += 3;
        } else {
            throw new AceleracaoVeiculoDesligadoException();
        }
    }


    @Override
    public void frear() throws FrenagemVeiculoDesligadoException {
        if(this.isLigado()){
            this.velocidade -= 3;
        } else {
            throw new FrenagemVeiculoDesligadoException();
        }
    }


    @Override
    public void preparar() {
        System.out.println("Colocar o capacete.");
    }

    
}
