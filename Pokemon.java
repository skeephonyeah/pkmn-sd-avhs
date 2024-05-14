import java.util.*;

public class Pokemon {
    private int level;
    private ArrayList<Move> moveset;
    private String status;
    private int type1;
    private int type2;
    private Data myData;

    public Pokemon(int level, ArrayList<Move> moveset, int currentHP, int maxHP, String status, int type1, int type2, Data d){
        this.level = level;
        this.moveset = moveset;
        this.status = status;
        this.type1 = type1;
        this.type2 = type2;
        myData = d;
    }
}
