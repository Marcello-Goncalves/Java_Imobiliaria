package Dados;

public class Novo extends Imovel
{
    // Atributos  -------------------------------
    public static double taxaAdd = 0.05;

    // Métodos  ---------------------------------
    public static void adicionar()
    {
        new Novo().setPreco(preco+(preco*taxaAdd));
    }

}
