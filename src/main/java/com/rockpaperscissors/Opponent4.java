package com.rockpaperscissors;

public class Opponent4 extends Player {
	protected String Opponent4 = "Zach";
    public Opponent4() {
        
    }
	@Override
	public void shoot(){ 
		// TODO Auto-generated method stub
	}

    public String getOpponent4() {
        return Opponent4;
    }

    public void setOpponent4(String opponent4) {
        Opponent4 = opponent4;
    }

    @Override
    public int handy() {
        
        int opponentThrow = 0 + (int)(Math.random() * ((2 - 0) + 1));
        return opponentThrow;
    }
	@Override
	public String namey() {
		// TODO Auto-generated method stub
		return null;
	}
}
