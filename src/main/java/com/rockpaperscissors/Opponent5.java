package com.rockpaperscissors;

public class Opponent5 extends Player {
	protected String Opponent5 = "David";
    public Opponent5() {
        
    }
	@Override
	public void shoot(){ 
		// TODO Auto-generated method stub
	}

    public String getOpponent5() {
        return Opponent5;
    }

    public void setOpponent5(String opponent5) {
        Opponent5 = opponent5;
    }

    @Override
    public int handy() {
        
        int opponentThrow = 0 + (int)(Math.random() * ((1 - 0) + 1));
        return opponentThrow;
    }
	@Override
	public String namey() {
		// TODO Auto-generated method stub
		return null;
	}
}

