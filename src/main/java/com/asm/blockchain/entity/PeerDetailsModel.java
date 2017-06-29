/**
 * 
 */
package com.asm.blockchain.entity;

import java.util.List;

/**
 * @author Anup_Kumar_G
 * 
 * The transaction simulation results are returned to the client by the endorser in the proposal response. 
 * If there are multiple endorsers, the client can check that the responses are all the same, and submit the results and endorsements for ordering and commitment. 
 * Ultimately the committing peers will validate or invalidate the transaction, and the client becomes aware of the outcome via an event, 
 * that the SDK makes available to the application client.
 */
public class PeerDetailsModel {
	
	private String peerID = null;
	private String role = null;
	private List<String> policies = null;

	public String getPeerID() {
		return peerID;
	}

	public void setPeerID(String peerID) {
		this.peerID = peerID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	public void executeTransaction(){
		
	}
	
	public void validateBlockReceiveFromOderingService(Block receivedBlock){
		
	}
	
	public void updateLedger(Block receivedBlock){
		
	}
	
	public void updateWorldState(){
		
	}
	
	
	

}
