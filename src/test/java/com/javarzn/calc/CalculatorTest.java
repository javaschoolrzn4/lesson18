package com.javarzn.calc;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Тест на класс {@link com.javarzn.calc.Calculator}.
 */
public class CalculatorTest {
    private Calculator calc;
    @Before
    public void setUp() {
        this.calc = new Calculator();
    }

    @After
    public void teerDown() {
        this.calc = null;
    }

    /**
     * Тест суммирования.
     * <br/>
     * Необходимо обратить внимание на три момента:<br/>
     * 1) наименование теста<br/>
     * 2) выполнение пустого теста<br/>
     * 3) местоположение самого теста<br/>
     * <br/>
     * Как вы думаете, когда тест считается успешно пройденным?<br/>
     * Рассмотреть процесс создания тестов в IntelliJ IDEA<br/>
     */
    @Test
    public void testSummarize() {
        Assert.assertThat(calc.summarize(2, 3), is(5L));
    }

    @Test
    public void subtract() {
    }

    @Test
    public void multiply() {
    }

    @Test
    public void divide() {
    }

    @Test
    public void sqrt() {
        Assert.assertEquals(this.calc.sqrt(4), 2);
    }

    @Test
    public void pow() {
        Assert.assertEquals(calc.pow(2, 3), 8);
    }

    @Test
    public void sin() {
        Assert.assertEquals(calc.sin(45), (long)0.5);
    }

    @Test
    public void cos() {
        Assert.assertEquals(calc.cos(45), (long)0.5);
    }

    @Test
    public void tan() {
        Assert.assertEquals(calc.tan(45), (long)1);
    }
}
