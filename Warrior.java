public class Warrior extends Player{
    private int cp; // Poder de combat del personatge
    private int dp; // Defensa del personatge
    private static final int baseCp = 1;
    private static final int baseDp = 1;
    
    Warrior(String playerName, String characterName){
        super(playerName, characterName);
        this.cp = 1;
        this.dp = 1;
    }
    
    Warrior(String playerName, String characterName, int level, int hp, int xp, int cp, int dp){
        super(playerName, characterName, level, hp, xp);
        this.cp = cp;
        this.dp = dp;
    }
    
    public int getCp(){
        return cp;
    }
    public void setCp(int cp){
        this.cp = cp;
    }
    public int getDp(){
        return dp;
    }
    public void setDp(int dp){
        this.dp = dp;
    }
    
    public void gainXP(int value){
        setXp(getXp()+value);
        if(getLevel()*getXp()>getLevel()*1000*(getLevel()/4)){
            setLevel(getLevel()+1);
            setCp(getCp()+1);
            setDp(getDp()+1);
            setHp(getHp()+10);
        }
    }
    
    public boolean attack(int enemyDP){
        if(getDp()>enemyDP*2){
            System.out.println("Attack succeed");
            return true;
        }
        else{
            System.out.println("Attack failed");
            return false;
        }
    }
    
    public String toString(){
        String s = new StringBuilder()
            .append(super.toString())
           .append("Character type: Warrior" + "\n")
           .append("Combat Power: " + getCp() + "\n")
           .append("Combat Defense: " + getDp())
           .toString();
        return s;
    }
}