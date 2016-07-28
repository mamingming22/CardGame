package com.matel.Entities;

/**
 * Created by matel on 2016/7/28 0028.
 */
public class Card {
    private String No;
    private String Color;

    public Card() {
    }

    public Card(String no, String color) {
        this.No = no;
        this.Color = color;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (No != null ? !No.equals(card.No) : card.No != null) return false;
        return Color != null ? Color.equals(card.Color) : card.Color == null;

    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Card{" +
                "No='" + No + '\'' +
                ", Color='" + Color + '\'' +
                '}';

    }
}
