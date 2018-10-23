package Clases;


import java.util.ArrayList;

public class Board {
    private ArrayList<Player> players;
    private ArrayList<Property> cells;
    private Integer bank;
    private Boolean PlayerOneTurn;
    private Integer Height;
    private Integer Width;
    private ArrayList<PrivateProperty> freeCells;
    private Dice dice;


    public Board() {
        this.players = new ArrayList<Player>();
        this.cells = new ArrayList<Property>();
        this.bank = 1000;
        PlayerOneTurn = true;
        Height = 11;
        Width = 11;
        this.freeCells = new ArrayList<PrivateProperty>();
        this.dice = new Dice();
    } //Constructor

    private boolean hasWinner() {
        boolean hasWinner = false;
        for (Player player : players) {
            if (player.getMoney() == 0) {
                hasWinner = true;
            }
        }
        return hasWinner;
    }

    public int getWinner() {
        if (this.hasWinner()) {
            for (Player player : players) {
                if (player.getMoney() == 0) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public void changeTurn() {
        if (PlayerOneTurn) {
            this.PlayerOneTurn = false;
        } else {
            this.PlayerOneTurn = true;
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    } //Obtener los jugadores.

    public ArrayList<Property> getCells() {
        return cells;
    } //Obtener las prop

    public void setCells(ArrayList<Property> cells) {
        this.cells = cells;
    }

    public Integer getBank() {
        return bank;
    }

    public void setBank(Integer bank) {
        this.bank = bank;
    }

    public Boolean getPlayerOneTurn() {
        return PlayerOneTurn;
    }

    public Integer getHeight() {
        return Height;
    } //Obtener la altura de el tablero

    public Integer getWidth() {
        return Width;
    } //Obtener el ancho del tablero.

    public ArrayList<PrivateProperty> getFreeCells() {
        return freeCells;
    }

    public void buyProperty(PrivateProperty property, Player player) {
        if (this.freeCells.size() > 0) {
            freeCells.remove(property);
            player.addProperty(property);
        }
    }



}
