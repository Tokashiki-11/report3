package jp.ac.uryukyu.ie.e245744;

public class Warrior extends LivingThing{
    public Warrior(String name, int hitPoint, int attack){
        super(name, hitPoint, attack); //LivingThingクラスのコンストラクタを呼び出し
    }

    /**
     * 武器スキルを使った攻撃
     * @param opponent 攻撃対象
    */
    public void attackWithWeponSkill(LivingThing opponent){
        if(!isDead()){
            int damage = (int)(getAttack() * 1.5); //攻撃力の攻撃力の1.5倍
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", getName(), opponent.getName(), damage);
            opponent.wounded(damage); //敵にダメージを与える
        }
    }
}
