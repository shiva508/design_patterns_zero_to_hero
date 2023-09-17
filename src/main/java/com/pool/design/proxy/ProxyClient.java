package com.pool.design.proxy;

public class ProxyClient {
	public static void main(String[] args) {
		System.out.println(args.length);
		JobExecutor executor=new JobExecutorImpl();
		executor.deleteInActive("ls");
	}
}
