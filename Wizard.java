public class Wizard extends Player{
    private int mp; // Poder magic del personatge
    private int MPoints; // Punts de magia del personatge
    private int availableMPoints; // Punts de magia disponibles del personatge
    private static final int baseMp = 1;
    private static final int BaseMPoints = 10;
    
    Wizard(String playerName, String characterName){
        super(playerName, characterName);
        this.mp = 1;
        this.MPoints = 10;
        this.availableMPoints = 10;
    }
    
    Wizard(String playerName, String characterName, int level, int hp, int xp, int mp, int MPoints){
        super(playerName, characterName, level, hp, xp);
        this.mp = mp;
        this.MPoints = MPoints;
        this.availableMPoints = MPoints;
    }
    
    public int getMp(){
        return mp;
    }
    public void setMp(int mp){
        this.mp = mp;
    }
    public int getMPoints(){
        return MPoints;
    }
    public void setMPoints(int MPoints){
        this.MPoints = MPoints;
    }
    public int getAvailableMPoints(){
        return availableMPoints;
    }
    public void setAvailableMPoints(int availableMPoints){
        this.availableMPoints = availableMPoints;
    }
    
    public void gainXP(int value){
        setXp(getXp()+value);
        if(getLevel()*getXp()>getLevel()*1000*(getLevel()/2)){
            setLevel(getLevel()+1);
            setMp(getMp()+1);
            setMPoints(getMPoints()+5);
            setHp(getHp()+5);
            setAvailableMPoints(getMPoints());
        }
    }
    
    public boolean castSpell(int spellDifficulty, int spellCost){
        if(getAvailableMPoints()>=spellCost){
            if(getMp()>spellDifficulty*2){
                System.out.println("Spell casting succeeded");
                return true;
            }
            else{
                System.out.println("Spell casting failed");
                return false;
            }
        }
        else{
            System.out.println("Not enough magical energy");
            return false;
        }
    }
    
    public String rest (int time){
        if(time>=12){
            setAvailableMPoints(getMPoints());
        }
        else{
            if(getMPoints()>getAvailableMPoints()+(getMPoints()/2)){
                setAvailableMPoints(getMPoints());
            }
            else{
                setAvailableMPoints(getAvailableMPoints()+(getMPoints()/2));
            }
        }
        return "Resting";
    }
    
    
    public String toString(){
        String s = new StringBuilder()
            .append(super.toString())
            .append("Character type: Wizard" + "\n")
           .append("Magical Power: " + getMp() + "\n")
           .append("Maximum Magical Points: " + getMPoints() + "\n")
           .append("Available Magical Points: " + getAvailableMPoints())
           .toString();
        return s;
    }
}