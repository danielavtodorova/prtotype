package com.prototype.model;

import java.util.List;

public class Bet {

	private String betId;

	private Long updatedAt;

	private Double liability;

	private Double stake;

	private String betSlipId;
	private Double odds;

	private Long conclusionDate;

	private Long fixtureStartDate;
	private String fixtureType;

	private Boolean banker;
	private Boolean live;
	private Long betSlipType;
	private Integer pot;

	private Integer labelId;
	private String labelName;

	private Long sportId;
	private String sportName;

	private Long regionId;
	private String regionName;

	private Long leagueId;
	private String leagueName;

	private Long fixtureGroupId;
	private String fixtureGroupName;

	private Long eventId;
	private String eventName;

	private Long marketId;
	private String marketName;

	private List<Number> fixtureParticipantIds;

	private Long selectionId;

	private Long optionId;

	private String pickName;

	private Integer customerId;

	private String customerName;

	private String customerCountry;

	private String responsibleBookie;

	private String tradingType;

	private Double singleWinFactor;

	private Double singleStakeFactor;

	private Double comboWinFactor;

	private Double comboStakeFactor;

	private String channel;

	private String subChannel;

	private String customerIpAddress;

	private Boolean rejected;

	private Boolean startingPrice;
	private String betType;

	private List<String> rejectReasons;

	private List<String> betslipTags;

	private List<String> customerTags;

	public Bet() {
	}

	public long getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Long updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Double getLiability() {
		return liability;
	}

	public void setLiability(Double liability) {
		this.liability = liability;
	}

	public Double getStake() {
		return stake;
	}

	public void setStake(Double stake) {
		this.stake = stake;
	}

	public Long getSelectionId() {
		return selectionId;
	}

	public void setSelectionId(Long selectionId) {
		this.selectionId = selectionId;
	}

	public List<Number> getFixtureParticipantIds() {
		return fixtureParticipantIds;
	}

	public void setFixtureParticipantIds(List<Number> fixtureParticipantIds) {
		this.fixtureParticipantIds = fixtureParticipantIds;
	}

	public Long getOptionId() {
		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	public long getMarketId() {
		return marketId;
	}

	public void setMarketId(Long marketId) {
		this.marketId = marketId;
	}

	public String getBetSlipId() {
		return betSlipId;
	}

	public void setBetSlipId(String betSlipId) {
		this.betSlipId = betSlipId;
	}

	public Double getOdds() {
		return odds;
	}

	public void setOdds(Double odds) {
		this.odds = odds;
	}

	public long getConclusionDate() {
		return conclusionDate;
	}

	public void setConclusionDate(Long conclusionDate) {
		this.conclusionDate = conclusionDate;
	}

	public long getBetSlipType() {
		return betSlipType;
	}

	public void setBetSlipType(Long betSlipType) {
		this.betSlipType = betSlipType;
	}

	public String getBetId() {
		return betId;
	}

	public void setBetId(String betId) {
		this.betId = betId;
	}

	public boolean isLive() {
		return live;
	}

	public void setLive(Boolean live) {
		this.live = live;
	}

	public boolean isBanker() {
		return banker;
	}

	public void setBanker(Boolean banker) {
		this.banker = banker;
	}

	public int getPot() {
		return pot;
	}

	public void setPot(Integer pot) {
		this.pot = pot;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public long getSportId() {
		return sportId;
	}

	public void setSportId(Long sportId) {
		this.sportId = sportId;
	}

	public long getLabelId() {
		return labelId;
	}

	public void setLabelId(Integer labelId) {
		this.labelId = labelId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCountry() {
		return customerCountry;
	}

	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	public void setCustomerIpAddress(String customerIpAddress) {
		this.customerIpAddress = customerIpAddress;
	}

	public String getCustomerIpAddress() {
		return customerIpAddress;
	}

	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public long getRegionId() {
		return regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public long getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(Long leagueId) {
		this.leagueId = leagueId;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public String getPickName() {
		return pickName;
	}

	public void setPickName(String pickName) {
		this.pickName = pickName;
	}

	public String getResponsibleBookie() {
		return responsibleBookie;
	}

	public void setResponsibleBookie(String responsibleBookie) {
		this.responsibleBookie = responsibleBookie;
	}

	public String getTradingType() {
		return tradingType;
	}

	public void setTradingType(String tradingType) {
		this.tradingType = tradingType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Double getSingleWinFactor() {
		return singleWinFactor;
	}

	public void setSingleWinFactor(Double singleWinFactor) {
		this.singleWinFactor = singleWinFactor;
	}

	public Double getSingleStakeFactor() {
		return singleStakeFactor;
	}

	public void setSingleStakeFactor(Double singleStakeFactor) {
		this.singleStakeFactor = singleStakeFactor;
	}

	public Double getComboWinFactor() {
		return comboWinFactor;
	}

	public void setComboWinFactor(Double comboWinFactor) {
		this.comboWinFactor = comboWinFactor;
	}

	public Double getComboStakeFactor() {
		return comboStakeFactor;
	}

	public void setComboStakeFactor(Double comboStakeFactor) {
		this.comboStakeFactor = comboStakeFactor;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getSubChannel() {
		return subChannel;
	}

	public void setSubChannel(String subChannel) {
		this.subChannel = subChannel;
	}

	public List<String> getRejectReasons() {
		return rejectReasons;
	}

	public void setRejectReasons(List<String> rejectReasons) {
		this.rejectReasons = rejectReasons;
	}

	public Boolean getRejected() {
		return rejected;
	}

	public void setRejected(Boolean rejected) {
		this.rejected = rejected;
	}

	public List<String> getCustomerTags() {
		return customerTags;
	}

	public void setCustomerTags(List<String> customerTags) {
		this.customerTags = customerTags;
	}

	public Boolean isStartingPrice() {
		return startingPrice;
	}

	public void setStartingPrice(Boolean startingPrice) {
		this.startingPrice = startingPrice;
	}

	public String getBetType() {
		return betType;
	}

	public void setBetType(String betType) {
		this.betType = betType;
	}

	public Long getFixtureStartDate() {
		return fixtureStartDate;
	}

	public void setFixtureStartDate(Long fixtureStartDate) {
		this.fixtureStartDate = fixtureStartDate;
	}

	public String getFixtureType() {
		return fixtureType;
	}

	public void setFixtureType(String fixtureType) {
		this.fixtureType = fixtureType;
	}

	public Long getFixtureGroupId() {
		return fixtureGroupId;
	}

	public void setFixtureGroupId(Long fixtureGroupId) {
		this.fixtureGroupId = fixtureGroupId;
	}

	public String getFixtureGroupName() {
		return fixtureGroupName;
	}

	public void setFixtureGroupName(String fixtureGroupName) {
		this.fixtureGroupName = fixtureGroupName;
	}

	public List<String> getBetslipTags() {
		return betslipTags;
	}

	public void setBetslipTags(List<String> betslipTags) {
		this.betslipTags = betslipTags;
	}

}
