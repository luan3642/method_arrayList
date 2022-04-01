/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author luan
 */
public class Array {

  
    private int[]array;
    boolean valorObtido = false;
    int valorNumerico = 0;

    public Array (int data){
        array = new int[data];
    }

    public void set(int index, int value){
        array[index] = value;
    }

    public int[] arrayGet(){
        return this.array;
    }

    public int size(){
        return array.length;
    }

    public int indexOf(int value){
        for(int i = 0; i<array.length; i++){
            if(array[i] == value){
                int valorObtido = array[i];
            }
        }
        return valorNumerico;
    }

    public boolean contains(int value){
        for(int i = 0; i<array.length; i++){
            if(array[i] == value){
                 valorObtido = true;
            }
        }
        return valorObtido;
    }








    
}
