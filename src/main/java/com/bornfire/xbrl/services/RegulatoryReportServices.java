package com.bornfire.xbrl.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.bornfire.xbrl.entities.XBRLProceduresRep;
import com.bornfire.xbrl.entities.XBRLReportsMasterRep;

import net.sf.jasperreports.engine.JRException;

@Service
@Transactional
@ConfigurationProperties("output")
public class RegulatoryReportServices {

	private static final Logger logger = LoggerFactory.getLogger(RegulatoryReportServices.class);

	@NotNull
	private String exportpath;

	@Autowired
	XBRLReportsMasterRep xbrlReportsMasterRep;

	@Autowired
	XBRLProceduresRep xbrlProceduresRep;

	@Autowired
	DataSource srcdataSource;

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	CustomRepGeneratorServices customerrptgenserviceexcel;
	
	@Autowired
	BRS3REPORTSERVICE  brs3REPORTSERVICE ;
	
	@Autowired
	BRS13_REPORTSERVICE brs13_REPORTSERVICE;
	
	@Autowired
	BRS14_REPORTSERVICE brs14_REPORTSERVICE;
	
	@Autowired
	BRS17_REPORTSERVICE brs17_REPORTSERVICE;

	@Autowired
	BRS19_REPORTSERVICE brs19_REPORTSERVICE;

	@Autowired
	BRS20_REPORTSERVICE brs20_REPORTSERVICE;
	

	
	
	public String getExportpath() {
		return exportpath;
	}

	public void setExportpath(String exportpath) {
		this.exportpath = exportpath;
	}

	public ModelAndView getReportView(String reportId, String reportDate, String fromdate, String todate,
			String currency, String dtltype, String subreportid, String secid, String reportingTime,
			Pageable pageable) {

		ModelAndView repsummary = new ModelAndView();

		logger.info("Getting View for the Report :" + reportId);
		switch (reportId) {
		
		 case "BRS3": 
			  repsummary = brs3REPORTSERVICE .getBRS3View(reportId, fromdate, todate, currency, dtltype, pageable);
			  break;
			
		 case "BRS13": 
			  repsummary = brs13_REPORTSERVICE.getBRS13View(reportId, fromdate, todate, currency, dtltype, pageable);
			  break;
			  
		 case "BRS14": 
			  repsummary = brs14_REPORTSERVICE.getBRS14View(reportId, fromdate, todate, currency, dtltype, pageable);
			  break;
	
		 case "BRS17": 
			  repsummary = brs17_REPORTSERVICE.getBRS17View(reportId, fromdate, todate, currency, dtltype, pageable);
			  break;
			  
		 case "BRS19": 
			  repsummary = brs19_REPORTSERVICE.getBRS19View(reportId, fromdate, todate, currency, dtltype, pageable);
			  break;
			  
		 case "BRS20": 
			  repsummary = brs20_REPORTSERVICE.getBRS20View(reportId, fromdate, todate, currency, dtltype, pageable);
			  break;

			  
		
			  
		/*
		 * case "BRF014": repsummary = brf014ReportService.getBRF014View(reportId,
		 * fromdate, todate, currency, dtltype, pageable); break;
		 * 
		 */	
		}

		return repsummary;
	}
	public ModelAndView getReportSummary(String reportId, String reportDate, String fromdate, String todate,
			String currency, String dtltype, String subreportid, String secid, String reportingTime,
			Pageable pageable) {

		ModelAndView repsummary = new ModelAndView();

		logger.info("Getting View for the Report :" + reportId);
		switch (reportId) {
		
		case "BRS3": 
			  repsummary = brs3REPORTSERVICE .getBRS3View(reportId,
		  fromdate, todate, currency, dtltype, pageable); break;

		case "BRS13": 
			  repsummary = brs13_REPORTSERVICE.getBRS13View(reportId,
		  fromdate, todate, currency, dtltype, pageable); break;
		  
		case "BRS14": 
			  repsummary = brs14_REPORTSERVICE.getBRS14View(reportId,
		  fromdate, todate, currency, dtltype, pageable); break;
		 
		case "BRS17": 
			  repsummary = brs17_REPORTSERVICE.getBRS17View(reportId,
		  fromdate, todate, currency, dtltype, pageable); break;

		  
		case "BRS19": 
			  repsummary = brs19_REPORTSERVICE.getBRS19View(reportId,
		  fromdate, todate, currency, dtltype, pageable); break;
		  
		case "BRS20": 
			  repsummary = brs20_REPORTSERVICE.getBRS20View(reportId,
		  fromdate, todate, currency, dtltype, pageable); break;
		  

		  


		/*
		 * case "BRF014": repsummary = brf014ReportService.getBRF014View(reportId,
		 * fromdate, todate, currency, dtltype, pageable); break;
		 * 
		 */	
		}

		return repsummary;
	}

	public ModelAndView getReportDetails(String reportId, String instanceCode, String asondate, String fromdate,
			String todate, String currency, String reportingTime, String dtltype, String subreportid, String secid,
			Pageable pageable, String Filter) {

		ModelAndView repdetail = new ModelAndView();
		logger.info("Getting Details for the Report :" + reportId);

		switch (reportId) {
		 
		case "BRS3": 
			  repdetail = brs3REPORTSERVICE .getBRS3currentDtl(reportId, fromdate,
		  todate, currency, dtltype, pageable, Filter); break;

		case "BRS13": 
			  repdetail = brs13_REPORTSERVICE.getBRS13currentDtl(reportId, fromdate,
		  todate, currency, dtltype, pageable, Filter); break;
		  
		case "BRS14": 
			  repdetail = brs14_REPORTSERVICE.getBRS14currentDtl(reportId, fromdate,
		  todate, currency, dtltype, pageable, Filter); break;
		  
		case "BRS17": 
			  repdetail = brs17_REPORTSERVICE.getBRS17currentDtl(reportId, fromdate,
		  todate, currency, dtltype, pageable, Filter); break;
		  
		case "BRS19": 
			  repdetail = brs19_REPORTSERVICE.getBRS19currentDtl(reportId, fromdate,
		  todate, currency, dtltype, pageable, Filter); break;
		  
		case "BRS20": 
			  repdetail = brs20_REPORTSERVICE.getBRS20currentDtl(reportId, fromdate,
		  todate, currency, dtltype, pageable, Filter); break;
		  

		  
		
		  
		/*
		 * case "B14": repdetail = b14ReportService.getB14currentDtl(reportId, fromdate,
		 * todate, currency, dtltype, pageable, Filter); break;
		 */

		}
		return repdetail;
	}

	public File getDownloadFile(String reportId, String asondate, String fromdate, String todate, String currency,
			String subreportid, String secid, String dtltype, String reportingTime, String filetype,
			String instancecode) throws FileNotFoundException, JRException, SQLException {

		File repfile = null;

		logger.info("Getting Report File for : " + reportId + " in " + filetype + " format");

		switch (reportId) {
		
		 case "BRS3": repfile = brs3REPORTSERVICE .getFile(reportId, fromdate,
				  todate, currency, dtltype, filetype); break;
				  
		 case "BRS13": repfile = brs13_REPORTSERVICE.getFile(reportId, fromdate,
				  todate, currency, dtltype, filetype); break;
				  
		 case "BRS14": repfile = brs14_REPORTSERVICE.getFile(reportId, fromdate,
				  todate, currency, dtltype, filetype); break;
				  
		 case "BRS17": 
             repfile = brs17_REPORTSERVICE.getFile(reportId, fromdate,
			  todate, currency, dtltype, filetype); break;
			  
		 case "BRS19": 
             repfile = brs19_REPORTSERVICE.getFile(reportId, fromdate,
			  todate, currency, dtltype, filetype); break;
			  
		 case "BRS20": 
             repfile = brs20_REPORTSERVICE.getFile(reportId, fromdate,
			  todate, currency, dtltype, filetype); break;
			  
		

		
	
		}

		return repfile;

	}

	public String preCheckReportRBS(String reportid, String fromdate, String todate) {

		String msg = "";

		logger.info("Report precheck : " + reportid);

		switch (reportid) {

		  case "BRS3":
			  msg = brs3REPORTSERVICE .preCheck(reportid, fromdate, todate);
		  break;

		  case "BRS13":
			  msg = brs13_REPORTSERVICE.preCheck(reportid, fromdate, todate);
		  break;
		  
		  case "BRS14":
			  msg = brs14_REPORTSERVICE.preCheck(reportid, fromdate, todate);
		  break;
		  
		  case "BRS17":
			  msg = brs17_REPORTSERVICE.preCheck(reportid, fromdate, todate);
		  break;
		  
		  case "BRS19":
			  msg = brs19_REPORTSERVICE.preCheck(reportid, fromdate, todate);
		  break;
		  
		  case "BRS20":
			  msg = brs20_REPORTSERVICE.preCheck(reportid, fromdate, todate);
		  break;
		  
		
		  
		  
		
		/*
		 * case "B14": msg = b14ReportService.preCheckB14(reportid, fromdate, todate);
		 * break;
		 */
		default:
			logger.info("default -> preCheck()");
			msg = "Master - need to process";
		}
		return msg;
	}
}
