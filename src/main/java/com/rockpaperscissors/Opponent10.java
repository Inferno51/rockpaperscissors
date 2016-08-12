package com.rockpaperscissors;

public class Opponent10 extends Player {
	protected String Opponent10 = "George";
    public Opponent10() {
        
    }
	@Override
	public void shoot(){ 
		// TODO Auto-generated method stub
	}

    public String getOpponent10() {
        return Opponent10;
    }

    public void setOpponent2(String opponent10) {
        Opponent10 = opponent10;
    }

    @Override
    public int handy() {
        
        int opponentThrow = 3;
        return opponentThrow;
    }
	@Override
	public String namey() {
		// TODO Auto-generated method stub
		return null;
	}
}
