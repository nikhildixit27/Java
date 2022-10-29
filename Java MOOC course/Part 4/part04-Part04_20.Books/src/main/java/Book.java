/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Book {
    private String title;
    private int pg;
    private int py;

    public Book(String title, int pg, int py) {
        this.title = title;
        this.pg = pg;
        this.py = py;
    }

    public String getTitle() {
        return title;
    }

    public int getPg() {
        return pg;
    }

    public int getPy() {
        return py;
    }
    
    
}
