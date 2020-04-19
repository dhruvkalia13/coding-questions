package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sun.xml.internal.ws.util.StringUtils;

public class Java8 {

	class Person{
		int id;
		String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Person(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3};
		int[] b = a;
		System.out.println(a.equals(b));
		List<Person> persons = new ArrayList<Person>();
		Java8 obj = new Java8();
		persons.add(obj.new Person(1,"Dhruv"));
		persons.add(obj.new Person(2,"Kalia"));
		persons.add(obj.new Person(3,"Dhruv Kalia"));
		Map<Integer, String> hm = new HashMap<>();
		
		hm = persons.stream().collect(Collectors.toMap(Person::getId,Person::getName));
		hm.forEach((key,value) -> {System.out.println(key + " "+ value);});
//		hm = persons.stream().collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
//		plist.stream().flatMap(person -> person.getId())
		List<Integer> ls = new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
//		ls.stream().map(x -> x * 2).collect(Collectors.toList()).forEach(item -> System.out.println(item));
	}

}
