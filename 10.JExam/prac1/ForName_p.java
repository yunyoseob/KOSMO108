package a.b.c.prac1;

/*
 * // �޸� �ø��� ���
 * 1. static
 * 2. new
 * 3. ���
 * 4. getInstance
 * 5. newInstance
 * 
 * �������� 1~3���� ���� ���������,
 * 4~5���� ���� ���� �ʾ���.
 * */

import java.lang.reflect.Method;

/*
 * ClassNotFoundException
 * 
 * public class ClassNotFoundException
 * extends ReflectiveOperationException
 * Thrown when an application tries to load in a class through its string name using:
 * The forName method in class Class.
 * The findSystemClass method in class ClassLoader .
 * The loadClass method in class ClassLoader.
 * 
 * As of release 1.4~~~ getException() method is
 * now known as the cause, and may be accessed via the
 * Throwable.getCause()
 * 
 * InstantiationException
 * 
 * public InstantiationException()
 * Thrown when an application tries to create 
 * an instance of a class using the newInstance method 
 * in class Class, but the specified class object cannot 
 * be instantiated.
 * 
 * IllegalAccessException
 * 
 * public class IllegalAccessException
 * 
 * An IllegalAccessException is thrown 
 * when an application tries to reflectively create 
 * an instance (other than an array), set or get a field, 
 * or invoke a method, but the currently executing method 
 * does not have access to the definition of the specified 
 * class, field, method or constructor.
 * */

public class ForName_p {
	public void classForName() throws ClassNotFoundException,
									  InstantiationException,
									  IllegalAccessException{
		// public static Class<?> forName(String className) 
		// throws ClassNotFoundException
		Class cl=Class.forName("a.b.c.prac1.ForNameSample");
		// �ش� ����� �����ϱ� ����, ClassNotFoundException,
		// throws ��.
		// Why?????
		// static Class<?> forName(String className)
		// public static Class<?> forName(String className)
        // throws **ClassNotFoundException**
		
		System.out.println("\n 1. Class cl >>> : "+cl);
		// public T newInstance() throws InstantiationException,
		// IllegalAccessException
		ForNameSample fs=(ForNameSample)cl.newInstance();
		// a.b.c.prac1.ForNameSample@15db9742
		// ForNameSample �����ڰ� ������.
		// �ش� ��ɾ �����ϱ� ����, InstantiationException�� throws �ؾ� ��.
		// Why?
		// public T newInstance()
        // throws **InstantiationException, IllegalAccessException**
		System.out.println("\n 2. ForNameSample fs >>> : "+fs);
		System.out.println("\n 3. fs.aM()");
		fs.aM();
		// ForNameSample Ŭ�������� �����ڸ� ��������Ƿ�, Ŭ������ �ڿ��� ����� �� �ִ�.
		System.out.println("\n 4. fs.bM()");
		fs.bM();
		System.out.println("\n 5. fs.cM()");
		fs.cM();
		// Ŭ������ ����� �޼ҵ� ã��
		Method m[]=cl.getDeclaredMethods();
		// Method[] : getDeclared Methods()
		/*public Method[] getDeclaredMethods()
          throws SecurityException
          
          Returns an array containing Method objects
          reflecting all the declared methods of the class
          or interface represented by this Class object,
          including public, protected, default (package) access,
          and private methods, but excluding inherited methods
        */
		for (int i=0; i<m.length; i++){
			String findM=m[i].getName();
			// java.lang.reflect.Method.getName()
			// public String getName()
			// Returns the name of the method represented by this Method object, 
			// as a String.
			System.out.println("m["+i+"].getName() >>> :: "+findM);	
		}
	} // classForName() method

	public static void main(String[] args) throws ClassNotFoundException,
												  InstantiationException,
												  IllegalAccessException{
		new ForName_p().classForName();
		// ForName_p�� �ν��Ͻ��ϰ�, classForName �޼��� ����
	} // main method
} // ForName_p class
