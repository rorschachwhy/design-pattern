package com.why.design.principle.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> dir = new HashMap<Integer, Integer>();

        Integer num = Integer.valueOf(br.readLine());

        for (int i = 0; i < num; i++) {
            String line = br.readLine();
            String[] sp = line.split(" ");

            Integer money = Integer.valueOf(sp[0]);
            Integer date = Integer.valueOf(sp[1]);

            Integer origin = dir.get(date);
            if (origin == null) {
                origin = 0;
            }

            if ( origin < money) {
                dir.put(date, money);
                money = origin;
            }

            if (money != 0) {
                int min = 0;
                int idx = 0;
                for (int m = date - 1; m > 0; m --) {
                    if(dir.get(m) == null) {
                        dir.put(m, money);
                        idx = 0;
                        break;
                    } else {
                        if (dir.get(m) < money) {
                            min = dir.get(m);
                            idx = m;
                        }
                    }
                }
                if (idx != 0) {
                    dir.put(idx, money);
                }
            }


        }
        System.out.println(dir.toString());

        int re = 0;
        for (Integer n : dir.values()) {
            re += n;
        }
        System.out.println(re);
    }
}
