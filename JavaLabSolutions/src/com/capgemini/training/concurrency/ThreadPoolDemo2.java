package com.capgemini.training.concurrency;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class TaskCallable implements Callable<Integer>{
	@Override
	public Integer call() throws Exception{
		Random r=new Random(100);
		return r.nextInt();
	}
	
}
// refer callable interface javadoc on google.com
public class ThreadPoolDemo2 {

	public static void main(String[]args) throws InterruptedException, ExecutionException{
		ExecutorService service=Executors.newSingleThreadExecutor();
		Future<Integer> callFuture=service.submit(new TaskCallable());
		System.out.println(callFuture.get());
		boolean terminated=service.isTerminated();
		System.out.println(terminated);
		service.awaitTermination(10,TimeUnit.SECONDS);
		service.shutdownNow();
				
	}
}
