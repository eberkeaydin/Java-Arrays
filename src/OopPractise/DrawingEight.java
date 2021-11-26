package OopPractise;

public class DrawingEight {
    public static void main(String[] args){
        String[][] letterArray = new String[7][5];

        for (int i = 0; i < letterArray.length ; i++){
            for (int j = 0; j < letterArray[i].length ; j++){
                if ((i == 0) || (i == 3) || (i == 6)){
                    letterArray[i][j] = " * ";
                }
                else if((j == 0) || (j == 4)){
                    letterArray[i][j] = " * ";
                }
                else{
                    letterArray[i][j] = "   ";
                }
            }
            }
        for (String[] row : letterArray){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }


    }
}
