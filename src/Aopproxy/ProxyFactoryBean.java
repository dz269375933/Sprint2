package Aopproxy;

public class ProxyFactoryBean implements FooInterface{

	private String proxyInterfaces;
	private FooImpl target;
	private PrintBeforeAdvice interceptorNames;
	public void printFoo() {
		target.printFoo();
		
	}

	public void dummyFoo() {
		target.dummyFoo();
		
	}

	public String getProxyInterfaces() {
		return proxyInterfaces;
	}

	public void setProxyInterfaces(String proxyInterfaces) {
		this.proxyInterfaces = proxyInterfaces;
	}

	public FooImpl getTarget() {
		return target;
	}

	public void setTarget(FooImpl target) {
		this.target = target;
	}

	public PrintBeforeAdvice getInterceptorNames() {
		return interceptorNames;
	}

	public void setInterceptorNames(PrintBeforeAdvice interceptorNames) {
		this.interceptorNames = interceptorNames;
	}

}
