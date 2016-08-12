package com.rockpaperscissors;

public class Opponent9 extends Player {
	protected String Opponent9 = "Steve";
    public Opponent9() {
        
    }
	@Override
	public void shoot(){ 
		// TODO Auto-generated method stub
	}

    public String getOpponent9() {
        return Opponent9;
    }

    public void setOpponent9(String opponent9) {
        Opponent9 = opponent9;
    }

    @Override
    public int handy() {
        
        int opponentThrow = 2;
        return opponentThrow;
    }
	@Override
	public String namey() {
		// TODO Auto-generated method stub
		return null;
	}
}
