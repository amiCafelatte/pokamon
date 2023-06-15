package bluecorner;

import java.util.Random;

import fighter.PokamonFire;

public class PokamonFireSample extends PokamonFire{
    /**
     * 攻撃力、防御力、HP、素早さ、クリティカルヒット率
     */
    public PokamonFireSample(){
        super(40,5,20,20,15);
    }

    @Override
    public String getName() {
        return "炎サンプル青";
    }
    
    @Override
    public boolean isSpecialAttack(int turn, int opHp, int opPow, int opDef) {
        Random r = new Random();

        if(r.nextInt(100) < 50){
            /**
             * 必殺技を使う
             */
            return true;
        }
        /**
         * 必殺技は使わない
         */
        return false;
    }

    @Override
    public int getAttackType(int turn, int opHp, int opPow, int opDef) {
        Random r = new Random();
        if(r.nextInt(100) < 50){
            /**
             * 全力ぎりのとき（　成功率40%
             */
            return FULLPOW_ATTACK;
        }
        return NORMAL_ATTACK;
    }
    
}
