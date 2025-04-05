package edu.kis.vh.nursery;

/**
 * Klasa defaultCountingOutRhymer implementuje prosty stos liczbowy (LIFO).
 * Pozwala na dodawanie liczb do stosu, sprawdzanie, czy jest pusty lub pełny,
 * podglądanie wierzchołka oraz zdejmowanie elementu ze stosu.
 */
public class defaultCountingOutRhymer {
    //Zadanie 15: Projekt jest poprawny - wszystkie testy jednostkowe przechodzą.
    private int[] nums = new int[12];

    /**
     * Zmienna przechowująca indeks ostatniego elementu na stosie.
     * Wartość -1 oznacza, że stos jest pusty.
     */
    public int total = -1;

    /**
     * Dodaje liczbę na stos, jeśli nie jest on pełny.
     *
     * @param in liczba do dodania na stos
     */
    public void countIn(int in) {
        if (!isFull())
            nums[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return true jeśli stos jest pusty, false w przeciwnym wypadku
     */
    public boolean callCheck() {
        return total == -1;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     *
     * @return true jeśli stos jest pełny, false w przeciwnym wypadku
     */
    public boolean isFull() {
        return total == 11;
    }

    /**
     * Zwraca wartość z wierzchołka stosu bez jej zdejmowania.
     *
     * @return wartość z wierzchołka stosu lub -1 jeśli stos jest pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return nums[total];
    }

    /**
     * Zdejmuje i zwraca wartość z wierzchołka stosu.
     *
     * @return wartość z wierzchołka stosu lub -1 jeśli stos jest pusty
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return nums[total--];
    }
}