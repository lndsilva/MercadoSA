package br.com.local.mercadosa;

public class Mercadoria {
    private String nome;
    private int rating;
    private double valor;
    private String pontuacao;
    private int imagem;

    public Mercadoria(String nome, int rating, double valor, String pontuacao, int imagem) {
        this.nome = nome;
        this.rating = rating;
        this.valor = valor;
        this.pontuacao = pontuacao;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(String pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
