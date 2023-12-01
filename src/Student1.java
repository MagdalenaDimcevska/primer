
public class Student1 {
	int id;
	String ime;
	Student1(int i,String n){
	id=i;
	ime=n;}
	void display() {
	System.out.println(id + " " + ime);}
	public static void main(String[] args) {
		Student1 s1=new Student1 (111,"Petar");
			Student1 s2=new Student1 (222,"Marko");
s1.display();
s2.display();
		}
	}