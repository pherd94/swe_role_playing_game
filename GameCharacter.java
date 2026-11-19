public class GameCharacter
{
    /* data: instance variables */
    private String name;
    private int healthPoint;
    private int strength;

    /* Constructors */
    public GameCharacter(String characterName)
    {
        name = characterName;
        healthPoint = 50;
        strength = 50;
    }

    public GameCharacter(String characterName, int initHp, int initStr)
    {
        name = characterName;   // setName(chracterName);
        healthPoint = initHp;   // setHealthPoint(initHp);
        strength = initStr;     // setStrength(initStr);
    }

    /* Methods */

    public void printStatus()
    {
        System.out.println("Name: " + name);
        System.out.println("HP: " + healthPoint);
        System.out.println("Strength: " + strength);
    }

    /* atack() method */

    public void attack(GameCharacter enemy)
    {
        int damage = strength;
        
        /* getting hp of the enemy */
        int enemyHp = enemy.getHealthPoint();
        int updateHp = enemyHp - damage;

        enemy.setHealthPoint(updateHp);
    }

    public boolean isDead()
    {
        return healthPoint <= 0;
    }

    /* private int generateAttackHitPoint() */


    /* getters and setters */
    
    public String getName()
    {
        return name;
    }

    public void setName(String updateName)
    {
        name = updateName;
    }

    public int getHealthPoint()
    {
        return healthPoint;
    }

    public void setHealthPoint(int updateHealthPoint)
    {
        healthPoint = updateHealthPoint;
    }

    public int getStrength()
    {
        return strength;
    }

    public void setStrength(int updateStrength)
    {
        strength = updateStrength;
    }
}
