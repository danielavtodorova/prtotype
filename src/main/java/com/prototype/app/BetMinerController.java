//package com.prototype.app;
//
//
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Random;
//import java.util.UUID;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.prototype.model.Bet;
//import com.prototype.model.Betslip;
//import com.prototype.model.BetslipWithBets;
//
//@RestController
//public class BetMinerController  {
//    
//    private static final Logger log = LoggerFactory.getLogger(BetMinerController.class);
//    
//    private static final int DEFAULT_PAGESIZE = 500;
//    
//    @MessageMapping("/websocket")
//    //@SendTo("/topic/slipstream")
//    public BetslipWithBets mineBets() throws Exception {
//        Thread.sleep(100); // simulated delay
//        return generateRandomBetSlips();
//    }
//    
//    private BetslipWithBets generateRandomBetSlips() {
//    	
//    	Betslip slip = new Betslip();
//    	slip.setStake(50);
//    	slip.setBetSlipId(UUID.randomUUID().toString());
//    	
//    	List <Bet> randomBets = new ArrayList<>();
//    	
//    	int howManyBetsInSlip = getRandomVal(1,20);
//    	
//    	for(int i=0;i<howManyBetsInSlip;i++) {
//    		
//    		Bet bet = new Bet();
//    	
//    		bet.setBanker(false);
//    		bet.setBetSlipId(slip.getBetSlipId());
//    		bet.setBetId(UUID.randomUUID().toString());
//    		bet.setChannel("WC");
//    		bet.setMarketId(29L);
//    		bet.setEventId(5L);
//    		bet.setMarketName("Random market name");
//    		bet.setEventName("Random Event");
//    		bet.setSportName("Soccer");
//    		bet.setComboWinFactor(Double.valueOf(getRandomVal(1,2)));
//    		bet.setStake(Double.valueOf(getRandomVal(1,100)));
//    		bet.setComboStakeFactor(Double.valueOf(getRandomVal(1,5)));
//    		bet.setConclusionDate(new Date().getTime());
//    		randomBets.add(bet);
//    	}
//    
//    	BetslipWithBets betslipWithBets = new BetslipWithBets();
//    	betslipWithBets.setBets(randomBets);
//    	betslipWithBets.setSlip(slip);
//    	
//    	return betslipWithBets;
//    }
//    
//    private int getRandomVal(int min, int max) {
//    	Random random = new Random();
//    	int randomNumber = random.nextInt(max + 1 - min) + min;
//    	return randomNumber;
//    }
//    
//  
//}
