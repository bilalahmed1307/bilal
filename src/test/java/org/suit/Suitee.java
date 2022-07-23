package org.suit;
import java.util.List;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
public class Suitee {
@Test
public void all() {
Result res = JUnitCore.runClasses(Employee.class,Company.class,Client.class);
System.out.println("RUN COUNT:"+res.getRunCount());
System.out.println("IGNORE COUNT:"+res.getIgnoreCount());
System.out.println("FAILURE COUNT :"+res.getFailureCount());
System.out.println("PASS COUNT :"+(res.getRunCount()-res.getFailureCount()));
List<Failure> failures = res.getFailures();
for (Failure failure : failures) {
	System.out.println("FAILURE REASON :"+failure);
}
}
}
