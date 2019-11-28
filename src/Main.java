/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,k;
        String answer;
        
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("\nEnter The First Number : ");
            i=scanner.nextInt();

            System.out.print("Enter The Second Number : ");
            j=scanner.nextInt();

            for(k=i;k<=j;k++){
                System.out.print(k);
                if(i!=j){
                    System.out.print("+");
                }
            }

            System.out.println("="+(j-i+1)*((2*i)+(j-i))/2);
            
            System.out.print("Continue ? (Y or N) : ");
            answer=scanner.next();
            
        }while(answer.equalsIgnoreCase("y"));
    }
    
}
