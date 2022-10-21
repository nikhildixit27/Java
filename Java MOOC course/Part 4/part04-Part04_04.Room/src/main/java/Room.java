/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Room {
    private String code;
    private int seats;

    public Room(String code, int seat) {
        this.code = code;
        this.seats = seat;
    }

    @Override
    public String toString() {
        return "Room{" + "code=" + code + ", seat=" + seats + '}';
    }
}
