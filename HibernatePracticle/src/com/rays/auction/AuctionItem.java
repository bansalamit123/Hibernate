package com.rays.auction;

import java.util.Set;

public class AuctionItem {
	
	private int id;
	private Set bids;
	private String descripction;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set getBids() {
		return bids;
	}
	public void setBids(Set bids) {
		this.bids = bids;
	}
	public String getDescripction() {
		return descripction;
	}
	public void setDescripction(String descripction) {
		this.descripction = descripction;
	}
	
	

}
