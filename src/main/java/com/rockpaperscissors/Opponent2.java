package com.rockpaperscissors;

public class Opponent2 extends Player {
	protected String Opponent2 = "Dan";
    public Opponent2() {
        
    }
	@Override
	public void shoot(){ 
		// TODO Auto-generated method stub
	}

    public String getOpponent2() {
        return Opponent2;
    }

    public void setOpponent2(String opponent2) {
        Opponent2 = opponent2;
    }

    @Override
    public int handy() {
        
        int opponentThrow = 0 + (int)(Math.random() * ((4 - 0) + 1));
        return opponentThrow;
    }
	@Override
	public String namey() {
		// TODO Auto-generated method stub
		return null;
	}
}