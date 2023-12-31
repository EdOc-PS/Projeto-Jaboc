package jaboc_Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author eeuar
 */
public class Produto {

    private String nomeProduto;
    private int qtdeProduto;
    private int idProduto;
    private String tipoProduto;
    private double precoProduto;
    
    public Produto() {
        this.nomeProduto = "";
        this.qtdeProduto = 0;
        this.idProduto = 0;
        this.tipoProduto = "";
        this.precoProduto = 0;
    }
    public Produto(String nomeProduto, int qtdeProduto, int idProduto, String tipoProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.qtdeProduto = qtdeProduto;
        this.idProduto = idProduto;
        this.tipoProduto = tipoProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(int qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public String toString() {
        return "\nNome: " + nomeProduto + "\nQuantidade: " + qtdeProduto + "\nIdentificação: " + idProduto + "\nTipo: " + tipoProduto + "\nPreco: " + precoProduto + "\n";
    }

}
