
public class Test {

	public static void main(String[] args){
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "000-0000-0000";
		taro.address = "xxx-xxx-xxxxxx";


		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);

		taro.talk();
		taro.walk();
		taro.run();



		taro.name = "木村次郎";
		taro.age = 18;
		taro.phoneNumber = "000-0000-0000";
		taro.address = "xxx-xxx-xxxxxx";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);

		taro.talk();
		taro.walk();
		taro.run();



		taro.name = "鈴木花子";
		taro.age = 16;
		taro.phoneNumber = "000-0000-0000";
		taro.address = "xxx-xxx-xxxxxx";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);

		taro.talk();
		taro.walk();
		taro.run();



		taro.name = "安村徳晃";
		taro.age = 24;
		taro.phoneNumber = "000-0000-0000";
		taro.address = "xxx-xxx-xxxxxx";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);

		taro.talk();
		taro.walk();
		taro.run();



		taro.name = "aibo";

		taro.talk();
		taro.walk();
		taro.run();

		taro.name = "asimo";

		taro.talk();
		taro.walk();
		taro.run();

		taro.name = "pepper";

		taro.talk();
		taro.walk();
		taro.run();
	}
}
