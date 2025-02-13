package com.github.zipcodewilmington.casino.games.Beetle;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.ArrayList;

public class BeetleGame implements GameInterface {
    private ArrayList<PlayerInterface> players = new ArrayList<PlayerInterface>();
    private Beetle game;
    private Boolean isRunning = false;
    private PlayerInterface player;
    public void add(PlayerInterface player){
        players.add(player);
    }

    /**
     * removes a player from the game
     * @param player the player to be removed from the game
     */
    public void remove(PlayerInterface player){
        players.remove(player);
    }

    /**
     * specifies how the game will run
     */
    public void run(){
        if(isRunning){

        }
    }

    /**
     * Calculate player's winning payout amount of bet x multiplier
     * @return (double) amount of money winnings
     */
    public Double calculateWinnings(Double betAmount){
        return 0.00;
    }

    /**
     * Subtract the bet amount from player's balance
     */
    public void subtractBetFromBalance(Double betAmount){

    }


    /**
     * Add winnings amount to player's balance
     */
    public void addMoneyToBalance(PlayerInterface Player, Double winnings){

    }

    public void initGame(){
        this.game = new Beetle(this.players.length);
    }



}
