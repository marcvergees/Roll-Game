public class Burglar extends Player{
    private int ap; // Agilitat del personatge
    private static final int baseAp = 1;
    
    Burglar(String playerName, String characterName){
        super(playerName, characterName);
        this.ap = 1;
    }
    
    Burglar(String playerName, String characterName, int level, int hp, int xp, int ap){
        super(playerName, characterName, level, hp, xp);
        this.ap = ap;
    }
    
    public int getAp(){
        return ap;
    }
    public void setAp(int ap){
        this.ap = ap;
    }
    
    public void gainXP(int value){
        setXp(getXp()+value);
        if(getLevel()*getXp()>getLevel()*1000){
            setLevel(getLevel()+1);
            setAp(getAp()+1);
            setHp(getHp()+8);
        }
    }
    
    public boolean disableTrap(int trapDifficulty){
        if(getLevel()*getAp()>trapDifficulty){
            System.out.println("Trap disabled");
            return true;
        }
        else{
            System.out.println("Trap activated");
            setHp(getHp()-10);
            return false;
        }
    }
    
    public String toString(){
        String s = new StringBuilder()
            .append(super.toString())
           .append("Character type: Burglar" + "\n")
           .append("Agility Power: " + getAp())
           .toString();
        return s;
    }
}