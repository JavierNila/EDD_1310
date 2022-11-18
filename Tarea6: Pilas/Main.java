package TareadePilas;

import java.util.ArrayList;

public class Main<T> {

    private ArrayList<T> valor;
    private int ValCentral;

    public Main() {
        valor = new ArrayList<>();
        ValCentral = -1;
    }

    public boolean isEmpty() {
        return ValCentral < 0;
    }

    public int length() {
        return  valor.size();
    }

    public T pop() {
        if (ValCentral < 0) {
            return null;
        }
        ValCentral--;
        return valor.remove(valor.size() - 1);
    }

    public T peek() {
        if (ValCentral < 0) {
            return null;
        }
        return valor.get(ValCentral);
    }

    public void push(T value) {
    	valor.add(value);
    	ValCentral++;
    }

    @Override
    public String toString() {
        String stack = "";
        for (int i = ValCentral; i >= 0; i--) {
            stack += (valor.get(i) + "\n");
        }
        return stack;
    }

}
