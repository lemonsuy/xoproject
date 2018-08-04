<<<<<<< HEAD
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
    char board[] = new char[9];
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
       
    public boolean checkVertical(){
        int pointer1 = 0;
        int pointer2 = 3;
        int pointer3 = 6;
        
        for(int i = 0 ; i<3 ;i++){
        if(board[pointer1]=='x'&&board[pointer2]=='x'&&board[pointer3]=='x'){
            return true;
        }
        else{
            pointer1++;
            pointer2++;
            pointer3++;
        }      
        }
        return false;
    }
    
       public void StartGame() {
        turn = 'x';
        player1 = 0;
        player2 = 0;
        tie = 0;
    }

    public char SwitchTurn(char turn) {
        if (turn == 'x') {
            turn = 'o';
        } else {
            turn = 'x';
        }
        return turn;
    }

    public void AddScore(int player1, int player2, char turn) {
        if (turn == 'x') {
            player1++;
        } else {
            player2++;
        }
    }
    
    public boolean checkAllBoard(char[] board){
        for (int maxarray = 0; maxarray < board.length; maxarray++) {
            if(board[maxarray] == ' '){
                return true;
            }else{
                tie++;
            }
        }
        return false;
    }
    
    public void SetValueInArray(int position , char turn){
        board[position] = turn;
    }
}
=======
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
       
    public boolean checkVertical(){
        int pointer1 = 0;
        int pointer2 = 3;
        int pointer3 = 6;
        
        for(int i = 0 ; i<3 ;i++){
        if(board[pointer1]=='x'&&board[pointer2]=='x'&&board[pointer3]=='x'){
            return true;
        }
        else{
            pointer1++;
            pointer2++;
            pointer3++;
        }      
        }
        return false;
    }
}
>>>>>>> b8e7f854af0d5610a4495c90634bf45ca2422545
