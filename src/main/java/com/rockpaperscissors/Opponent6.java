package com.rockpaperscissors;

public class Opponent6 extends Player {
	protected String Opponent6 = "Balthazar";
    public Opponent6() {
        
    }
	@Override
	public void shoot(){ 
		// TODO Auto-generated method stub
	}

    public String getOpponent6() {
        return Opponent6;
    }

    public void setOpponent6(String opponent6) {
        Opponent6 = opponent6;
    }

    @Override
    public int handy() {
        
        int opponentThrow = 1 + (int)(Math.random() * ((3 - 0) + 1));
        return opponentThrow;
    }
	@Override
	public String namey() {
		// TODO Auto-generated method stub
		return null;
	}
}
