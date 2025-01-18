
package Battle_Engine;

import Database.*;

public class StatsCalc {
   
    static int calc_hp(int hp,int LEVEL) {
        int HP = (2 * hp * LEVEL / 100) + LEVEL + 10;
        return HP;
    }

    static int calc(int stat,int LEVEL) {
        int stat_f = (2 * stat * LEVEL / 100) + 5;
        return stat_f;
    }

}