package Util

import Constant.ConstantNumbers.FORWARD_MIN_NUMBER
import Constant.ConstantNumbers.RANDOM_MAX_NUMBER
import Constant.ConstantNumbers.RANDOM_MIN_NUMBER
import camp.nextstep.edu.missionutils.Randoms

object NumCheck {
    fun randomCheck() = FORWARD_MIN_NUMBER <= Randoms.pickNumberInRange(RANDOM_MIN_NUMBER , RANDOM_MAX_NUMBER)
}