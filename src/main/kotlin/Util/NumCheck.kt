package Util

import camp.nextstep.edu.missionutils.Randoms

object NumCheck {
    fun randomCheck() = 4 <= Randoms.pickNumberInRange(0,9)
}