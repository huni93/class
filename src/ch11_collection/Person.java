package ch11_collection;

public class Person implements Comparable<Person> {
       String name;
       int age;
       public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;	
	}
    @Override
    public boolean equals(Object obj) {
    	Person p = (Person) obj;
    	return name.equals(p.name) && age == p.age;
    }   
    @Override
    public int hashCode() {
    	// TODO Auto-generated method stub
    	return name.hashCode() + age;
    }
    @Override
	public int compareTo(Person o) {		
		//return (age-o.age); 나이순대로
    	return (name.compareTo(o.name)); //이름순대로
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	     
}
