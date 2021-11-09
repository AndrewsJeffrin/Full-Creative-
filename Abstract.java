abstract class Address{
	abstract void homeAddress();
}

class Intern extends Address{
	void homeAddress(){
		System.out.print("I'm from Madurai");
	}
}
class Mentor extends Address{
	 void homeAddress(){
		System.out.print("I'm from Vellore");
	}
}

class Abstract
{ 
    public static void main(String args[]) 
    { 
     	Address obj1= new Intern();
	Address obj2= new Mentor(); 
	obj1.homeAddress();
	obj2.homeAddress();        
    } 
}