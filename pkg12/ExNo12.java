/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex.no.pkg12;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ExNo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("Size of list:");
        int n=obj.nextInt();
        Integer l[]=new Integer[n];
        System.out.println("Elements:");
        for(int i=0;i<n;i++)
           l[i]=obj.nextInt();
        System.out.println("Display list...");
        for(int i=0;i<l.length;i++)
            System.out.print(l[i]+"\t");
        G d=new G();
        d.Odd(l);
        System.out.println("Enter the position to be exchanged: ");
        int a=obj.nextInt();
        int b=obj.nextInt();
        d.Swap(l,a-1,b-1);
        System.out.println("\nRange to find max value:");
        int c=obj.nextInt();
        int e=obj.nextInt();
        if(c>e) 
            System.out.println("Invalid index...");
        else
            d.Max(l,c,e);

    }
}

class G {
    public<T extends Integer> void Odd(T[] l) {
        int count=0;
        for(int i=0;i<l.length;i++) {
            if(l[i]%2!=0)
                count++;
        }
        if(count>0)
            System.out.println("\nNo.of odd numbers:"+count);
    }
    public<T extends Integer> void Swap(T[] l,int a,int b) {
        T temp;
        temp=l[a];
        l[a]=l[b];
        l[b]=temp;
        System.out.println("After exchanging:");
        for(int i=0;i<l.length;i++)
            System.out.print(l[i]+" ");
    }
    public<T extends Integer> void Max(T[] l,int b, int e) {
        T max=l[b];
        for(int i=b;i<=e;i++) {
            if(l[i]>max) {
                max=l[i];
            }
        }
        System.out.println("The maximal element in the specified range is : "+max);
    }
}


