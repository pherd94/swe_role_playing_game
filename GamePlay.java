public class GamePlay
{
    public static void main(String[] args)
    {
        GameCharacter player, monster;

        player = new GameCharacter("Foobar the Warrior");
        player.setHealthPoint(100);
        //player.healthPoint = 100;
        player.setStrength(50);
        //player.strength = 50;

        monster = new GameCharacter("Slime the Great", 200, 10);
        //monster.setHealthPoint(30);
        //monster.setStrength(10);

        System.out.println("###############");
        System.out.println("### Game starts");
        System.out.println("###############");
        System.out.println();

        int round = 1;
        System.out.println("### Round " + round);

        player.printStatus();
        System.out.println();
        monster.printStatus();
        System.out.println();

        /* player attacks monster */
        System.out.println("# player attacks monster");
        player.attack(monster);
        monster.printStatus();
        System.out.println();

        /* monster attacks player */
        System.out.println("# monster attacks player");
        monster.attack(player);
        player.printStatus();
        System.out.println();

    }
}
