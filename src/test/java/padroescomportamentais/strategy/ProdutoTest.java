package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {
    @Test
    void deveSomarPreco() {
        Produto p = new Produto();
        p.somarPreco(10, 5);
        assertEquals(15, p.getPreco());
    }

    @Test
    void deveCalcularMediaPreco() {
        Produto p = new Produto();
        p.calcularMediaPreco(10, 20);
        assertEquals(15, p.getPreco());
    }

    @Test
    void deveMultiplicarPreco() {
        Produto p = new Produto();
        p.multiplicarPreco(4, 3);
        assertEquals(12, p.getPreco());
    }

    @Test
    void deveDividirPreco() {
        Produto p = new Produto();
        p.dividirPreco(20, 4);
        assertEquals(5, p.getPreco());
    }

    @Test
    void deveSubtrairPreco() {
        Produto p = new Produto();
        p.subtrairPreco(20, 4);
        assertEquals(16, p.getPreco());
    }
}
