package br.com.alura.dp.interpreter;

public class RaizQuadrada implements Expressao {

    private Expressao expressao;

    public RaizQuadrada(Expressao e) {
        this.expressao = e;
    }

    public int avalia() {
        return (int) Math.sqrt(expressao.avalia());
    }

}