import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

      String[] array = new String[9];
      array[0] = "OEA";
      array[1] = "UYI";
      array[2] = "NST";
      array[3] = "DRH";
      array[4] = "MLC";
      array[5] = "GFW";
      array[6] = "BVP";
      array[7] = "QKX";
      array[8] = "JZV";
      ArrayList<String> words = new ArrayList<>();
      String slowo = "";
      for(int i = 0; i < 3; i++){
          for(int j = 0; j < 3; j++){
              for(int k = 0; k < 3; k++){
                  for(int l = 0; l < 3; l++){
                      for(int m = 0; m < 3; m++){
                          if(nrPointers >= 1){slowo += array[trIDs[0]].substring(i,i+1);}
                          if(nrPointers >= 2){slowo += array[trIDs[1]].substring(j,j+1);}
                          if(nrPointers >= 3){slowo += array[trIDs[2]].substring(k,k+1);}
                          if(nrPointers >= 4){slowo += array[trIDs[3]].substring(l,l+1);}
                          if(nrPointers >= 5){slowo += array[trIDs[4]].substring(m,m+1);}

                          if(!words.contains(slowo)){
                              words.add(slowo);
                          }
                          slowo = "";
                      }
                  }
              }
          }
      }

      int id = 1;
      for(String str: words){
          System.out.println(id + ". " +str);
          id++;
      }
    }

}
