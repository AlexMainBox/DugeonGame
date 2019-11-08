package entities;

import model.Player;
import utils.Chooser;
import utils.WarriorSkillsMenu;

public class Warrior extends Player {
    private int rage;

    public Warrior(String name) {
        super(name);
    }

    @Override
    public int hit() {                                            //hit generate chance critical damage.If chance not dropped , hi return standard damage, mines enemy armory;
        int randomDamageBonus = (int) (Math.random() * 4);
        int damageCount;
        if (randomDamageBonus == 2) {
            rage += 2;
            damageCount = (getDamage() * 2);
            System.out.println("Your Critical Damage  - " + damageCount);
            return damageCount;
        } else
            rage += 1;
        damageCount = getDamage();
        System.out.println("Your damage - " + damageCount);
        return damageCount;
    }

    private int specialAttack() {
        if (rage >= 3) {
            rage -= 3;
            int spAttack;
            spAttack = hit() + (getDamage());
            System.out.println(getName() + ": Special attack damage - " + spAttack);
            return spAttack;
        }
        System.out.println("You did not have enough rage, your attack becomes standard");
        return hit();
    }

    @Override
    public int skillChooser() {
        System.out.println("");
        WarriorSkillsMenu.showSkills();
        int skill = Chooser.choose();
        switch (skill) {
            case 1:
                skill = hit();
                System.out.println("Your - rage = " + rage);
                break;
            case 2:
                skill = specialAttack();
                System.out.println("Your - rage = " + rage);
                break;
        }
        return skill;
    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }

    @Override
    public String toString() {
        return "Warrior - " +
                super.toString();
    }
}
