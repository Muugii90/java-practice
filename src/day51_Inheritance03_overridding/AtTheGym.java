package day51_Inheritance03_overridding;



public class AtTheGym {

	public static void main(String[] args) {
		

		Exercise ex = new Exercise();
		Running r = new Running ();
		Swimming s = new Swimming();
		Yoga y = new Yoga();
		JuiJitsu j = new JuiJitsu();
		Sprinting sp = new Sprinting();
		Snowboarding sb = new Snowboarding();
		
		
		System.out.println(ex.perform(30));
		System.out.println(r.perform(40));
		System.out.println(s.perform(45));
		System.out.println(y.perform(60));
		System.out.println(j.perform(60));
		System.out.println(sp.perform(25));
		System.out.println("##############");
		System.out.println(sb.perform(100));
	}

}
