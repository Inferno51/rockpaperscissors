package com.rockpaperscissors;

public class Opponent3 extends Player {
	protected String Opponent3 = "Ben";
    public Opponent3() {
        
    }
	@Override
	public void shoot(){ 
		// TODO Auto-generated method stub
	}

    public String getOpponent3() {
        return Opponent3;
    }

    public void setOpponent3(String opponent3) {
        Opponent3 = opponent3;
    }

    @Override
    public int handy() {
        
        int opponentThrow = 0 + (int)(Math.random() * ((3 - 0) + 1));
        return opponentThrow;
    }
	@Override
	public String namey() {
		// TODO Auto-generated method stub
		return null;
	}
}