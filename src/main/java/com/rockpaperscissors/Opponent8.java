package com.rockpaperscissors;

public class Opponent8 extends Player {
	protected String Opponent8 = "Mike";
    public Opponent8() {
        
    }
	@Override
	public void shoot(){ 
		// TODO Auto-generated method stub
	}

    public String getOpponent8() {
        return Opponent8;
    }

    public void setOpponent8(String opponent8) {
        Opponent8 = opponent8;
    }

    @Override
    public int handy() {
        
        int opponentThrow = 3 + (int)(Math.random() * ((1 - 0) + 1));
        return opponentThrow;
    }
	@Override
	public String namey() {
		// TODO Auto-generated method stub
		return null;
	}
}
