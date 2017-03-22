package com.sncr.tts.rest.report.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sncr.tts.rest.login.controller.LoginController;
import com.sncr.tts.rest.report.beans.SuperUserDetails;
import com.sncr.tts.rest.ticket.data.TicketBean;
import com.sncr.tts.rest.ticket.data.TicketReq;
import com.sncr.tts.rest.ticket.service.TicketService;

@RestController
@RequestMapping(value = "report")
public class ReportController {
	private static final Logger logger = LoggerFactory
			.getLogger(LoginController.class);
	@Autowired
	TicketService ticketService;
	/**
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "getUserBySuperUserId", method = RequestMethod.POST)
	public ResponseEntity<SuperUserDetails> getUserBySuperUserId(@PathVariable long superUserId){
		logger.info(this.getClass().getName() + " - getUserBySuperUserId - START");
		SuperUserDetails superUser = new SuperUserDetails();
		
		
		logger.info(this.getClass().getName() + " - getUserBySuperUserId - END");
		return new ResponseEntity<SuperUserDetails>(superUser,HttpStatus.OK);
	}
	/**
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "getTktByUserIdAndDate", method = RequestMethod.POST)
	public ResponseEntity<List<TicketBean>> getTktByUsereIdAndDate(@RequestBody TicketReq req){
		logger.info(this.getClass().getName() + " - getTktByUsereIdAndDate - START");
		List<TicketBean> ticketList = new ArrayList<TicketBean>();
		ticketList = ticketService.findByUserIdAndCreatedDate(req.getUserId(), req.getCreatedDate());
		logger.info(this.getClass().getName() + " - getTktByUsereIdAndDate - total size = "+ticketList.size());
		logger.info(this.getClass().getName() + " - getTktByUsereIdAndDate - total size = "+req.getCreatedDate());
		logger.info(this.getClass().getName() + " - getTktByUsereIdAndDate - END");
		return new ResponseEntity<List<TicketBean>>(ticketList,HttpStatus.OK);
	}
	/**
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "getTktByUserIdAndDate", method = RequestMethod.POST)
	public ResponseEntity<List<TicketBean>> getTicketByDate(@RequestBody TicketReq req){
		logger.info(this.getClass().getName() + " - getTktByUsereIdAndDate - START");
		List<TicketBean> ticketList = new ArrayList<TicketBean>();
		ticketList = ticketService.findByUserIdAndCreatedDate(req.getUserId(), req.getCreatedDate());
		logger.info(this.getClass().getName() + " - getTktByUsereIdAndDate - total size = "+ticketList.size());
		logger.info(this.getClass().getName() + " - getTktByUsereIdAndDate - total size = "+req.getCreatedDate());
		logger.info(this.getClass().getName() + " - getTktByUsereIdAndDate - END");
		return new ResponseEntity<List<TicketBean>>(ticketList,HttpStatus.OK);
	}

}
