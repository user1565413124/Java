package exception;


/*
 * 使用
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}
/*
 *     一个方法内部使用throw抛出一个异常，就要在方法上使用throws声明该异常的抛出以告知
 * 调用处理这个异常。
 *     只有RuntiomeException及其子类型异常在方法中抛出是不要求必须在方法上声明该异常
 * 的抛出，其他类型异常则是必须的，否则编译不通过。   
 *  
 */
	public void setAge(int age) throws IllegalAgeException {
		if(age < 0 ||age >100) {
			//取值不在合理去见，抛异常
			throw new  IllegalAgeException("年龄不合法！");
		}
		this.age = age;
	}

} 