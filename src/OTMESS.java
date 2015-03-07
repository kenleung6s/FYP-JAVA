// OTMESS.java - Wrapper for Oblivious Transfer messages.

//package SFE.BOAL;

import java.io.*;

import java.math.*;


class OTMESS implements Serializable {
    BigInteger[] num;

    public OTMESS() {
    }

    public OTMESS(BigInteger inp_num) {
        num = new BigInteger[1];
        num[0] = inp_num;
    }

    public OTMESS(BigInteger[] inp_nums) {
        num = new BigInteger[inp_nums.length];

        for (int i = 0; i < inp_nums.length; i++)
            num[i] = inp_nums[i];
    }
}
