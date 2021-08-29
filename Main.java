public class Main {
    public static void main (String[] args) {
       Warrior w1 = new Warrior ("Code1", "Tanis");
       Warrior w2 = new Warrior ("Code2", "Aragorn", 10, 20000, 100, 15, 15);

       Burglar b1 = new Burglar ("Code3", "Bilbo");
       Burglar b2 = new Burglar ("Code4", "Tasslehoff", 10, 20000, 100, 15);

       Wizard wiz1 = new Wizard ("Code5", "Raistlin");
       Wizard wiz2 = new Wizard ("Code6", "Gandalf", 10, 20000, 100, 15, 100);

       w1.gainXP(2000);
       w2.gainXP(2000);
       b1.gainXP(2000);
       b2.gainXP(2000);
       wiz1.gainXP(2000);
       wiz2.gainXP(2000);

       System.out.println(w1);
       System.out.println(w2);
       System.out.println(b1);
       System.out.println(b2);
       System.out.println(wiz1);
       System.out.println(wiz2);

       System.out.println("Tanis is attacking enemy with DP 5");
       w1.attack(10);
       System.out.println("Aragorn is attacking enemy with DP 5");
       w2.attack(10);

       System.out.println("Bilbo is trying to disable a trap of difficulty 5");
       b1.disableTrap(5);
       System.out.println("Tasslehoff is trying to disable a trap of difficulty 5");
       b2.disableTrap(5);

       System.out.println(b1);
       System.out.println(b2);

       System.out.println("Raistlin is trying to cast a spell of difficulty 10 with a cost of 1000");
       wiz1.castSpell(10, 1000);
       System.out.println("Raistlin is trying to cast a spell of difficulty 5 with a cost of 10");
       wiz1.castSpell(5, 10);
       System.out.println("Gandalf is trying to cast a spell of difficulty 5 with a cost of 10");
       wiz2.castSpell(5, 10);

       System.out.println(wiz1);
       System.out.println(wiz2);
    }
}