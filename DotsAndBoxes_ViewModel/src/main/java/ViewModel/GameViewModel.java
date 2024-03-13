/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author salce
 */
public class GameViewModel {
    private Board board;
    private List<Player> players;
    private GameView gameView; // Referencia a la vista del juego

    // Constructor
    public GameViewModel(GameView gameView) {
        this.gameView = gameView;
    }

    // Método para inicializar la vista del juego
    public void initializeGameView() {
        gameView.displayBoard(board);
        gameView.displayPlayers(players);
        // Otros métodos de inicialización de la vista
    }

    // Método para manejar la selección de una casilla en la vista
    public void handleBoxSelection(int x, int y) {
        // Lógica para manejar la selección de una casilla
        gameView.highlightBox(x, y);
        // Lógica adicional
    }


}
