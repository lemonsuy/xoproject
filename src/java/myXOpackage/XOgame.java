/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myXOpackage;

/**
 *
 * @author Lemon
 */
public class XOgame {
    char turn;
    char board[];
    int player1;
    int player2;
    int tie;

    public XOgame() {
        
    }

    public XOgame(char turn, char[] board, int player1, int player2, int tie) {
        this.turn = turn;
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.tie = tie;
    }
    
    public char getTurn() {
        return turn;
    }

    public void setTurn(char turn) {
        this.turn = turn;
    }

    public char[] getBoard() {
        return board;
    }

    public void setBoard(char[] board) {
        this.board = board;
    }

    public int getPlayer1() {
        return player1;
    }

    public void setPlayer1(int player1) {
        this.player1 = player1;
    }

    public int getPlayer2() {
        return player2;
    }

    public void setPlayer2(int player2) {
        this.player2 = player2;
    }

    public int getTie() {
        return tie;
    }

    public void setTie(int tie) {
        this.tie = tie;
    }
       
    
}
