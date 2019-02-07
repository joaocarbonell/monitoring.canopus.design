package monitoring.canopus.design;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
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

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Criteria;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk;
import canopus.canopusPerformanceScenario.*;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownTest;
import canopus.canopusPerformanceScenario.canopusPerformanceWorkload.RampDownUsers;

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
	
	
public int setIntegerLabels( Workload work, String value) {
    	
	//System.out.print("Teste 1 "+ value.getRampDownTest().getRampdownusers().getVirtualUsers() +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
	
    	List<Character>values = new ArrayList<>();
    	
    	int valuesInt =0;
    
    	
    	
    	
    
    	System.out.print("Teste print "+ value.toString() +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
    	
    	for(char c : value.toCharArray()) {
    		
    		if (Character.isDigit(c)) {
    			System.out.print("Teste 456 "+ c +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
    			values.add(c);
    		}
    		
    	}
    	
    	
    	/*for(int finalValues = 0; 0 <= values.size();finalValues++) {

    		
    		System.out.print("Teste Values"+ values.get(finalValues) +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
char cont = values.get(finalValues) ;
System.out.print("Teste CONT"+ cont +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
  
  
    	}*/
    	
    	String textValue = new String(values);
    	
    	System.out.print("Teste %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% " +textValue);
 
    	
    	
    	
    	return valuesInt;
    	
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
    		
    		String str = "<Disk name=\""+disk.getName()+"\" >";
    		//System.out.println(str+"Gremio");
    		str+='\n'+"    <Counter nmae= \""+disk.getDisk_io_counter().getName()+"\"/>";
//    		disk.getDisk_io_counter().get
    		str+="</Disk>";
    		
    		//TODO ou gera codigo
    		System.out.println("code.xml");
    		
    		//TODO ou atualiza o campo de texto/console
    		System.out.println(str);
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
    
    
    
}
