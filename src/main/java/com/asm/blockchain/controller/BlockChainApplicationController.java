package com.asm.blockchain.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.asm.blockchain.common.Constants;
import com.asm.blockchain.entity.Chaincode;
import com.asm.blockchain.entity.ClientTransaction;
import com.asm.blockchain.entity.PeerDetailsModel;
import com.asm.blockchain.entity.TransactionProposal;

@Path("/bc")
public class BlockChainApplicationController {

	@POST
	@Path("/registerPeer")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void registerPeer(PeerDetailsModel peerDetailsModel) {
		System.out.println("registerPeer called");
	}

	@GET
	@Path("/getPeers")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<PeerDetailsModel> getPeers() {
		System.out.println("getPeers called");
		PeerDetailsModel peer = new PeerDetailsModel();
		peer.setRole(Constants.ROLE_TX_ENDORSER);
		peer.setPeerID("0001");
		List<PeerDetailsModel> list = new ArrayList<PeerDetailsModel>();
		list.add(peer);

		return list;
	}

	@POST
	@Path("/endorseProposal")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void endorseProposal(TransactionProposal transactionProposal) {
		System.out.println("submitTxProposal called");
	}

	@POST
	@Path("/deployChaincode")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void deployChaincode(Chaincode chaincode) {
		System.out.println("submitTxProposal called");
	}
	
	@POST
	@Path("/sendTxToOrderingServiceNode")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void sendTxToOrderingServiceNode(ClientTransaction cTx) {
		System.out.println("submitTxProposal called");
	}

}