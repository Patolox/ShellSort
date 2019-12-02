/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3q;

import java.util.Random;

/**
 *
 * @author titof
 */
public class Main {

    public static void randomInsert(int v[]){
        Random r = new Random();
        
        for(int i = 0; i < v.length; i++){
            v[i] = r.nextInt(500) + 1;
        }
    }
    
   public static void printArray(int []array){
        
        for(int i = 0; i < array.length; i++){
         
            System.out.print(" | " + array[i]);
            
        }
    }
    
    public static void shellSort(int array[]){
        int temp;
        int interval = 1;
        int aLenght = array.length;
        
        while(interval <= aLenght){
            interval = interval*3+1;
        }
        
        interval = interval/3;
        
        while(interval > 0){
           
            for(int i = interval; i < aLenght; i++){
                
                temp = array[i];
                int j = i;
                
                while(j >= interval && array[j-interval] > temp){
                 
                array[j] = array[j - interval];
                j = j - interval;
                
                }
                
                array[j] = temp;
                
            }
            
            interval = interval/2;
                
        }  
        
    }
    
    public static int getRepeat(int v[]){
        int r, q = 0, j = 0, l = 0;
        
        for(int i = 0; i < v.length-1; i++){
            r = v[i];
            if(r == v[i+1]){
                q++;
             
            }else if (q >= j){
                j = q;
                q = 0;
                l = v[i];
            }
        }
        
        return l;
    }
    
    public static void main(String[] args) {
        
        int v[] = new int [10000];
        randomInsert(v);
        printArray(v);
        System.out.println("");
        shellSort(v);
        printArray(v);
        System.out.println("");
        System.out.println(getRepeat(v));
    }
    
}
