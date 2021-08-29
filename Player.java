public abstract class Player {
    protected String playerName;
    protected String characterName;
    protected int level;
    protected int xp;
    protected int hp;
    private static final int baseXp = 0;
    private static final int baseLevel = 1;
    private static final int baseHp = 100;
    
    Player(String playerName, String characterName){
        this.playerName = playerName;
        this.characterName = characterName;
        this.level = 1;
        this.xp = 0;
        this.hp = 100;
    }
    
    Player(String playerName, String characterName, int level, int xp, int hp){
        this.playerName = playerName;
        this.characterName = characterName;
        this.level = level;
        this.xp = xp;
        this.hp = hp;
    }
    
    public String getPlayerName(){
        return playerName;
    }
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    public String getCharacterName(){
        return characterName;
    }
    public void setCharacterName(String characterName){
        this.characterName = characterName;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public int getXp(){
        return xp;
    }
    public void setXp(int xp){
        this.xp = xp;
    }
    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    
    public abstract void gainXP(int value);
    
    public String toString(){
        String s = new StringBuilder()
           .append("Player Name: " + getPlayerName() + "\n")
           .append("Character Name: " + getCharacterName() + "\n")
           .append("Character Level: " + getLevel() + "\n")
           .append("Character XP: " + getXp() + "\n")
           .append("Character HP: " + getHp() + "\n")
           .toString();
        return s;
    }
    
}