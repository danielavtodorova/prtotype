package com.prototype.model;

public class Betslip {

	private double stake;

	private String betSlipId;
	private String customerIpAddress;
	private long betSlipType;

	private long conclusionDate;

	public Betslip() {
	}

	public double getStake() {
		return stake;
	}

	public void setStake(double stake) {
		this.stake = stake;
	}

	public String getBetSlipId() {
		return betSlipId;
	}

	public void setBetSlipId(String betSlipId) {
		this.betSlipId = betSlipId;
	}

	public long getBetSlipType() {
		return betSlipType;
	}

	public void setBetSlipType(long betSlipType) {
		this.betSlipType = betSlipType;
	}

	public long getConclusionDate() {
		return conclusionDate;
	}

	public void setConclusionDate(long conclusionDate) {
		this.conclusionDate = conclusionDate;
	}

	public void setCustomerIpAddress(String customerIpAddress) {
		this.customerIpAddress = customerIpAddress;
	}

	public String getCustomerIpAddress() {
		return customerIpAddress;
	}

}
