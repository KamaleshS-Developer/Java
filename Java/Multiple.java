interface Features{
	void dailing();	
	void messaging();
}

interface Addons{
	void v_calling();	
	void mms();
}

class Phone implements Features,Addons{
	public void dailing(){
		System.out.println(" Featured Phone is dailing.......");
	}
	public void messaging(){
		System.out.println(" Featured Phone is sending message.......");
	}
	public void v_calling(){
		System.out.println(" Featured Phone is in video call.......");
	}
	public void mms(){
		System.out.println(" Featured Phone is sending MMS.......");
	}
}

class Multiple{
	public static void main(String args[]){
		Phone ph = new Phone();
		ph.dailing();
		ph.messaging();
		ph.v_calling();
		ph.mms();
	}
}