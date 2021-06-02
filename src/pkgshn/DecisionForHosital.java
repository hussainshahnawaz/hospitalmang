package pkgshn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import pkgshn.Patient;
import pkgshn.dats;

public class DecisionForHosital {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		int bcount=0,ocount=0;
		String sDate1="13/06/2021";  
		String sDate2="16/06/2021";  

	    Date from=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    Date to=new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);  
	    List<Patient> allPatient =dats.getData();
	    
	    int sizeAll=allPatient.size();
	    for(int i=0;i<allPatient.size();i++){
	    	if(allPatient.get(i).getlocation()=="Bangalore"){
	    		if(allPatient.get(i).getdate1().compareTo(from)>0 && allPatient.get(i).getdate1().compareTo(to)<0){
	    			bcount++;
	    		}
	    		else{
	    		sizeAll--;
	    		}
	    	}else{
		    	ocount++;
	    	}
	    }
	    
	    System.out.println("Total Patients from Bengalore  are:-  "+bcount);
	    System.out.println("Total Patient From outside are:-  "+ocount);
	    
	    
	    Double inPatientPercentage = Double.valueOf(bcount * 100 / sizeAll);
        Double outPatientPercentage = Double.valueOf(ocount * 100 / sizeAll);
	    System.out.println("Percentage Of Patient from Bangalore:- "+inPatientPercentage);
	    System.out.println("Percentage of Patient from Outside of Bangalore:-  "+outPatientPercentage);

	}
}