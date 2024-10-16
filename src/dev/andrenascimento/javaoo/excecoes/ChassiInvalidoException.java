package dev.andrenascimento.javaoo.excecoes;

public class ChassiInvalidoException extends Exception {

    private static final long serialVersionUID = 1L;

    public ChassiInvalidoException(String chassi) {
        super(String.format("Esse chassi [%s] é inválido", chassi));
    };

}
