import java.util.ArrayList;
import java.util.Scanner;

public class OldCodeSummer21 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ile wskaźników użył duch?");
        int ghostPointer = keyboard.nextInt();
        char[] arr1 = new char[3];
        char[] arr2 = new char[3];
        char[] arr3 = new char[3];
        char[] arr4 = new char[3];
        char[] arr5 = new char[3];
        char[][] arrayOfArrays = new char[][]{arr1,arr2,arr3,arr4,arr5};
        for(int i = 0; i < ghostPointer; i++){//ile wskaźników
            char[] arrTemp = new char[3];
            System.out.println("Wprowadź kolejno litery ze wskaźnika nr. " + (i+1));
            for(int p = 0; p < 3; p++){
                char letterInput = keyboard.next().charAt(0);
                arrTemp[p] = letterInput;
            }
            for(int j = 0; j < 3; j++){//uzupełniam odpowiednie arrX tym co wpisaliśmy
                arrayOfArrays[i][j] = arrTemp[j];
            }
        }

        ArrayList<String> mem1 = new ArrayList<String>();
        ArrayList<String> mem2 = new ArrayList<String>();
        ArrayList<String> mem3 = new ArrayList<String>();
        ArrayList<String> mem4 = new ArrayList<String>();
        ArrayList<String> mem5 = new ArrayList<String>();
//        String[] memory1 = new String[3];
//        String[] memory2 = new String[9];
//        String[] memory3 = new String[27];
//        String[] memory4 = new String[81];
//        String[] memory5 = new String[243];

        String slowo = "";
        int counter = 0;
        for (int q = 0; q < 3; q++) {
            for (int w = 0; w < 3; w++) {
                for (int e = 0; e < 3; e++) {
                    for (int r = 0; r < 3; r++) {
                        for(int t = 0; t < 3; t++){
                            if(ghostPointer >= 1) slowo += arr1[q];
                            if(ghostPointer >= 2) slowo += arr2[w];
                            if(ghostPointer >= 3) slowo += arr3[e];
                            if(ghostPointer >= 4) slowo += arr4[r];
                            if(ghostPointer == 5) slowo += arr5[t];

                            if(ghostPointer >= 1) mem1.add(slowo);
                            if(ghostPointer >= 2) mem2.add(slowo);
                            if(ghostPointer >= 3) mem3.add(slowo);
                            if(ghostPointer >= 4) mem4.add(slowo);
                            if(ghostPointer == 5) mem5.add(slowo);
                            //counter++;
                            System.out.println(counter + ".  " + slowo);
                            //if(ghostPointer == 5) System.out.println(slowo);  slowo = "";
                            slowo = "";
                        }
                        //if(ghostPointer == 4) System.out.println(slowo);  slowo = "";
                    }
                    //if(ghostPointer == 3) System.out.println(slowo); slowo = "";
                }
                //if(ghostPointer == 2) System.out.println(slowo);  slowo = "";
            }
            //if(ghostPointer == 1) System.out.println(slowo);  slowo = "";
        }
        System.out.println(mem3);

    }
}