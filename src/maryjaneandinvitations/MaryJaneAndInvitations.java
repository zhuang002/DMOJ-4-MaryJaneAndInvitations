/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maryjaneandinvitations;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class MaryJaneAndInvitations {

    static Scanner sc=new Scanner(System.in);
    static String[] letters={
        "Dear [name], beloved artist, I would love to have you at my party. Come to my crib on April 20th.",
        "Dear [name], beloved occasion enthusiast, come to my crib to celebrate this very special day.",
        "Dear [name], April 20th is happening again this year. Don't miss out."
    };
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=sc.nextInt();
        sc.nextLine();
        int[] types=getGuestTypes(n,sc.nextLine());
        for (int i=0;i<n;i++) {
            System.out.println(getLetter(types[i],sc.nextLine()));
        }
    }

    public static int[] getGuestTypes(int n,String sTypes) {
        int[] types=new int[n];
        int i=0;
        int j=0;
        int k=-1;
        int iType;
        for (i=0;i<sTypes.length();i++) {
            
            char c=sTypes.charAt(i);
            switch (c) {
                case 'A':
                    iType=0;
                    break;
                case 'O':
                    iType=1;
                    break;
                case 'R':
                    iType=2;
                    break;
                case 'X':
                    if (k==-1) k=j-1;
                    else k--;
                    continue;
                default:
                    continue;
            }
            
            if (k!=-1){
                types[k]=iType;
                k=-1;
            } else {
                if (j>n-1) break;
                types[j]=iType;
                j++;
            }
        }
        return types;
    }

    private static String getLetter(int type, String name) {
        String letter=letters[type];
        return letter.replace("[name]", name);
    }
    
}
