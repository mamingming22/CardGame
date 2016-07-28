package com.matel;

import com.matel.Entities.Card;
import com.matel.Entities.Cards;
import com.matel.Entities.Player;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Card> cardList = Cards.getCardList();

    public static void main(String[] args) {
        // write your code here
        Player player1 = new Player("1", "matel");
        Player player2 = new Player("2", "xtz");

        Scanner scanner = new Scanner(System.in);
        System.out.println("玩家谁先手");
        String keyIn = scanner.next();
        testShowCardList();
        int i = 0;
        while (i < 52) {
            if (keyIn.equals("1")) {
                player1.setHandCard(Arrays.asList(cardList.get(i), cardList.get(i + 2)));
                player2.setHandCard(Arrays.asList(cardList.get(i + 1), cardList.get(i + 3)));
            } else {
                player2.setHandCard(Arrays.asList(cardList.get(i), cardList.get(i + 2)));
                player1.setHandCard(Arrays.asList(cardList.get(i + 1), cardList.get(i + 3)));
            }
            System.out.println(player1.getName() + " " + player1.getHandCard().toArray()[0] + " " + player1.getHandCard().toArray()[1]);
            System.out.println(player2.getName() + " " + player2.getHandCard().toArray()[0] + " " + player2.getHandCard().toArray()[1]);

            //各自找最大手牌
            List<Card> cad1 = player1.getHandCard();
            Collections.sort(cad1, new Comparable());
            List<Card> cad2 = player2.getHandCard();
            Collections.sort(cad2, new Comparable());

            //取各自的最大牌
            List<Card> lastList = Arrays.asList(cad1.get(1), cad2.get(1));
            Collections.sort(lastList, new Comparable());

            //谁赢谁先抽牌
            if (cad1.contains(lastList.get(1))) {
                System.out.println(player1.getName() + " win");
                keyIn="1";
            } else if (cad2.contains(lastList.get(1))) {
                System.out.println(player2.getName() + " win");
                keyIn="2";
            }else {
                System.out.println("error");
            }

            System.out.println();
            i += 4;
        }

    }

    private static void testShowCardList() {
        int i = 0;
        for (Card card :
                cardList) {
            i++;
            System.out.println(card.getNo() + " -- " + card.getColor() + "   NNOO" + i);
        }
    }

}
