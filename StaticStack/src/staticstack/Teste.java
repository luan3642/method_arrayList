/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticstack;

import java.util.Scanner;

/**
 *
 * @author luan
 */
public class Teste {
    public static void main(String[] args) {
       
           int[] valor = {5,2,1,5,6,7};
        
           StaticStack staticStack = new StaticStack(valor.length);
           
           staticStack.push(valor);
           staticStack.listar();
           System.out.println("");
//           staticStack.pop();
           System.out.println("");
           staticStack.listar();
           
           System.out.println("Tamanho: "+staticStack.getSize());
           System.out.println("Está vazia: "+staticStack.isEmpty());
           System.out.println("Está cheio: "+staticStack.isFull());
           
    }
}
