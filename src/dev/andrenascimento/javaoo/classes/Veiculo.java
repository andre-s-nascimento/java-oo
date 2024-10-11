package dev.andrenascimento.javaoo.classes;

import dev.andrenascimento.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import dev.andrenascimento.javaoo.excecoes.AceleracaoVeiculoDesligadoException;
import dev.andrenascimento.javaoo.excecoes.ChassiInvalidoException;
import dev.andrenascimento.javaoo.excecoes.FrenagemVeiculoDesligadoException;

public abstract class Veiculo {

    private String nome;

    private String marca;

    private String chassi;

    protected int quantidadeRodas;

    private float quantidadeCombustivel;

    private Boolean ligado;

    protected float velocidade;

    public Veiculo() {
        this.ligado = false;
        this.velocidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) throws ChassiInvalidoException {
        if (chassi.length() == 5) {
            this.chassi = chassi;
        } else {
            throw new ChassiInvalidoException(chassi);
        }
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }


    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public void setQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public Boolean isLigado() {
        return ligado;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public final void ligar() {
        this.ligado = true;
        this.velocidade = 0;
        System.out.println("O veículo ligou!");
    }

    public final void deligar() {
        this.ligado = false;
        this.velocidade = 0;
        System.out.println("O veículo desligou!");
    }

    public float abastecer(float litros) throws AbastecimentoVeiculoLigadoException {
        if (!this.ligado) {
            quantidadeCombustivel += litros;

        } else {
            throw new AbastecimentoVeiculoLigadoException();
        }
        return quantidadeCombustivel;
    }

    public void acelerar() throws AceleracaoVeiculoDesligadoException{

        if(this.ligado){
            this.velocidade += 10;
        } else {
            throw new AceleracaoVeiculoDesligadoException();
        }

    }

    public void frear() throws FrenagemVeiculoDesligadoException{
        if(this.ligado){
            this.velocidade -= 10;
        } else {
            throw new FrenagemVeiculoDesligadoException();
        }
    }

    public abstract void preparar();

}
