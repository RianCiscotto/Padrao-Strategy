package padroescomportamentais.strategy;

public class Produto {
    private float preco;

    public float getPreco() {
        return preco;
    }

    public void somarPreco(float a, float b) {
        preco = new Calculadora(a, b).calcular(new OperacaoSomar());
    }

    public void subtrairPreco(float a, float b) {
        preco = new Calculadora(a, b).calcular(new OperacaoSubtrair());
    }

    public void dividirPreco(float a, float b) {
        preco = new Calculadora(a, b).calcular(new OperacaoDividir());
    }

    public void multiplicarPreco(float a, float b) {
        preco = new Calculadora(a, b).calcular(new OperacaoMultiplicar());
    }

    public void calcularMediaPreco(float a, float b) {
        preco = new Calculadora(a, b).calcular(new OperacaoMedia());
    }
}
