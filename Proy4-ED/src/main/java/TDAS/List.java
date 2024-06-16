package TDAS;

public interface List<E> {

    public int size();

    public boolean isEmpty();

    public void clear();

    public boolean addFirst(E element); // inserta el elemento element al inicio

    public boolean addLast(E element); // inserta el elemento element al final

    public E removeFirst(); // remueve el elemento al inicio de la lista

    public E removeLast(); // remueve el elemento al final de la lista

    public E remove(int index); // remueve y retorna el elemento en la posición index

    public E get(int index); // retorna el elemento ubicado en la posición index

    public E set(int index, E element); // setea el element en la posición index

    // MÉTODOS A IMPLEMENTAR EN EL LABORATORIO

    public boolean add(int index, E element);

    public String toString();

    //public ArrayList<E> subList(int from, int to);

    //public ArrayList<E> removeFirstNElements(int n);

    //public void rotate(int k);

}
