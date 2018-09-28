package monitoring.canopus.design;

import org.eclipse.emf.ecore.EObject;

import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold;


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
    
    public String setLabelAssociationCriteriaThreshold(AssociationCounterCriteriaThreshold association) {
    	
    	String type;
    	int value = association.getAssociationCriteria().getValue();
    	
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
