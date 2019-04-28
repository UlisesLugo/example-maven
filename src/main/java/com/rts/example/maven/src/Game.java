/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rts.example.maven.src;

/**
 *
 * @author ulise
 */
public class Game {
    public static void main(String args[]){
        System.out.println("Running");
        String dbUrl = System.getenv("DATABASE_URL");
        System.out.println(dbUrl);
    }
}
