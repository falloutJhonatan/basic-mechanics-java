import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java8Capitulo2Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
        float valorProduto, porcentagem;
        String valor;
        System.out.print("valor do produto: ");
        valor = dado.readLine();
        valorProduto = Float.parseFloat(valor);
        System.out.print("valor da porcentagem de desconto: ");
        valor = dado.readLine();
        porcentagem = Float.parseFloat(valor);
        System.out.printf("valor desconto: R$ %.2f\n", (valorProduto * (porcentagem/100)));
        System.out.printf("valor produto com desconto: R$ %.2f\n", valorProduto - (valorProduto * (porcentagem/100)));
    }
}
