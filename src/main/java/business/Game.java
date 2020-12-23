package business;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

public class Game {

    static final Logger logger = Logger.getLogger(Game.class.getName());

    private List<List<String>> table;
    private Pieces pieces;

    public Game(){
        for(int i = 0; i < 9; i++){
            List<String> temp = new ArrayList<String>();
            for(int j = 0; j < 9; j++){
                temp.add("-");
            }
            table.add(temp);
        }
        pieces = new Pieces();
        gameEngine();
    }

    public void printMatrix(){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                logger.info(table.get(i).get(j));
            }
            logger.info("\n");
        }
    }

    public boolean verify(){
        return true;
    }

    public int points(int indicator){
        if(indicator == 0){
            return 150;
        }
        else{
            return 120;
        }
    }

    public List<List<String>> getTable(){
        return table;
    }

    public void gameEngine(){
        boolean status = true;
        while(status){
            this.printMatrix();
            logger.info("Select the position of the following piece");
            Random r = new Random();
            int piece = r.nextInt(9);
            logger.info("\n");
            pieces.printPiece(piece);
            Scanner posx = new Scanner(System.in);
            Scanner posy = new Scanner(System.in);
            int x = posx.nextInt();
            int y = posy.nextInt();
            table = pieces.pieceCenter(table, x, y, piece);
            if(verify()){
                status = false;
            }
        }
    }

    public static void main(String[] args){
        logger.info("Welcome to the Blockudoku game!");
        Game game = new Game();
        logger.info("End of the game!");
    }

}
