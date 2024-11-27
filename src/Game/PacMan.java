
package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PacMan extends JFrame{
    
    private final int TILE_SIZE = 30;  // Tamaño de cada celda
    private final int GRID_WIDTH = 15;  // Número de celdas en ancho
    private final int GRID_HEIGHT = 15;  // Número de celdas en alto
    private final int WINDOW_WIDTH = TILE_SIZE * GRID_WIDTH;
    private final int WINDOW_HEIGHT = TILE_SIZE * GRID_HEIGHT;
    
    private int pacmanX = GRID_WIDTH / 2;  // Posición inicial de Pac-Man (X)
    private int pacmanY = GRID_HEIGHT / 2;  // Posición inicial de Pac-Man (Y)
    private boolean[][] walls;  // Paredes del laberinto

}
