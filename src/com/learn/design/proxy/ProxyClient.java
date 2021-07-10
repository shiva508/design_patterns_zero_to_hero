package com.learn.design.proxy;

public class ProxyClient {
	public static void main(String[] args) {
		JobExecutor executor=new JobExecutorImpl();
		executor.deleteInActive("ls");
	}
}
