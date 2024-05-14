import java.util.*;

public class Data {
    private int currentHP;
    private int maxHP;
    private int attack;
    private int baseAttack;
    private int attackStage;
    private int defense;
    private int baseDefense;
    private int defenseStage;
    private int special;
    private int baseSpecial;
    private int specialStage;
    private int speed;
    private int baseSpeed;
    private int speedStage;

    public Data (int currentHP, int maxHP, int attack, int baseAttack, int attackStage, int defense, int baseDefense, int defenseStage, int special, int baseSpecial, int specStage, int speed, int baseSpeed, int speStage){
        this.currentHP = currentHP;
        this.maxHP = maxHP;
        this.attack = attack;
        this.baseAttack = baseAttack;
        this.attackStage = attackStage;
        this.defense = defense;
        this.baseDefense = baseDefense;
        this.defenseStage = defenseStage;
        this.special = special;
        this.baseSpecial = baseSpecial;
        this.specialStage = specStage;
        this.speed = speed;
        this.baseSpeed = baseSpeed;
        this.speedStage = speStage;
        
    }
    
    public int getcurrentHP() {
        return currentHP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getAttack() {
        return attack;
    }

    public int getAttackStage() {
        return attackStage;
    }
    
    public int getDefense() {
        return defense;
    }

    public int getDefenseStage() {
        return defenseStage;
    }    
    
    public int getSpecial() {
        return special;
    }

    public int getSpecialStage() {
        return specialStage;
    }    
    
    public int getSpeed() {
        return speed;
    }

    public int getSpeedStage() {
        return maxHP;
    }    
    
    public void heal(int amt) {
        currentHP = Math.max(currentHP + amt, maxHP);
    }

    public void adjustAttack(int stage) {
        if (stage > 0) {
            if (stage + attackStage > 6) {
                attackStage = 6;
                attack = baseAttack * 4;
            } else {
                attackStage += stage;
                attack = (int) (baseAttack * (attackStage * 0.5 + 1));
            }
        } else if (stage < 0) {
            if (stage + attackStage < -6) {
                attackStage = -6;
                attack = baseAttack / 4;
            } else {
                attackStage += stage;
                attack = (int) (baseAttack / (attackStage * 0.5 + 1));
            }            
        }
    }
    
    public void adjustDefense(int stage) {
        if (stage > 0) {
            if (stage + defenseStage > 6) {
                defenseStage = 6;
                defense = baseDefense * 4;
            } else {
                defenseStage += stage;
                defense = (int) (baseDefense * (defenseStage * 0.5 + 1));
            }
        } else if (stage < 0) {
            if (stage + defenseStage < -6) {
                defenseStage = 6;
                defense = baseDefense / 4;
            } else {
                defenseStage += stage;
                defense = (int) (baseDefense / (defenseStage * 0.5 + 1));
            }            
        }
    }

    public void adjustSpecial(int stage) {
        if (stage > 0) {
            if (stage + specialStage > 6) {
                specialStage = 6;
                special = baseSpecial * 4;
            } else {
                specialStage += stage;
                attack = (int) (baseSpecial * (specialStage * 0.5 + 1));
            }
        } else if (stage < 0) {
            if (stage + specialStage < -6) {
                specialStage = 6;
                special = baseSpecial / 4;
            } else {
                specialStage += stage;
                special = (int) (baseSpecial / (specialStage * 0.5 + 1));
            }            
        }
    }

    public void adjustSpeed(int stage) {
        if (stage > 0) {
            if (stage + speedStage > 6) {
                speedStage = 6;
                speed = baseSpeed * 4;
            } else {
                speedStage += stage;
                speed = (int) (baseSpeed * (speedStage * 0.5 + 1));
            }
        } else if (stage < 0) {
            if (stage + speedStage < -6) {
                speedStage = -6;
                speed = baseSpeed / 4;
            } else {
                speedStage += stage;
                speed = (int) (baseSpeed / (speedStage * 0.5 + 1));
            }            
        }
    }
}
