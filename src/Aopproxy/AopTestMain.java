package Aopproxy;

public class AopTestMain {
	public static void main(String[] args) {
        LocalFileResource resource = new LocalFileResource("src/aop.xml");
		BeanFactory beanFactory = new XMLBeanFactory(resource);
	    FooInterface foo = (FooInterface)beanFactory.getBean("foo");
	    foo.printFoo();
	    foo.dummyFoo();
	  }

}
