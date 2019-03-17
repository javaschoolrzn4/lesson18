package com.javarzn.calc;

/**
 * Пример приложения "Калькулятор".
 */
public class Calculator {
    /**
     * Сложение.
     *
     * @param n1 слагаемое
     * @param n2 слагаемое
     * @return сумма
     */
    public long summarize(long n1, long n2) {
        return n1 + n2;
    }

    /**
     * Вычитание.
     *
     * @param n1 уменьшаемое
     * @param n2 вычитаемое
     * @return разность
     */
    public long subtract(long n1, long n2) {
        return n1 - n2;
    }

    /**
     * Умножение.
     *
     * @param n1 первый множитель
     * @param n2 второй множитель
     * @return произведение
     */
    public long multiply(long n1, long n2) {
        return n1 * n2;
    }

    /**
     * Деление.
     *
     * @param n1 делимое
     * @param n2 делитель
     * @return частное
     */
    public long divide(long n1, long n2) {
        return n1 / n2;
    }

    /**
     * Корень
     *
     * @param n
     * @return
     */


    public long sqrt(long n) {
        return (long) Math.sqrt(n);
    }
    public long pow(long a, long b) {
        return (long) Math.pow(a, b);
    }
    public long sin(long a) {
        return (long) Math.sin(a);
    }
    public long cos(long a) {
        return (long) Math.cos(a);
    }
    public long tan(long a) {
        return (long) Math.tan(a);
    }
}





