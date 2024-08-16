/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boardgame;

/**
 *
 * @author Laryssa
 */
public abstract class Piece {
    
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }
    
    protected Board getBoard(){
        return board;
    }
    
    public abstract boolean[][] possibleMoves();
    
    //Funções para testar se a peça pode mover para um determinada posição
    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }
    
    
    public boolean isThereAnPossibleMove(){
        boolean[][] mat = possibleMoves();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j ++){
                if(mat[i][j]){
                    return true;
                }
            }
        }
        
        return false;
    }
    
     
}
