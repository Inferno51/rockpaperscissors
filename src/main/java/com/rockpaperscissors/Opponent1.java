package com.rockpaperscissors;

public class Opponent1 extends Player {
	
	protected String Opponent1 = "Bob";
    public Opponent1() {
        
    }
	@Override
	public void shoot(){ 
		// TODO Auto-generated method stub
	}

    public String getOpponent1() {
        return Opponent1;
    }

    public void setOpponent1(String opponent1) {
        Opponent1 = opponent1;
    }

    @Override
    public int handy() {
        
        int opponentThrow = 1;
        return opponentThrow;
    }
	@Override
	public String namey() {
		// TODO Auto-generated method stub
		return null;
	}
}