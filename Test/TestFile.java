import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class TestFile {
    @Test
    public void test_problem1(){
        assertEquals(true,Main.isPrime(17));
        assertEquals(false,Main.isPrime(465));
        assertEquals(true,Main.isPrime(7919));
    }
    @Test
    public void test_problem2(){
        assertArrayEquals(new int[]{},Main.primeFactors(17));
        assertArrayEquals(new int[]{3, 5},Main.primeFactors(15));
        assertArrayEquals(new int[]{61,113},Main.primeFactors(6893));
    }
}
