package monitoring.canopus.design;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.viewpoint.ViewpointPackage;

import openmlperf.openmlperfPerformanceMonitoring.LoadGenerator;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.AssociationCounterCriteriaThreshold;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Criteria;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Disk;
import openmlperf.openmlperfPerformanceMonitoring.openmlperfPerformanceMetric.Metric;
import openmlperf.openmlperfPerformanceScenario.*;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.ThinkTime;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceWorkload.RampDownUsers;

/**
 * 
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
	
	
	public void teste() {
		System.out.print("fdd");
		
	}
	
public String setScriptUserRelation(UserProfile user) {
	
	int value = 0;
	
	
	
	return user.getName();
}
	
public String setLGImage(LoadGenerator lg) {
		String path = "";
		if (lg.isIsMonitor()) {
			path = "/monitoring.canopus.design/icons/LoadGenerator.png";
		}else {
			path = "/monitoring.canopus.design/icons/LoadGeneratorMonitor.png";
		}
		return path;
	}
	
public String setLabelAssociationCriteriaThreshold(AssociationCounterCriteriaThreshold association) {
    	
    	String type;
    	int value = association.getAssociationCriteria().getValue();
//    	EStructuralFeature es = association.eContainingFeature();
//    	Criteria crit = association.getCriteria();
    	//System.out.println(es.getClass());
    	
    	EObject raiz = association.eContainer().eAllContents().next();
//    	System.out.println("Instancia do raiz" + eo.getClass());
    	if(raiz instanceof Disk) {
    		Disk disk = (Disk) raiz;
    		
//    		String str = "<Disk name=\""+disk.getName()+"\" >";
//    		//System.out.println(str+"Gremio");
//    		str+='\n'+"    <Counter nmae= \""+disk.getDisk_io_counter()+"\"/>";
////    		disk.getDisk_io_counter().get
//    		str+="</Disk>";
    		
    		//TODO ou gera codigo
    		System.out.println("code.xml");
    		
    		//TODO ou atualiza o campo de texto/console
    //		System.out.println(str);
    	}
    	if(value == 0){
    		type = " "; 
    	}else if(value == 1) {
    		type = ">=";
    	}else {
    		type = "<";
    	}
    	
    	return type;
    	
    }
	
	
public void setIntegerLabelsRampDownUsers( Workload work, String value) {
	
    	List<Character>values = new ArrayList<>();
    	
    	int valuesInt =0;
    
    	System.out.print("Teste print? "+ value.toString() +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
    	
    	for(char c : value.toCharArray()) {
    		
    		if (Character.isDigit(c)) {
    			System.out.print("Teste 456 "+ c +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
    			values.add(c);
    		}
    		
    	}
    	
    	
    	char[]char1 = new char[values.size()];
    	int i = 0;
    	for(Iterator iter = values.iterator(); iter.hasNext(); i++) {
    		char1[i] = ((Character)iter.next()).charValue();
    	}
    	
    	String textValue = new String(char1);
    	
    	valuesInt = Integer.valueOf(textValue);
    	
    
    		work.getRampDownUsers().setVirtualUsers(valuesInt);
    
    	
    }

public void setIntegerLabelsRampDownTimer( Workload work, String value) {
	
		
		Date dts = null;

		String tempo = "";

		SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss");
		System.out.print("Teste time "+ tempo.toString() +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
		

		       try {
		    	   
				dts= sdf.parse(value);
				
			} catch (ParseException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			
			}
		
		tempo = dts.getHours()+":"+dts.getMinutes()+":"+dts.getSeconds();

	    work.getRampDownTimer().setTime(value);
	    

	
	
}
   
public void setIntegerLabelsRampUpUsers( Workload work, String value) {
	
	List<Character>values = new ArrayList<>();
	
	int valuesInt =0;

	System.out.print("Teste print "+ value.toString() +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
	
	for(char c : value.toCharArray()) {
		
		if (Character.isDigit(c)) {
			System.out.print("Teste 460 "+ c +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
			System.out.print("test/scala");
			File file = new File("C:/Users/joao_/Documents/test.scala");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.print("Deu ruim �&�������&$%&�%&%&�%&�%&�%&");
			}
			values.add(c);
		}
		
	}
	
	
	char[]char1 = new char[values.size()];
	int i = 0;
	for(Iterator iter = values.iterator(); iter.hasNext(); i++) {
		char1[i] = ((Character)iter.next()).charValue();
	}
	
	String textValue = new String(char1);
	
	valuesInt = Integer.valueOf(textValue);
	
	work.getRampUpUsers().setVirtualUsers(valuesInt);
	
	
	
}
	
public void setIntegerLabelsRampUpTimer( Workload work, String value) {

	Date dts = null;

	String tempo = "";

	SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss");
	System.out.print("Teste time "+ tempo +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
	

	       try {
	    	   
			dts= sdf.parse(value);
			
		} catch (ParseException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		}
	
	tempo = dts.getHours()+":"+dts.getMinutes()+":"+dts.getSeconds();

    work.getRampUpTimer().setTime(value);
	
}

public void setIntegerLabelsTestTime( Workload work, String value) {//TODO Mudar o tipo do tempo do teste(workload), para int, ao inv�s de string...
	
	List<Character>values = new ArrayList<>();
	
	int valuesInt =0;

	System.out.print("Teste print "+ value.toString() +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
	
	for(char c : value.toCharArray()) {
		
		if (Character.isDigit(c)) {
			System.out.print("Teste 456 "+ c +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
			values.add(c);
		}
		
	}
	
	
	char[]char1 = new char[values.size()];
	int i = 0;
	for(Iterator iter = values.iterator(); iter.hasNext(); i++) {
		char1[i] = ((Character)iter.next()).charValue();
	}
	
	String textValue = new String(char1);
	
	valuesInt = Integer.valueOf(textValue);
	
	
	work.setTime(textValue);
	
	
}
	
public void setIntegerLabelsTestUser( Workload work, String value) {
	
	List<Character>values = new ArrayList<>();
	
	int valuesInt =0;

	System.out.print("Teste print "+ value.toString() +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
	
	for(char c : value.toCharArray()) {
		
		if (Character.isDigit(c)) {
			System.out.print("Teste 456 "+ c +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
			values.add(c);
			File file = new File("./arquivo/test.scala");
		}
		
	}
	
	
	char[]char1 = new char[values.size()];
	int i = 0;
	for(Iterator iter = values.iterator(); iter.hasNext(); i++) {
		char1[i] = ((Character)iter.next()).charValue();
	}
	
	String textValue = new String(char1);
	
	valuesInt = Integer.valueOf(textValue);
	
	
	work.setVirtualUsers(valuesInt);
	
	
}
    
public String FormatTime(ThinkTime thinktime, String time) {
	
	Date dts = null;

	String tempo;

	SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss");
	System.out.print("Teste time "+ time +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
	


	       try {
	    	   
			dts= sdf.parse(time);
			
		} catch (ParseException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		}
	
	tempo = dts.getHours()+":"+dts.getMinutes()+":"+dts.getSeconds();

    return tempo;
    
}





}
