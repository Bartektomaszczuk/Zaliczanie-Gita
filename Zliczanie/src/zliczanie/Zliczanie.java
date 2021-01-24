/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zliczanie;

/**
 *
 * @author barte
 */
public class Zliczanie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("coś");    
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz Plik aby liczyć słowa z pliku");
        System.out.println("Wpisz klawiatura aby liczyć słowa z klawiatury");
        String opcja = scan.nextLine();
       if("klawiatura".equals(opcja)) {
            Scanner scan2 = new Scanner(System.in);
 
            String wyrazy = scan2.nextLine();
            int countWord = 0;
 
            String[] wordList = wyrazy.split("\\s+");
 
            countWord += wordList.length;
 
            System.out.println("Liczba słów = " + countWord);
       }
        else{
            System.exit(1);
        }
    
}
}