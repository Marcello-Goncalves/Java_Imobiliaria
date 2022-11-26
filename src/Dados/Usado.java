package Dados;

public class Usado extends Imovel
{
    // Atributos  -------------------------------
    public static double taxaDes = 0.1;

    // Métodos  ---------------------------------
    public static void descontar() {new Usado().setPreco(preco-(preco*taxaDes));}
}
