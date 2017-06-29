/**
 * 
 */
package com.asm.blockchain.entity;

import java.util.List;

/**
 * @author Anup_Kumar_G
 *
 */
public class Channel {
	private List<PeerDetailsModel> participantPeers= null;
	private VisibilitySetting visibilitySetting = null;

	/**
	 * @return the visibilitySetting
	 */
	public VisibilitySetting getVisibilitySetting() {
		return visibilitySetting;
	}

	/**
	 * @param visibilitySetting the visibilitySetting to set
	 */
	public void setVisibilitySetting(VisibilitySetting visibilitySetting) {
		this.visibilitySetting = visibilitySetting;
	}

	/**
	 * @return the participantPeers
	 */
	public List<PeerDetailsModel> getParticipantPeers() {
		return participantPeers;
	}

	/**
	 * @param participantPeers the participantPeers to set
	 */
	public void setParticipantPeers(List<PeerDetailsModel> participantPeers) {
		this.participantPeers = participantPeers;
	}
	
	
}
