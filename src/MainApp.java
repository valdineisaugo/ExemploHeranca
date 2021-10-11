import veiculos.Automovel;
import veiculos.Caminhao;
import veiculos.Veiculo;

public class MainApp {
    public static void main(String[] args) {

        Automovel fusca = new Automovel();
        Caminhao volvo = new Caminhao();
        fusca.anoFabricacao = 1980;
        fusca.tipoCombustivel = "Gasolina";
        volvo.anoFabricacao = 2010;
        volvo.tipoCabine = "DUPLA";


    }
}
