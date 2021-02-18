package com.why.design.principle.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> dir = new HashMap<String, String>();

        String line = br.readLine();

        while(!"".equals(line)) {
            String[] sp = line.split(" ");
            dir.put(sp[1], sp[0]);
            line = br.readLine();
        }

//        System.out.println(dir.toString());

        line = br.readLine();
        while(!"".equals(line)) {
            String trans = dir.get(line);
            if ( trans != null) {
                System.out.println(trans);
            } else {
                System.out.println("eh");
            }
            line = br.readLine();
        }

    }
}
