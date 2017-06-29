/**
 * 
 */
package com.asm.blockchain.entity;

import java.util.Map;

/**
 * @author Anup_Kumar_G
 *
 */
public class Anchor {

	private Map<String,String> contractReadData;
	private Map<String,String> contractWrittenData;
	
	/**
	 * @return the contractReadData
	 */
	public Map<String, String> getContractReadData() {
		return contractReadData;
	}
	/**
	 * @param contractReadData the contractReadData to set
	 */
	public void setContractReadData(Map<String, String> contractReadData) {
		this.contractReadData = contractReadData;
	}
	/**
	 * @return the contractWrittenData
	 */
	public Map<String, String> getContractWrittenData() {
		return contractWrittenData;
	}
	/**
	 * @param contractWrittenData the contractWrittenData to set
	 */
	public void setContractWrittenData(Map<String, String> contractWrittenData) {
		this.contractWrittenData = contractWrittenData;
	}
	
	
	
}
