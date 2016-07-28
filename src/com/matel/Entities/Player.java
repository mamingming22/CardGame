package com.matel.Entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matel on 2016/7/28 0028.
 */
public class Player {
    private String ID;
    private String name;
    private List<Card> handCard;

    public List<Card> getHandCard() {
        return handCard;
    }

    public void setHandCard(List<Card> handCard) {
        this.handCard = handCard;
    }

    public Player() {

        handCard = new ArrayList<>(2);
    }

    public Player(String ID, String name) {
        this.ID = ID;
        this.name = name;
        handCard = new ArrayList<>(2);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
