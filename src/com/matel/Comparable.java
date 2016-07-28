package com.matel;

import com.matel.Entities.Card;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by matel on 2016/7/28 0028.
 */
public class Comparable implements Comparator<Card> {
    Map<String, Integer> valueMap = new HashMap<>();
    Map<String, Integer> colorMap = new HashMap<>();

    public Comparable() {
        int i;
        String[] no2 = {"J", "Q", "K", "A"};
        for (i = 2; i <= 10; i++) {

            valueMap.put(Integer.toString(i), i);
        }
        for (String temp :
                no2) {
            valueMap.put(temp, i);
            i++;
        }

        String[] color = {"黑桃", "红桃", "梅花", "方片"};
        for (int j = 0; j < color.length; j++) {
            colorMap.put(color[j], color.length - j);
        }
    }

    @Override
    public int compare(Card o1, Card o2) {
        if (valueMap.get(o1.getNo()) < valueMap.get(o2.getNo())) {
            return -1;
        } else if (valueMap.get(o1.getNo()) > valueMap.get(o2.getNo())) {
            return 1;
        } else {
            if (colorMap.get(o1.getColor()) < colorMap.get(o2.getColor())) {
                return -1;
            } else if (colorMap.get(o1.getColor()) > colorMap.get(o2.getColor())) {
                return 1;
            }
        }
        return 0;
    }
}
