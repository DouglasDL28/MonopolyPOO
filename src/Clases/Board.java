package Clases;


import java.util.ArrayList;

public class Board {
    private ArrayList<Player> players;
    private ArrayList<Property> cells;
    private Integer bank;
    private Boolean PlayerOneTurn = true;
    private Integer Height;
    private Integer Width;
    private ArrayList<PrivateProperty> freeCells;
    private Dice dice;


    public Board() {
        this.players = new ArrayList<Player>();
        players.add(new Player(1));
        players.add(new Player(2));

        this.cells = new ArrayList<Property>();
        cells.add(new PublicProperty("GO", 10,0 ));
        cells.add(new PrivateProperty("Mediterranean Avenue", 9, 0, "Brown", 60, 60));
        cells.add(new PrivateProperty("Community Chest", 8, 0, "None", 0, 0));
        cells.add(new PrivateProperty("Baltic Avenue", 7, 0, "Brown", 60, 60));
        cells.add(new PrivateProperty("Income Tax", 6, 0, "None", 0, 200));
        cells.add(new PrivateProperty("Reading Railroad", 5, 0, "None", 0, -200));
        cells.add(new PrivateProperty("Oriental Avenue", 4, 0, "Sky Blue", 100, 100));
        cells.add(new PrivateProperty("Chance", 3, 0, "None", 0,0));
        cells.add(new PrivateProperty("Vermont Avenue", 2, 0, "Sky Blue", 100, 100));
        cells.add(new PrivateProperty("Conneticut Avenue", 1, 0, "Sky Blue", 100, 60));

        cells.add(new PublicProperty("Jail",0,0));
        cells.add(new PrivateProperty("ST. Charles Place", 0, 1, "Pink", 100, 100));
        cells.add(new PrivateProperty("Electric Company", 0, 2, "None", 150, 150));
        cells.add(new PrivateProperty("States Avenue", 0, 3, "Pink", 140, 140));
        cells.add(new PrivateProperty("Virginia Avenue", 0, 4, "Pink", 140, 140));
        cells.add(new PrivateProperty("Pennsylvania Railroad", 0, 5, "None", 200, 200));
        cells.add(new PrivateProperty("ST. James Place", 0, 6, "Orange", 180, 180));
        cells.add(new PrivateProperty("Community Chest", 0, 7, "None", 0, 60));
        cells.add(new PrivateProperty("Tennessee Avenue", 0, 8, "Orange", 180, 180));
        cells.add(new PrivateProperty("New York Avenue", 0, 9, "Orange", 180, 180));

        cells.add(new PublicProperty("Free Parking", 0,10));
        cells.add(new PrivateProperty("Kentucky Avenue", 1, 10, "Red", 220, 220));
        cells.add(new PrivateProperty("Chance", 2, 10, "None", 0, 0));
        cells.add(new PrivateProperty("Kentucky Avenue", 3,10, "Red", 220,220));
        cells.add(new PrivateProperty("Kentucky Avenue", 4,10, "Red", 220,220));
        cells.add(new PrivateProperty("Kentucky Avenue", 5,10, "Red", 220,220));
        cells.add(new PrivateProperty("Kentucky Avenue", 6,10, "Red", 220,220));
        cells.add(new PrivateProperty("Kentucky Avenue", 7,10, "Red", 220,220));
        cells.add(new PrivateProperty("Kentucky Avenue", 8,10, "Red", 220,220));
        cells.add(new PrivateProperty("Kentucky Avenue", 9,10, "Red", 220,220));

        cells.add(new PublicProperty("Go to Jail", 10,10));
        cells.add(new PrivateProperty("Kentucky Avenue", 10,9, "Red", 220,220));
        cells.add(new PrivateProperty("Kentucky Avenue", 10,8, "Red", 220,220));
        cells.add(new PrivateProperty("Kentucky Avenue", 10,7, "Red", 220,220));
        cells.add(new PrivateProperty("Kentucky Avenue", 10,6, "Red", 220,220));
        cells.add(new PrivateProperty("Kentucky Avenue", 10,5, "Red", 220,220));
        cells.add(new PrivateProperty("Kentucky Avenue", 10,4, "Red", 220,220));
        cells.add(new PrivateProperty("Kentucky Avenue", 10,3, "Red", 220,220));
        cells.add(new PrivateProperty("Kentucky Avenue", 10,2, "Red", 220,220));
        cells.add(new PrivateProperty("Kentucky Avenue", 10,1, "Red", 220,220));


        this.bank = 1000;
        PlayerOneTurn = true;
        Height = 11;
        Width = 11;
        this.freeCells = new ArrayList<PrivateProperty>();
        freeCells.add(new PrivateProperty("Mediterranean Avenue", 9, 0, "Brown", 60, 60));
        freeCells.add(new PrivateProperty("Community Chest", 8, 0, "None", 0, 0));
        freeCells.add(new PrivateProperty("Baltic Avenue", 7, 0, "Brown", 60, 60));
        freeCells.add(new PrivateProperty("Income Tax", 6, 0, "None", 0, 200));
        freeCells.add(new PrivateProperty("Reading Railroad", 5, 0, "None", 0, -200));
        freeCells.add(new PrivateProperty("Oriental Avenue", 4, 0, "Sky Blue", 100, 100));
        freeCells.add(new PrivateProperty("Chance", 3, 0, "None", 0,0));
        freeCells.add(new PrivateProperty("Vermont Avenue", 2, 0, "Sky Blue", 100, 100));
        freeCells.add(new PrivateProperty("Conneticut Avenue", 1, 0, "Sky Blue", 100, 60));
        freeCells.add(new PrivateProperty("ST. Charles Place", 0, 1, "Pink", 100, 100));
        freeCells.add(new PrivateProperty("Electric Company", 0, 2, "None", 150, 150));
        freeCells.add(new PrivateProperty("States Avenue", 0, 3, "Pink", 140, 140));
        freeCells.add(new PrivateProperty("Virginia Avenue", 0, 4, "Pink", 140, 140));
        freeCells.add(new PrivateProperty("Pennsylvania Railroad", 0, 5, "None", 200, 200));
        freeCells.add(new PrivateProperty("ST. James Place", 0, 6, "Orange", 180, 180));
        freeCells.add(new PrivateProperty("Community Chest", 0, 7, "None", 0, 60));
        freeCells.add(new PrivateProperty("Tennessee Avenue", 0, 8, "Orange", 180, 180));
        freeCells.add(new PrivateProperty("New York Avenue", 0, 9, "Orange", 180, 180));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 1, 10, "Red", 220, 220));
        freeCells.add(new PrivateProperty("Chance", 2, 10, "None", 0, 0));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 3,10, "Red", 220,220));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 4,10, "Red", 220,220));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 5,10, "Red", 220,220));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 6,10, "Red", 220,220));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 7,10, "Red", 220,220));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 8,10, "Red", 220,220));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 9,10, "Red", 220,220));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 10,9, "Red", 220,220));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 10,8, "Red", 220,220));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 10,7, "Red", 220,220));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 10,6, "Red", 220,220));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 10,5, "Red", 220,220));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 10,4, "Red", 220,220));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 10,3, "Red", 220,220));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 10,2, "Red", 220,220));
        freeCells.add(new PrivateProperty("Kentucky Avenue", 10,1, "Red", 220,220));

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

    public void buyPropertyToBoard (PrivateProperty property, Player player) {
        if (this.freeCells.size() > 0) {
            freeCells.remove(property);
            player.buyProperty(property);
        }
    } // Comprar una propiedad del tablero

    public void sellPropertyToBoard (PrivateProperty property, Player player) {
        freeCells.add(property);
        player.sellProperty(property);
    } // Vender una propiedad del tablero.

    public void propertyExchange (PrivateProperty property, Player player1, Player player2) {
        if (player1.getProperties().contains(property)) {
            player1.sellProperty(property);
            player2.buyProperty(property);
        }
    } // Intercambio de una propiedad entre jugadores.

    public Property findPropertybyIndex (Integer X, Integer Y) {
        for (Property property : cells) {
            if (property.getRow() == Y && property.getColumn() == X) {
                return property;
            }
        }
        return null;
    }

    public PrivateProperty findPrivatePropertybyIndex (Integer X, Integer Y) {
        for (PrivateProperty property : freeCells) {
            if (property.getRow() == Y && property.getColumn() == X) {
                return property;
            }
        }
        return null;
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

    public Dice getDice() {
        return dice;
    }
}
