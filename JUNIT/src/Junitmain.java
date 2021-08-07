import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Junitmain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result r=JUnitCore.runClasses(junitclass.class);
		
		for(Failure Failure:r.getFailures()) {
			System.out.println(r.toString());
			
		}
		System.out.println("result is "+r.wasSuccessful());

	}

}
