package cc.baka9.catseedtrade;


import cc.baka9.catseedtrade.jfep.Parser;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Test {
    //保留两位
    private static DecimalFormat doubleDf = new DecimalFormat("0.00");
    static Map<String, Double> member = new HashMap<>();

    public static void main(String[] args){
        System.out.println(UUID.randomUUID());
    }

}