/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticstack;

/**
 *
 * @author luan
 */
public class StaticStack {

    private int elements[];

    private int top;

    public StaticStack(int capacity) {

        elements = new int[capacity];
    }

    public void push(int[] elemento) {
        for (int i = elements.length - 1, x = 0; i >= 0; i--, x++) {
            elements[i] = elemento[x];
        }

    }

    public void pop() {

        for (int i = 0; i < elements.length; i++) {
            top = elements[0];
            if (i == 0) {
                elements[i] = 0;
            }
        }

    }

    public void listar() {
        for (int element : elements) {
            System.out.println(element);
        }
    }

    public int getSize() {
        return this.elements.length;
    }

    public boolean isEmpty() {

        boolean vazio = true;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != 0) {
                vazio = false;
            }
        }
        return vazio;
    }

    public boolean isFull() {
        boolean cheio = true;
        for (int i = 0; i < elements.length; i++) {

            if (elements[i] == 0) {
                cheio = false;
            }
        }
        return cheio;
    }

}
