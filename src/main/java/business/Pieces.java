package business;

import java.util.ArrayList;
import java.util.List;

public class Pieces {

    public List<List<String>> pieceCenter(List<List<String>> table, int x, int y, int index){
        List<List<String>> resultTable = new ArrayList<List<String>>();
        switch(index){
            case 0: resultTable = pieceA(table, x, y);
                break;
            case 1: resultTable = pieceB(table, x, y);
                break;
            case 2: resultTable = pieceC(table, x, y);
                break;
            case 3: resultTable = pieceD(table, x, y);
                break;
            case 4: resultTable = pieceE(table, x, y);
                break;
            case 5: resultTable = pieceF(table, x, y);
                break;
            case 6: resultTable = pieceG(table, x, y);
                break;
            case 7: resultTable = pieceH(table, x, y);
                break;
        }

        return resultTable;
    }

    public void printPiece(int index){

    }

    public List<List<String>> pieceA(List<List<String>> table, int posx, int posy){
        if((8 - posx) <= 1 || (8 - posy) < 1){
            return table;
        }
        int countX = 0;
        int countY = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(posx == i && posy == j){
                    table.get(i).set(j, "o");
                }
                else if(posy == j && posx > i && countY < 2 ){
                    table.get(i).set(j, "o");
                    countY++;
                }
                else if(posx == i && posy > j && countX < 2){
                    table.get(i).set(j, "o");
                    countX++;
                }
            }
        }
        return table;
    }

    public List<List<String>> pieceB(List<List<String>> table, int posx, int posy){
        return table;
    }

    public List<List<String>> pieceC(List<List<String>> table, int posx, int posy){
        return table;
    }

    public List<List<String>> pieceD(List<List<String>> table, int posx, int posy){
        return table;
    }

    public List<List<String>> pieceE(List<List<String>> table, int posx, int posy){
        return table;
    }

    public List<List<String>> pieceF(List<List<String>> table, int posx, int posy){
        return table;
    }

    public List<List<String>> pieceG(List<List<String>> table, int posx, int posy){
        return table;
    }

    public List<List<String>> pieceH(List<List<String>> table, int posx, int posy){
        return table;
    }
    
}
