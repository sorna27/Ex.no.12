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
public class sorting {
    public static void main(String [] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter 1:integer\n2:double\n3.Float\n4.byte");
        int a=obj.nextInt();
        switch(a)
            {
                case 1:
                {
                    de<Integer> m=new de<>();
                    System.out.println("Integer type...");
                    System.out.println("Size of list:");
                    int n=obj.nextInt();
                    Integer num[]=new Integer[n];
                    System.out.println("List elements:");
                    for(int i=0;i<n;i++)
                        num[i]=obj.nextInt();
                    System.out.println("Before sorting...\nDisplay list...");
                    for(int i=0;i<n;i++)
                        System.out.println(num[i]);                   
                    m.sort(num);
                    break;
                }
                case 2:
                {
                    de<Double> d = new de<>();
                    System.out.println("Double type...");
                    System.out.println("Size of list:");
                    int n=obj.nextInt();
                    Double num[]=new Double[n];
                    System.out.println("List elements:");
                    for(int i=0;i<n;i++)
                        num[i]=obj.nextDouble();
                    System.out.println("Before sorting...\nDisplay list...");
                    for(int i=0;i<n;i++)
                        System.out.println(num[i]);
                    d.sort(num);
                    break;
                }
                case 3:
                {
                   de<Float> f = new de<>();
                   System.out.println("Float type...");
                   System.out.println("Size of list:");
                    int n=obj.nextInt();
                    Float num[]=new Float[n];
                    System.out.println("List elements:");
                    for(int i=0;i<n;i++)
                        num[i]=obj.nextFloat();
                    System.out.println("Before sorting...\nDisplay list...");
                    for(int i=0;i<n;i++)
                        System.out.println(num[i]);
                    f.sort(num);
                    break;
                }
                case 4:
                {
                  de<Byte> b = new de<>();
                  System.out.println("Byte type...");
                  System.out.println("Size of list:");
                  int n=obj.nextInt();
                  Byte num[]=new Byte[n];
                  System.out.println("List elements:");
                  for(int i=0;i<n;i++)
                    num[i]=obj.nextByte();
                  System.out.println("Befor sorting...\nDisplay list");
                  for(int i=0;i<n;i++)
                    System.out.println(num[i]);
                  b.sort(num);
                    break;
                }
                default:
                {
                    System.out.println("Invalid input...");
                }
        }
    }
    }
class de<T>
{
   T c;
   public <T extends Number>void sort(T[] l)
   {
       for(int i=0;i<l.length;i++)
       {
           for(int j=i;j<l.length;j++)
           {
              if(l[i].intValue()>l[j].intValue())
               {
                   T c=l[i];
                   l[i]=l[j];
                   l[j]=(T) c;
               }
           }
       
       }
       System.out.println("Sorted list...");
       for(int k=l.length-1;k>=0;k--)
       {
           System.out.println(l[k]);
       }
       }
   }
