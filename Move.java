public class Move {
    private String name;
    private double accuracy;
    private int pp;
    private int power;
    private boolean hasEffect;
    private int type;

    public Move(String n, double a, int p, int pow, boolean eff, int t) {
        name = n;
        accuracy = a;
        pp = p;
        power = pow;
        hasEffect = eff;
        type = t;
    }

    public String getName() {
        return name;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public int getPP() {
        return pp;
    }

    public int getPower() {
        return power;
    }

    public boolean getEffect() {
        return hasEffect;
    }

    public int getType() {
        return type;
    }
}
