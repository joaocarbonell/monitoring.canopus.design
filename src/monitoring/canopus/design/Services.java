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
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Criteria;
import canopus.canopusPerformanceMonitoring.canopusPerformanceMetric.Disk;
import canopus.canopusPerformanceScripting.Activity;
import canopus.canopusPerformanceScripting.DataTable;
import canopus.canopusPerformanceScripting.Final;
import canopus.canopusPerformanceScripting.Initial;
import canopus.canopusPerformanceScripting.SaveParameters;


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
