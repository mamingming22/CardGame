package com.matel.Entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by matel on 2016/7/28 0028.
 */
public class Cards {
    public static List<Card> getCardList() {
        String[] color = {"黑桃", "红桃", "梅花", "方片"};
        List<Card> cardList = new ArrayList<>(52);
        for (int i = 2; i <= 10; i++) {
            String no = Integer.toString(i);
            for (int j = 0; j < color.length; j++) {
                Card card = new Card();
                card.setNo(no);
                card.setColor(color[j]);
                cardList.add(card);
            }
        }
            String[] no2 = {"J", "Q", "K","A"};
        for (int i = 0; i < no2.length; i++) {
            for (int j = 0; j < color.length; j++) {
                Card card = new Card();
                card.setNo(no2[i]);
                card.setColor(color[j]);
                cardList.add(card);
            }
        }

        //洗牌
        Collections.shuffle(cardList);
        return cardList;
    }
}
