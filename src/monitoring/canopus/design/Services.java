package monitoring.canopus.design;

import java.lang.reflect.InvocationTargetException;

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

import canopus.Scripting;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.AssociationCounterCriteriaThreshold;
import canopus.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScripting.DataTable;
import canopus.canopusPerformanceScripting.Final;
import canopus.canopusPerformanceScripting.Initial;
import canopus.canopusPerformanceScripting.SaveParameters;
import canopus.canopusPerformanceScripting.ScriptingModel;


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
