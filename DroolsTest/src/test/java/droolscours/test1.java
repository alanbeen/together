package droolscours;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;

import droolscours.Account;
import util.KnowledgeSessionHelper;

public class test1 {
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
//		Account a = new Account();
//		a.setAccountno(1);
//		a.setBalance(2);
		Strings strings = new Strings();
		strings.setStr("Wolaile");
		kieSession.insert(strings);
		kieSession.fireAllRules();
	}

}
