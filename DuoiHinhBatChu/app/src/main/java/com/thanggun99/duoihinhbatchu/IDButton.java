package com.thanggun99.duoihinhbatchu;

/**
 * Created by Thanggun99 on 04/09/2016.
 */
public class IDButton {
    private int idAnwser, idPick;

    public IDButton(int idPick, int idAnwser) {
        this.idAnwser = idAnwser;
        this.idPick = idPick;
    }

    public int getIdPick() {
        return idPick;
    }

    public int getIdAnwser() {
        return idAnwser;
    }
}
