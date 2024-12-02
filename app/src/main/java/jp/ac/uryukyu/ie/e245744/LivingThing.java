package jp.ac.uryukyu.ie.e245744;

/**
 *  LivingThingクラス
 *  String name; //相手の名前
 *  int hitPoint; //相手のHP
 *  int attack; //相手の攻撃力
 *  boolean dead; //相手の生死状態。true=死亡。
 */

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    
     /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 自身の名前
     * @param maximumHP 自身のHP
     * @param attack 自身の攻撃力
     */
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public String getName(){
        return name;
    }

    public int getHitPoint() {
        return hitPoint; 
    }
    
    public int getAttack(){
        return attack;
    }

    public boolean isDead(){
        return dead;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }
    public void setName(int attack){
        this.attack = attack;
    }
    public void setDead(boolean dead){
        this.dead = dead;
    }

      /**
     * 相手へ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */
    public void attack(LivingThing opponent){
        if (this.dead){
            return;
        }
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
    }

     /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    protected void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
