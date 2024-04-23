package com.harshkumar.tictactoe.models;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private int nextPlayerMoveIndex;
    private List<Move> moves;
    private GameState gameState;
    private Player winner;
}