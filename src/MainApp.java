import veiculos.Automovel;
import veiculos.Caminhao;
import veiculos.Veiculo;

public class MainApp {
    public static void main(String[] args) {

        Automovel fusca = new Automovel();
        Automovel delrey = new Automovel();
        Caminhao volvo = new Caminhao();

        fusca.anoFabricacao = 1980;
        fusca.tipoCombustivel = "Gasolina";
        fusca.marca = "VW";

        delrey.anoFabricacao = 1989;
        delrey.tipoCombustivel = "Alcool";
        delrey.marca = "Ford";

        volvo.anoFabricacao = 2010;
        volvo.tipoCabine = "DUPLA";
        volvo.tipoDiesel = "S-10";

        System.out.println(fusca.anoFabricacao);
        System.out.println(fusca.marca);
        System.out.println(delrey.anoFabricacao);
        System.out.println(delrey.marca);
        System.out.println(volvo.anoFabricacao);
        System.out.println(volvo.marca);


    }
}
