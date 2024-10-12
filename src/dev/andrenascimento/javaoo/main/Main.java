package dev.andrenascimento.javaoo.main;

import dev.andrenascimento.javaoo.classes.Carro;
import dev.andrenascimento.javaoo.classes.VeiculoBase;
import dev.andrenascimento.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import dev.andrenascimento.javaoo.excecoes.ChassiInvalidoException;

public class Main {
    public static void main(String[] args) {
        try {
            VeiculoBase corsa = new Carro("Corsa", "GM"); //Polimorfismo
            corsa.setChassi("ABCDE");
            corsa.abastecer(10);
            //((Carro) corsa).setQuantidadePortas(4);
            System.out.println(corsa.getNome());
            System.out.println(corsa.getQuantidadeCombustivel());
            System.out.println(corsa.getQuantidadeRodas());
            System.out.println(String.format("O veículo %s está ligado? %b", corsa.getNome(), corsa.isLigado()));
            corsa.abastecer(10);
            corsa.preparar();
            corsa.ligar();
            corsa.acelerar();
            System.out.println(String.format("A velocidade atual do veículo é %f", corsa.getVelocidade()));
            corsa.frear();
            System.out.println(String.format("A velocidade atual do veículo é %f", corsa.getVelocidade()));

        } catch (AbastecimentoVeiculoLigadoException e) {
            System.out.println("Você não pode abastecer um veículo ligado!");
        } catch (ChassiInvalidoException e) {
            System.out.println("O chassi é invalido. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("*** Ocorreu um erro: " + e.getMessage());
        }
    }
}
