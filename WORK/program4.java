/*
        Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
         */


package WORK;

public class program4 {
    public static void main(String[] args) {
        
      String text = "Добро пожаловать на курс по Java";
      System.out.println(ex3(text));
      
    }

     static String ex3(String text) {
        
        String[] temp = text.split(" ");
        String res = "";
        for (int i = temp.length-1; i >= 0; i--) {
            res += temp[i] + " ";
        }
        return res;
    }
     
}
