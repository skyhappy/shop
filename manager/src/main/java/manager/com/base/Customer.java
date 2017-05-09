package manager.com.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.ispmj.base.Base1;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class Customer implements Runnable {
	private String id;
	private String age;
	private String mm;
	public void customer(){
		//System.out.println( new Base().print());
		//Base1 base =new Base1();
		new Base1().getStr("this is miss");
		System.out.println("Message: is this product message-----------");
	}
	public Customer(String id) {
		super();
		this.id = id;
		System.out.println(id);
	}
	public void run() {
		// TODO Auto-generated method stub
		/*System.out.println(id);*/
	}
	
	public void Write(){
		
	}
	public static void main(String[] args) throws InterruptedException {
		/*ExecutorService cachedThreadPool = Executors.newFixedThreadPool(2000);  */
/*		 ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5); 
*/		long startTime = System.currentTimeMillis();    //获取开始时间
		for(int i=0;i<1000000;i++){
			Customer csa=new Customer(String.valueOf(i));
			Thread t1=new Thread(csa);
			/*t1.start();*/
/*			cachedThreadPool.execute(t1);
*/		
			//Thread.sleep(3);
/*			scheduledThreadPool.schedule(t1, 3,TimeUnit.SECONDS);	
*/			
		}
		
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println(endTime-startTime);
		
		
	}
	
}
