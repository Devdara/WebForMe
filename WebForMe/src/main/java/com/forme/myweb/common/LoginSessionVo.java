package com.forme.myweb.common;

public class LoginSessionVo {
	
	private Integer usrNo;
	private String usrId;
	private String usrNm;
	private Integer erpId;
	private String bmd; // 생년월일
	
	public LoginSessionVo() {}
	
	/*
	public LoginSessionVo( CustomUserDetails details ) {
		this.usrNo = details.getEsUsrNo();
		this.usrId = details.getUsrId();
		this.usrNm = details.getUsrNm();
		this.erpId = details.getErpId();
		this.bmd = details.getBmd();
	}*/
	
	/**
	    @return Returns the usrNo.
	 */
	public Integer getUsrNo() {
		return usrNo;
	}
	/**
	    @param usrNo The usrNo to set.
	 */
	public void setUsrNo( Integer usrNo ) {
		this.usrNo = usrNo;
	}
	/**
	    @return Returns the usrId.
	 */
	public String getUsrId() {
		return usrId;
	}
	/**
	    @param usrId The usrId to set.
	 */
	public void setUsrId( String usrId ) {
		this.usrId = usrId;
	}
	/**
	    @return Returns the usrNm.
	 */
	public String getUsrNm() {
		return usrNm;
	}
	/**
	    @param usrNm The usrNm to set.
	 */
	public void setUsrNm( String usrNm ) {
		this.usrNm = usrNm;
	}
	/**
	    @return Returns the erpId.
	 */
	public Integer getErpId() {
		return erpId;
	}
	/**
	    @param erpId The erpId to set.
	 */
	public void setErpId( Integer erpId ) {
		this.erpId = erpId;
	}

	public String getBmd() {
		return bmd;
	}

	public void setBmd(String bmd) {
		this.bmd = bmd;
	}
	
	
}
