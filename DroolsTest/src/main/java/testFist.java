import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion.Static;

import util.KnowledgeSessionHelper;

public class testFist {
	StatelessKieSession statelessKieSession = null;
	KieSession kieSession = null;
	static KieContainer kieContainer;
	@BeforeClass
	public static void beforeClass(){
		kieContainer=KnowledgeSessionHelper.createRuleBase();
	}
	@Test
	public void test() {
		kieSession = KnowledgeSessionHelper.getStatefulKnowledgeSession(kieContainer, "ksession-rules");
		kieSession.fireAllRules();
	}

}
