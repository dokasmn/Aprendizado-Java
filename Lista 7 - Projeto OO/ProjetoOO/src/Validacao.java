import java.util.ArrayList;

public class Validacao {

    public static boolean validarSaida(int saida,int atual) {
        if ((saida - atual) >= 0) {
            return false;
        }
        return true;
    }


    public static boolean validarDecimal(double meuDouble){
        boolean valido = true;
        if (!(meuDouble >= 0)) {
            valido = false;
        }
        return valido;
    }

    public static boolean validarInteiro(int meuInteiro){
        boolean valido = true;
        if (!(meuInteiro >= 0)) {
            valido = false;
        }
        return valido;
    }
    
    public static boolean validarProdutoExiste(String nomeProduto,ArrayList<Produto> lista){
        return true;
    }

    public static boolean validarProdutoFaltando(int minima,int atual){
        if (minima >= atual) {
            return true;
        }
        return false;
    }


    public static boolean validarExisteCodigo(String codigo, Loja l) {
        boolean codigoValido = true;
        for (Produto produto : l.getListaDeProdutos()) {
            if (produto.getCodigo().equals(codigo)) {
                codigoValido = false;
            }
        }
        return codigoValido;
    }


}
