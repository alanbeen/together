package util;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class KnowledgeSessionHelper {
	public static KieContainer createRuleBase(){
		 KieServices ks = KieServices.Factory.get();
 	    KieContainer kieContainer = ks.getKieClasspathContainer();
 	    return kieContainer;
	}
	public static StatelessKieSession getStatelessKnowledgeSession(KieContainer kieContainer,String sessionName){
		StatelessKieSession kSession = kieContainer.newStatelessKieSession(sessionName);
		return kSession;
	}
	public static KieSession getStatefulKnowledgeSession(KieContainer kieContainer,String sessionName){
		KieSession kSession = kieContainer.newKieSession(sessionName);
		return kSession;
	}
	
}
