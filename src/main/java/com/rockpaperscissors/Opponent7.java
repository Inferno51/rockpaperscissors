package com.rockpaperscissors;

public class Opponent7 extends Player {
	protected String Opponent7 = "John";
    public Opponent7() {
        
    }
	@Override
	public void shoot(){ 
		// TODO Auto-generated method stub
	}

    public String getOpponent7() {
        return Opponent7;
    }

    public void setOpponent7(String opponent7) {
        Opponent7 = opponent7;
    }

    @Override
    public int handy() {
        
        int opponentThrow = 2 + (int)(Math.random() * ((2 - 0) + 1));
        return opponentThrow;
    }
	@Override
	public String namey() {
		// TODO Auto-generated method stub
		return null;
	}
}
