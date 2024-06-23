package TDAS;

import java.io.Serializable;

public class ArrayList<E> implements List<E>, Serializable{
    private E[] elements = null; //arreglo de elementos genericos
    private int capacity = 100;
    private int effectiveSize;
    
    public ArrayList(){
        elements = (E[])(new Object[capacity]); // SI FUNCIONA con Casting permitido con el arrayList
        effectiveSize = 0;
    }
    
    private boolean isFull(){
        return effectiveSize == capacity;
    }
   
    @Override
    public boolean addFirst(E e) {
        
        // no se insertan nulos
        if(e==null){
            return false;
        } else if (isEmpty()){
            elements[0] = e;
            effectiveSize++;
            //elements[effectiveSize ++] = e; //otra forma de hacer las 2 lineas anteriores
            return true;
        } else if (isFull()){
            addCapacity();
        }
        
        for (int i=effectiveSize-1; i >=0; i--){
            elements[i+1]=elements[i]; //bit shifting 
            //desplazamiento de valores hacia la derecha, 
            //debe empezar de atras hacia adelante
        }
        elements[0] = e;
        effectiveSize++;
        return true;
    }

    @Override
    public boolean addLast(E e) {
       if (e == null) {
            return false;
        }
        if (isFull()) {
            addCapacity();
        }
        elements[effectiveSize] = e;
        effectiveSize++;
        //elements[effectiveSize++] = e; otra forma de hacer las 2 lineas anteriores
        return true;
    }

    @Override
    public E removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E removeLast() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int size() {
        return effectiveSize;
    }

    @Override
    public boolean isEmpty() {
        return effectiveSize == 0;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void addCapacity() {
        E[] tmp = (E[]) new Object[capacity * 2];
        for (int i = 0; i < capacity; i++){
            tmp[i] = elements[i];
        }
        elements = tmp;
        capacity = capacity * 2;
    }
    
    @Override
    public String toString() {
        String cadena = "[";
        int contador = 0;
        for (E el : elements) {
            if (el == null) {
                return cadena+"]";
            } else {
                contador+=1;
                cadena += el; }

            if (effectiveSize > contador ) {
                cadena +=",";
            }
        }
        return cadena;  
    }
    
    @Override
    public boolean add(int index, E element) {
        
        if(element==null){
            return false;
        } else if (isEmpty()) {
            elements[index] = element;
            effectiveSize++;
            return true;
        } else if (isFull()) {
            addCapacity();
        }
        
        for (int i=effectiveSize; i > index; i--){
            elements[i]=elements[i-1]; //bit shifting 
            //desplazamiento de valores hacia la derecha, 
            //debe empezar de atras hacia adelante
            }
        elements[index] = element;
        effectiveSize++;
        return true; 
    }
    
    public ArrayList<E> sublist(int from, int to) {
        ArrayList<E> sublist = new ArrayList<>();
        int contador = 0;
        for (int i = from; i <= to; i++) {
            sublist.add(contador, this.get(i));
            contador++;
        }
        return sublist;
    }
   
    public ArrayList<E> removeFirstNElements(int n) {
        ArrayList<E> removedElements = new ArrayList<>();

        int contador = 0;
        for (int i = n; i<effectiveSize; i++) {
            removedElements.add(contador,elements[i]);
            contador+=1;
        }

        effectiveSize -= n;
        return removedElements;
    }

    public ArrayList<E> rotate(int k) {
        ArrayList<E> rotada = new ArrayList<>();
        
        if(elements == null || isEmpty() || k<=0) {
            return rotada;
        }
        
        int from = effectiveSize - k;
        
        ArrayList<E> temp = new ArrayList<>();
        temp = this.sublist(from, effectiveSize);
        
        
        for(int i = 0 ; i<k ; i++) {
            rotada.add(i, temp.get(i));
            rotada.addLast(this.get(i));
        }
        
        return rotada;

    }
    
}
