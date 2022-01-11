import java.util.ArrayList;
import java.util.Scanner;

public class BeginningMain {

    static ArrayList<Triple> tripleMemory = new ArrayList<Triple>(9);
    static  ArrayList<String> wordMemory = new ArrayList<String>();

    public static void main(String[] args) {

        for(int i = 0; i < 9; i++){
            Triple triple = new Triple(i+1);
            tripleMemory.add(triple);
        }
        fillTripleMemory(tripleMemory);

        System.out.println("HOW MANY POINTERS ARE IN USE?");
        Scanner scannerNrOfPointers = new Scanner(System.in);
        int nrPointers = scannerNrOfPointers.nextInt();

        int[] trIDs = new int[nrPointers];
        System.out.println("IN ORDER AT WHICH TRIPLES DO YOU POINT");
        int inserted = 0;
        while(inserted < nrPointers){
            Scanner scannerPointerID = new Scanner(System.in);
            trIDs[inserted] = scannerPointerID.nextInt() - 1;
            inserted++;
        }

        System.out.println("WSZYSTKIE KOMBINACJE");

//        for(int i = 0; i < nrPointers; i++){
//            wordMemory.add();
//        }

        int id = 1;
        for(String word: wordMemory){
            System.out.println(id + ". " + word);
            id++;
        }
    }
    public static void fillTripleMemory(ArrayList<Triple> trMemory){
        trMemory.get(0).setLetters("OEA");
        trMemory.get(1).setLetters("UYI");
        trMemory.get(2).setLetters("NST");
        trMemory.get(3).setLetters("DRH");
        trMemory.get(4).setLetters("MLC");
        trMemory.get(5).setLetters("GFW");
        trMemory.get(6).setLetters("BVP");
        trMemory.get(7).setLetters("QKX");
        trMemory.get(8).setLetters("JZV");
    }

    public static String moveOneRight(String str){
        str = str.substring(str.length()-1) + str.substring(0,str.length()-1);
        return str;
    }

    public static String[] moveOneRowRight(int row, String[] mesh){
        String moved = mesh[row];
        moved = moveOneRight(moved);
        mesh[row] = moved;
        return mesh;
    }

    public static String[] createMesh(int nrWheels, int[] trIDs){
        String[] mesh = new String[nrWheels];
        for(int i = 0; i < nrWheels; i++){
            mesh[i] = tripleMemory.get(trIDs[i]).getLetters();
        }
        return mesh;
    }

    public static void readColumns(String[] mesh){
        String word1 = "";
        String word2 = "";
        String word3 = "";

        for(String str : mesh){
            word1 += str.substring(0,1);
            word2 += str.substring(1,2);
            word3 += str.substring(2,3);
        }

        wordMemory.add(word1);
        wordMemory.add(word2);
        wordMemory.add(word3);
    }
}
