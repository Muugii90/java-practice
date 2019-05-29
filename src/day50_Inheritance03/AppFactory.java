package day50_Inheritance03;

public class AppFactory {

	public static void main(String[] args) {

		IPhoneApp iApp = new IPhoneApp();
		IPhoneApp iApp2 = new IPhoneApp("Uber");

		AndroidApp aApp = new AndroidApp();
		AndroidApp aApp2 = new AndroidApp("Lyft");

		System.out.println(iApp.getName());
		System.out.println(iApp2.getName());

		System.out.println(aApp.getName());
		System.out.println(aApp2.getName());

		iApp.setName("Facebook");
		System.out.println(iApp.getName());
		App.count = 33;
		System.out.println(IPhoneApp.count);
		
		AndroidApp.book =50;
		System.out.println(AndroidApp.book);
		
		AndroidApp.count = 100;
		System.out.println(App.count);
		System.out.println(IPhoneApp.count);
		System.out.println(AndroidApp.count);
		
		App.build("Swift");
		IPhoneApp.build("Objective C");
		AndroidApp.build("Java");
		iApp.build("Java S");
	}

}
