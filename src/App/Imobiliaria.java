package App;
import  Dados.Imovel;
import  java.util.Scanner;

public class Imobiliaria
{
    public static void  head()
    {
        System.out.println("\n");
        System.out.println("  ------------------------------------");
        System.out.println("    - - - JAVA IMOBILIÁRIA LDA - - -  ");
        System.out.println("  ------------------------------------");
    }

    public static void  erro()
    {
        System.out.println("\n");
        System.out.println("  ------------------------------------");
        System.out.println("   * ERRO: Opção Não Identificada! *  ");
        System.out.println("  ------------------------------------");
        Imobiliaria.enter();
    }

    public static Imovel registo()
    {
        Scanner input = new Scanner(System.in);
        String  endereco, strPreco;
        double  preco = 0;

        System.out.println("\n  Registar Propriedade ---------------");

        do
        {
            System.out.print  ("\n  Endereço: ");
            endereco = input.nextLine();
        }
        while (endereco.trim().length() == 0);

        do
        {
            System.out.print  ("\n  Preço: ");
            strPreco = input.nextLine();

            try {preco =Double.parseDouble(strPreco);}
            catch (NumberFormatException e) {strPreco = " ";}
        }
        while (strPreco.trim().length() == 0);

        return new Imovel(endereco, preco);
    }

    public static int condicao()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\n  Condição: ");
        System.out.print("\n  1 - Novo  ");
        System.out.print("\n  2 - Usado ");
        System.out.print("\n  >>> ");
        return input.nextInt();
    }

    public static void exibir(Imovel apartamento)
    {
        System.out.println("\n  Dados da Propriedade -------------");
        System.out.printf ("\n  Endereço:\t %s ",apartamento.getEndereco());
        System.out.printf ("\n  Valor Estimado: %.2f\n",apartamento.getPreco());
        Imobiliaria.enter();
    }

    public static int repetir()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\n  ------------------------------------");
        System.out.print("\n  Deseja Registar Outro Imóvel? ");
        System.out.print("\n  1 - Sim ");
        System.out.print("\n  2 - Não ");
        System.out.print("\n  >>> ");
        return input.nextInt();
    }

    public static void  obrigado()
    {
        Imobiliaria.head  ();
        System.out.println("\n        Obrigado pela Preferência! \n");
        Imobiliaria.enter ();
    }

    public static void  enter()
    {
        System.out.print("\n  Pressione 'ENTER' Para Continuar... ");
        new java.util.Scanner(System.in).nextLine();
    }
}
