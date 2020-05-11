package com.company;
import java.util.Random;
import java.util.Scanner;

public class Array {
    Random r=new Random();
    Scanner s=new Scanner(System.in);
    int[] t=new int[20];
    int[] copie=new int[20];

    public void Initializare(int n){
        for(int i=0;i<n;i++){
            t[i]=r.nextInt(30);
        }
        for(int i=0;i<n;i++){
           copie[i]=t[i];
        }
    }
    public void Afisare(int n){
        for (int i=0;i<n;i++){
            System.out.print(t[i]+" ");
        }
    }
    public void Reinitializaaza(int n){
        for(int i=0;i<n;i++){
            t[i]=copie[i];
        }
    }
    public void Sheelsort(int n){
        double start=System.nanoTime();
         for(int gap=n/2;gap>0;gap=gap/2){
             for (int i=gap;i<n;i++){
                 int temp=t[i];
                 int j;
                 for(j=i;j>=gap && t[j-gap]>temp;j-=gap){
                     t[j]=t[j-gap];
                 }
                 t[j]=temp;
             }
         }
         double end=System.nanoTime();
         System.out.println("\nTablou sortat dupa metoda ShellSort!");
         Afisare(n);
         System.out.println("\nNanosecunde ShellSort:"+(end-start));
    }
    public void Heapsort(int n){
        double start=System.nanoTime();
        for (int i=n/2-1;i>=0;i--){
            heapify(t,n,i);
        }
        for (int i=n-1;i>=0;i--){
            int temp=t[0];
            t[0]=t[i];
            t[i]=temp;

            heapify(t,i,0);
        }
        double end=System.nanoTime();
        System.out.println("\nTablou sortat dupa metoda HeapSort!");
        Afisare(n);
        System.out.println("\nNanosecunde HeapSort:"+(end-start));

    }
    void heapify(int t[],int n,int i){
        int largest=i;
        int l=(2*i)+1;
        int r=(2*i)+2;
        if(l<n && t[l] > t[largest]){
            largest=l;
        }
        if (r<n && t[r] > t[largest]){
            largest=r;
        }
        if(largest !=i){
            int swap=t[i];
            t[i]=t[largest];
            t[largest]=swap;

            heapify(t,n,largest);
        }

    }
   public void  QuickSort1(int left,int right){
       int n=t.length;
       int x,w,i,j;
       i=left;
       j=right;
       x=t[(i+j)/2];
       do{
           while (t[i]<x){
               i=i+1;
           }
           while(x<t[j]){
               j=j-1;
           }
           if(i<=j){
               w=t[i];
               t[i]=t[j];
               t[j]=w;
               i=i+1;
               j=j-1;
           }
       }while (i<=j);
       if(left<j){
           QuickSort1(left,j);
       }
       if (i<right){
           QuickSort1(i,right);
       }
   }
   public void QuickSort(int n){
       double start=System.nanoTime();
       QuickSort1(0,n-1);
       double end=System.nanoTime();
       System.out.println("\nTablou sortat dupa metoda QuickSort!");
       Afisare(n);
       System.out.println("\nNanosecunde QuickSort:"+(end-start));
   }
   public void MENU(){
        System.out.println("     Meniu  ");
        System.out.println("C --- initializare tablou valori aleatorii!");
        System.out.println("V ---vizualizare tablou!");
        System.out.println("R ---reinitializare ca la inceput!");
        System.out.println("S ---sortare Shellsort!");
        System.out.println("H ---sortare Heapsort!");
        System.out.println("Q ---sortare Quicksort1");
        System.out.println("X ---parasire program!");
   }

}

