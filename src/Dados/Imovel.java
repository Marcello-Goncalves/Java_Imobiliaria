package Dados;

public class Imovel
{
    // Atributos   ------------------------------
    protected static String endereco;
    protected static double preco;
    // Construtores -----------------------------
    public Imovel(){}
    public  Imovel(String endereco, double preco)
    {
        this.endereco = endereco;
        this.preco    = preco;
    }

    // Getter   ---------------------------------
    public  String getEndereco() {return endereco;}
    public  double getPreco()    {return preco;}

    // Setter   ---------------------------------
    public void setPreco(double preco) {this.preco = preco;}
}
