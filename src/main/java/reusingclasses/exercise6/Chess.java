package reusingclasses.exercise6;

class Game {
    Game() {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame() {
        System.out.println("BoardGame constructor");
    }
}

public class Chess extends BoardGame {
    Chess() {
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
