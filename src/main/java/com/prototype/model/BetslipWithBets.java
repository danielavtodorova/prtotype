package com.prototype.model;

import java.util.ArrayList;
import java.util.List;

public class BetslipWithBets {

    public Betslip slip;
    public List<Bet> bets = new ArrayList<Bet>();
    
    public BetslipWithBets() {}

    public BetslipWithBets(Betslip slip, List<Bet> bets) {
        this.slip = slip;
        bets.addAll(bets);
    }

    public Betslip getSlip() {
        return slip;
    }

    public List<Bet> getBets() {
        return bets;
    }
    
    public void setBets(List<Bet> bets) {
		this.bets = bets;
	}
    
    public void setSlip(Betslip slip) {
		this.slip = slip;
	}

  }
