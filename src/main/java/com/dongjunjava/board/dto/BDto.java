package com.dongjunjava.board.dto;

import java.security.Timestamp;

public class BDto {
	
	int bid;
	String bname;
	String btitle;
	String bcontents;
	Timestamp bdate;
	int bhit;
	int bgroup;
	int bstep;
	int bindent;
	
	
	
	public BDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public BDto(int bid, String bname, String btitle, String bcontents, Timestamp bdate, int bhit, int bgroup,
			int bstep, int bindent) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.btitle = btitle;
		this.bcontents = bcontents;
		this.bdate = bdate;
		this.bhit = bhit;
		this.bgroup = bgroup;
		this.bstep = bstep;
		this.bindent = bindent;
	}



	public BDto(int bId2, String bName2, String bTitle2, String bContent, java.sql.Timestamp bDate2, int bHit2,
			int bGroup2, int bStep2, int bIndent2) {
		// TODO Auto-generated constructor stub
	}



	public int getBid() {
		return bid;
	}



	public void setBid(int bid) {
		this.bid = bid;
	}



	public String getBname() {
		return bname;
	}



	public void setBname(String bname) {
		this.bname = bname;
	}



	public String getBtitle() {
		return btitle;
	}



	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}



	public String getBcontents() {
		return bcontents;
	}



	public void setBcontents(String bcontents) {
		this.bcontents = bcontents;
	}



	public Timestamp getBdate() {
		return bdate;
	}



	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}



	public int getBhit() {
		return bhit;
	}



	public void setBhit(int bhit) {
		this.bhit = bhit;
	}



	public int getBgroup() {
		return bgroup;
	}



	public void setBgroup(int bgroup) {
		this.bgroup = bgroup;
	}



	public int getBstep() {
		return bstep;
	}



	public void setBstep(int bstep) {
		this.bstep = bstep;
	}



	public int getBindent() {
		return bindent;
	}



	public void setBindent(int bindent) {
		this.bindent = bindent;
	}
	
	
	
}
