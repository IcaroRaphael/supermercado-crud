package br.iesp.edu.supermercado.exception;

public class SenhaInvalidaException extends RuntimeException {
    public SenhaInvalidaException(){
        super("Senha inválida.");
    }
}
