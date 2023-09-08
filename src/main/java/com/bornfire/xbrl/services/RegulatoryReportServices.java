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

	BRS61ReportService brs61ReportService;
	
	@Autowired
	BRS1_ReportService brs1_ReportService;
	
	@Autowired
	BRS5_ReportService brs5_ReportService;
	
	@Autowired
	BRS4_ReportService  brs4_ReportService;

	@Autowired
	BRS19_REPORTSERVICE brs19_REPORTSERVICE;

	@Autowired
	BRS20_REPORTSERVICE brs20_REPORTSERVICE;
	
	@Autowired
	BRS2_ReportService brs2_ReportService;
	
	@Autowired
    BRSS22_SERVICE brss22ReportService;

    @Autowired
    BRS25_SERVICE brs25ReportService;

    @Autowired
    BRS26_SERVICE brs26ReportService;

    @Autowired
    BRS27_SERVICE brs27ReportService;

    @Autowired
    BRS29_SERVICE brs29ReportService;

    @Autowired
    BRS31_SERVICE brs31ReportService;
    

    @Autowired
    BRS23_SERVICE brs23ReportService;
    
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

			  
		
			  
		
		case "BRS61": 
			repsummary = brs61ReportService.getBRS61View(reportId,  fromdate, todate, currency, dtltype, pageable); 
		    break;
		    
		case "BRS1": 
			repsummary = brs1_ReportService.getBRS1_view(reportId,  fromdate, todate, currency, dtltype, pageable); 
		    break;
				
		case "BRS5": 
			repsummary = brs5_ReportService.getBRS5_view(reportId,  fromdate, todate, currency, dtltype, pageable); 
		    break;
			
		case "BRS4": 
			repsummary = brs4_ReportService.getBRS4_view(reportId,  fromdate, todate, currency, dtltype, pageable); 
		    break;
		    
		case "BRSS22": 
            repsummary = brss22ReportService.getBRSS22_view(reportId,  fromdate, todate, currency, dtltype, pageable); 
            break;

        case "BRS25": 
            repsummary = brs25ReportService.getBRS25_view(reportId,  fromdate, todate, currency, dtltype, pageable); 
            break;
        case "BRS26": 
            repsummary = brs26ReportService.getBRS26_view(reportId,  fromdate, todate, currency, dtltype, pageable); 
            break;
        case "BRS27": 
            repsummary = brs27ReportService.getBRS27_view(reportId,  fromdate, todate, currency, dtltype, pageable); 
            break;
        case "BRS29": 
            repsummary = brs29ReportService.getBRS29_view(reportId,  fromdate, todate, currency, dtltype, pageable); 
            break;
        case "BRS31": 
            repsummary = brs31ReportService.getBRS31_view(reportId,  fromdate, todate, currency, dtltype, pageable); 
            break;
            
        case "BRS23": 
            repsummary = brs23ReportService.getBRS23_view(reportId,  fromdate, todate, currency, dtltype, pageable); 
            break;
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
		  

		case "BRSS22":

		            repsummary = brss22ReportService.getBRSS22_view(reportId, fromdate, todate, currency, dtltype, pageable);

		            break;


		        case "BRS25":

		            repsummary = brs25ReportService.getBRS25_view(reportId, fromdate, todate, currency, dtltype, pageable);

		            break;
		        case "BRS23":

		            repsummary = brs23ReportService.getBRS23_view(reportId, fromdate, todate, currency, dtltype, pageable);

		            break;



		        case "BRS26":

		            repsummary = brs26ReportService.getBRS26_view(reportId, fromdate, todate, currency, dtltype, pageable);

		            break;

		        case "BRS27":

		            repsummary = brs27ReportService.getBRS27_view(reportId, fromdate, todate, currency, dtltype, pageable);

		            break;

		        case "BRS29":

		            repsummary = brs29ReportService.getBRS29_view(reportId, fromdate, todate, currency, dtltype, pageable);

		            break;

		        case "BRS31":

		            repsummary = brs31ReportService.getBRS31_view(reportId, fromdate, todate, currency, dtltype, pageable);

		            break;

		  


		/*
		 * case "BRF014": repsummary = brf014ReportService.getBRF014View(reportId,
		 * fromdate, todate, currency, dtltype, pageable); break;
		 * 
		 */	




		case "BRS2":
			repsummary = brs2_ReportService.getBRS2_view(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
		case "BRS61":
			repsummary = brs61ReportService.getBRS61View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "BRS1":
			repsummary = brs1_ReportService.getBRS1_view(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
		
		case "BRS5":
			repsummary = brs5_ReportService.getBRS5_view(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "BRS4":
			repsummary = brs4_ReportService.getBRS4_view(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			

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

		case "BRS1":
			repdetail = brs1_ReportService.getBRS1currentDtl(reportId, fromdate, todate, currency, dtltype, pageable, Filter);
			break;
			
		case "BRS5":
			repdetail = brs5_ReportService.getBRS5currentDtl(reportId, fromdate, todate, currency, dtltype, pageable, Filter);
			break;

		case "BRS4":
			repdetail = brs4_ReportService.getBRS4currentDtl(reportId, fromdate, todate, currency, dtltype, pageable, Filter);
			break;

		case "BRSS22":
			repdetail = brss22ReportService.getBRSS22currentDtl(reportId, fromdate, todate, currency, dtltype, pageable, Filter);
			break;
		case "BRS25":
			repdetail = brs25ReportService.getBRS25currentDtl(reportId, fromdate, todate, currency, dtltype, pageable, Filter);
			break;
		case "BRS23":
			repdetail = brs23ReportService.getBRS23currentDtl(reportId, fromdate, todate, currency, dtltype, pageable, Filter);
			break;
		case "BRS27":
			repdetail = brs27ReportService.getBRS27currentDtl(reportId, fromdate, todate, currency, dtltype, pageable, Filter);
			break;
		case "BRS29":
			repdetail = brs29ReportService.getBRS29currentDtl(reportId, fromdate, todate, currency, dtltype, pageable, Filter);
			break;
		case "BRS26":
			repdetail = brs26ReportService.getBRS26currentDtl(reportId, fromdate, todate, currency, dtltype, pageable, Filter);
			break;
		case "BRS31":
			repdetail = brs31ReportService.getBRS31currentDtl(reportId, fromdate, todate, currency, dtltype, pageable, Filter);
			break;
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
			  
		 case "BRS27": 
             repfile = brs27ReportService.getFileBRS27(reportId, fromdate,
			  todate, currency, dtltype, filetype); break;
			  
		 case "BRS25": 
             repfile = brs25ReportService.getFileBRS25(reportId, fromdate,
			  todate, currency, dtltype, filetype); break;
		 case "BRS23": 
             repfile = brs23ReportService.getFileBRS23(reportId, fromdate,
			  todate, currency, dtltype, filetype); break;
			  
		 case "BRS26": 
             repfile = brs26ReportService.getFileBRS26(reportId, fromdate,
			  todate, currency, dtltype, filetype); break;
		 case "BRS29": 
             repfile = brs29ReportService.getFileBRS29(reportId, fromdate,
			  todate, currency, dtltype, filetype); break;
		 case "BRS31": 
             repfile = brs31ReportService.getFileBRS31(reportId, fromdate,
			  todate, currency, dtltype, filetype); break;
			  
		 case "BRSS27": 
             repfile = brss22ReportService.getFileBRSS22(reportId, fromdate,
			  todate, currency, dtltype, filetype); break;
			  
				 case "BRS20": 
		             repfile = brs20_REPORTSERVICE.getFile(reportId, fromdate,
					  todate, currency, dtltype, filetype); break;

		
	

		case "BRS1":
			repfile = brs1_ReportService.getFileBRS1(reportId, fromdate, todate, currency, dtltype, filetype);
			break;
			
		case "BRS5":
			repfile = brs5_ReportService.getFileBRS5(reportId, fromdate, todate, currency, dtltype, filetype);
			break;
		
		case "BRS4":
			repfile = brs4_ReportService.getFileBRS4(reportId, fromdate, todate, currency, dtltype, filetype);
			break;
		
		

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
			  msg = brs27ReportService.preCheck(reportid, fromdate, todate);
		  break;

		  case "BRS31":
			  msg = brs31ReportService.preCheck(reportid, fromdate, todate);
		  break;
		  
		  case "BRSS22":
			  msg = brss22ReportService.preCheck(reportid, fromdate, todate);
		  break;
		  case "BRS25":
			  msg = brs25ReportService.preCheck(reportid, fromdate, todate);
		  break;
		  case "BRS26":
			  msg = brs26ReportService.preCheck(reportid, fromdate, todate);
		  break;
		  case "BRS23":
			  msg = brs23ReportService.preCheck(reportid, fromdate, todate);
		  break;
		  case "BRS27":
			  msg = brs27ReportService.preCheck(reportid, fromdate, todate);
		  break;
		  case "BRS29":
			  msg = brs29ReportService.preCheck(reportid, fromdate, todate);
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
		  

		case "BRS2": 
			msg = brs2_ReportService.preCheck(reportid, fromdate, todate);
			break;
		case "BRS61": 
			msg = brs61ReportService.preCheckBRS61(reportid, fromdate, todate);
			break;
			
		case "BRS1": 
			msg = brs1_ReportService.preCheck(reportid, fromdate, todate);
			break;
			
		case "BRS5": 
			msg = brs5_ReportService.preCheck(reportid, fromdate, todate);
			break;
			
		case "BRS4": 
			msg = brs4_ReportService.preCheck(reportid, fromdate, todate);
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
