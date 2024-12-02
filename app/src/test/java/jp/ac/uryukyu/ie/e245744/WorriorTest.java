package jp.ac.uryukyu.ie.e245744;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WorriorTest {
    /**
     * Warriorクラスからオブジェクトを生成し、
     * attackWithWeponSkillを3回実行し、
     * 3回ともattackの150%ダメージになっていることを確認する
     */
    @Test
    void attackWithWeponSkillTest(){
        Warrior demoWarrior = new Warrior("デモ戦士", 100, 30);
        Enemy slime = new Enemy("スライムもどき", 100, 30);
        int expectedDamage = (int)(30 * 1.5); //攻撃力30の150％
        int initialEnemyHp = slime.getHitPoint();
        demoWarrior.attackWithWeponSkill(slime);
        int actualDamage = initialEnemyHp - slime.getHitPoint(); //実際に与えたダメージ

        assertEquals(expectedDamage, actualDamage, "ダメージが正しいか確認");
    }
}
