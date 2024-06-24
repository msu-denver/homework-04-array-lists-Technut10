/*
 * CS2050 - Computer Science II
 * Instructor: Thyago Mota
 * Description: Homework 04 - ArrayList
 */

/**
 * <p>ArrayList creation from scratch with functions./p>
 * @author Anthony Putman
 * @version 1.0.0
 **/
public class ArrayList<E> {

    /**
     * internal array to hold the elements
     **/
    private E data[];

    /**
     * variable to control how many elements are in the array list
     **/
    private int size;

    private static final int INITIAL_CAPACITY = 10;
    private static final int MIN_CAPACITY     = 2;

 /**
  * enables the creation of an array list with INITIAL_CAPACITY and size zero
  **/
    public ArrayList() {
        size = 0;
        data = (E[]) new Object[INITIAL_CAPACITY];
    }

    /**
     *  enables the creation of an array list with given capacity and size zero
     **/
    public ArrayList(int capacity) {
        size = 0;
        if (capacity < MIN_CAPACITY)
            data = (E[]) new Object[INITIAL_CAPACITY];
        else
            data = (E[]) new Object[capacity];
    }

    /**
     *  @return true/false depending on whether the list is empty or not
     *  @author Anthony Putman
     *  */
    public boolean isEmpty() {
        return size == 0;
    }

   /**
    *  return true/false depending on whether the list is at capacity or not
    * @return true or false;
    * @author Anthony Putman
    **/
    public boolean isFull() {
        return size == data.length;
    }

    /**
     *  add a new element (with the value) at the end of the list!
     *   if list is full, increase the capacity of the array by INITIAL_CAPACITY before appending
     **/
    public void append(E value) {
        if (isFull()) {
            E newData[] = (E[]) new Object[data.length + INITIAL_CAPACITY];
            for (int i = 0; i < size; i++)
                newData[i] = data[i];
            data = newData; // updating the reference
        }
        data[size++] = value;
    }

     /**
      * return a string representation of the array list
      **/
    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < size; i++)
            s += data[i] + " ";
        s = s.trim() + "]";
        return s;
    }

    /**
    * TODOd: return the number of elements
    **/
    public int size() {
        return size;
    }

    /**
     * returns true if the given value is in the array list
     **/
    public boolean contains(E value) {
        for(int i = 0; i < size; i++){
            if(data[i].equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * reverses the array
     **/
    public void reverse() {
        int j = 0;
        if(data.length == 0){
            System.out.println("[]");
        }
        E tempAr[] = (E[]) new Object[data.length];
        E temp;
        for(int i = data.length; i > 0; i--){
            temp = data[i-1];
            tempAr[j] = temp;
            j++;
        }
    }
    /**
     * clears the array
     **/
    public void clear() {
        size = 0;
    }
}
