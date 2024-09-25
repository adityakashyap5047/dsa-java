public class OopsInterface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){  //we make this method public because in the interface ChessPlayer move() method is public
        System.out.println("up, down, left, right, diagoal - (in all 4 direction)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){  //we make this method public because in the interface ChessPlayer move() method is public
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){  //we make this method public because in the interface ChessPlayer move() method is public
        System.out.println("up, down, left, right, diagoal - (by 1 step)");
    }
}