package com.suresh.javasamples.stringbuffernbuilder;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class StrBuffernBuilderwithMultiThrd {

	public static void main(String[] args) {

		ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
		// With Buffer
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 10; i++) {
			executorService.execute(new AppendableRunnable(buffer));
		}
		shutdownAndAwaitTermination(executorService);
		System.out.println(" Thread Buffer : " + AppendableRunnable.time);

		// With Builder
		AppendableRunnable.time = 0;
		executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			executorService.execute(new AppendableRunnable(builder));
		}
		shutdownAndAwaitTermination(executorService);
		System.out.println(" Thread Builder: " + AppendableRunnable.time);

	}

	static void shutdownAndAwaitTermination(ExecutorService pool) {
		pool.shutdown(); // code reduced from Official Javadoc for Executors
		try {
			if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
				pool.shutdownNow();
				if (!pool.awaitTermination(60, TimeUnit.SECONDS))
					System.err.println("Pool did not terminate");
			}
		} catch (Exception e) {
		}
	}
}

class AppendableRunnable<T extends Appendable> implements Runnable {

	static long time = 0;
	T appendable;

	public AppendableRunnable(T appendable) {
		this.appendable = appendable;
	}

	@Override
	public void run() {
		long t0 = System.currentTimeMillis();
		for (int j = 0; j < 10000; j++) {
			try {
				appendable.append("some string");
			} catch (IOException e) {
			}
		}
		time += (System.currentTimeMillis() - t0);
	}
}
