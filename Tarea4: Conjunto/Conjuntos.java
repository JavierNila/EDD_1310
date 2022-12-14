import java.util.ArrayList;

public class Conjuntos<T> implements Iterable<T>{
    ArrayList<T> conjunto;

    public Conjuntos() {
        this.conjunto = new ArrayList<>();
    }

    public int longitud() {
        return this.conjunto.size();
    }

    public boolean contiene(T elemento) {
        return this.conjunto.indexOf(elemento) != -1;
    }

    public void agregar(T elemento) {
        if(!contiene(elemento)) {
            this.conjunto.add(elemento);
        }
    }

    public void eliminar(T elemento) {
        this.conjunto.remove(elemento);
    }

    public boolean igualA(Conjuntos<T> otroConjunto) {
        if(this.longitud() != otroConjunto.longitud()) {
            return false;
        }
        for(T elemento : this.conjunto) {
            if(!otroConjunto.contiene(elemento)) {
                return false;
            }
        }
        return true;
    }

    public boolean esSubConjunto(Conjuntos<T> otroConjunto) {
        if(longitud() > otroConjunto.longitud()){
            return false;
        }
        for(T elemento : this.conjunto) {
            if(!otroConjunto.contiene(elemento)) {
                return false;
            }
        }
        return true;
    }

    public void union(Conjuntos<T> otroConjunto) {
        for(T elemento : otroConjunto.conjunto) {
            this.agregar(elemento);
        }
    }

    public Conjuntos<T> interseccion(Conjuntos<T> otroConjunto) {
        Conjuntos<T> result = new Conjuntos<>();
        for(T elemento : this.conjunto) {
            if(otroConjunto.contiene(elemento)) {
                result.agregar(elemento);
            }
        }
        return result;
    }

    public Conjuntos<T> diferencia(Conjuntos<T> otroConjunto) {
        Conjuntos<T> result = new Conjuntos<>();
        for(T elemento : this.conjunto) {
            if(!otroConjunto.contiene(elemento)) {
                result.agregar(elemento);
            }
        }
        for(T elemento : otroConjunto.conjunto) {
            if(!contiene(elemento)) {
                result.agregar(elemento);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return conjunto.toString();
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < conjunto.size();
            }

            @Override
            public T next() {
                return conjunto.get(index++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}