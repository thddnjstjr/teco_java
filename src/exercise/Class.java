package exercise;

public class Class {
	
	
	public static void main(String[] args) {
		class Friend
		{
			String name;
			int age;
			
			Friend(String name,int age){
				this.name = name;
				this.age = age;
			}
			void hello() {
				System.out.println("Hello");
			}
			void printFriend() {
				this.hello();
				System.out.println("name : " + this.name + ",age : " + this.age);
			}
		}
	}
}
