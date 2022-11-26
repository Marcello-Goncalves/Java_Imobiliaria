package App;
import  Dados.Imovel;

public class Main
{
    public static void main(String[] args)
    {
        Imovel  imovel;
        int     opcao;
        boolean loop, loop2;
        //--------------------------------

        do
        {
            loop=false;
            Imobiliaria.head();
            imovel = Imobiliaria.registo();
            do
            {
                loop=false;
                opcao = Imobiliaria.condicao();
                //
                switch (opcao)
                {
                    case 1 -> Dados.Novo.adicionar();
                    case 2 -> Dados.Usado.descontar();
                    default->
                    {
                        Imobiliaria.erro();
                        loop=true;
                    }
                }
            }
            while(loop);
            //
            Imobiliaria.exibir(imovel);
            do
            {
                loop2=false;
                opcao = Imobiliaria.repetir();
                switch (opcao)
                {
                    case 1 -> loop = true;
                    case 2 -> loop = false;
                    default ->
                    {
                        Imobiliaria.erro();
                        loop2 = true;
                    }
                }
            }
            while(loop2);
        }
        while(loop);
        Imobiliaria.obrigado();
    }
}
