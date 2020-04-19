package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import sun.print.resources.serviceui;

public class StreamApi {

	static List<Student> list = new ArrayList<Student>();	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		list.add(new Student(1,"Arun","3333"));
		list.add(new Student(2,"Jayesh","2222"));
		list.add(new Student(3,"Dhruv","3333"));
		list.add(new Student(4,"Random","4444"));
		
//		System.out.println(getIdOfStudentWithThisName("Dhruv"));
//		System.out.println(getNamesOfStudentWithThisId(3));
//		getNameOfStudentWithThisMobNum("3333");
//		getNameOfStudentWithThisMobNums("2222","4444");
//		convertToHashMap();
//		convertToList();
//		changeNameToUpperCase();
//		flatMap();
//		sortListByName();
//		printEnum();
		
        String csv = "0508935;0508935031;0508935031099;099:254;hm-us:15,hm-canada:2;;hm-sweden:T,hm-greatbritain:T,hm-ireland:T,hm-denmark:T,hm-france:T,hm-italy:T,hm-spain:T,hm-norway:T,hm-china:T,hm-portugal:T,hm-us:F,hm-canada:F,hm-belgium:T,hm-poland:T,hm-czech:T,hm-slovakia:T,hm-hungary:T,hm-romania:T,hm-bulgaria:T,hm-switzerland:T,hm-russia:T,hm-netherlands:T,hm-japan:T,hm-austria:T,hm-mexico:T,hm-korea:T,hm-finland:T,hm-germany:T,hm-turkey:T,hm-europe:T,hm-asia1:T,hm-asia3:T,hm-asia2:T,hm-asia4:T,hm-asia5:T;hm-sweden:07,hm-greatbritain:06,hm-ireland:,hm-denmark:07";
        Map<Integer, String> map = new HashMap<Integer, String>();

        populateData(csv, map);
      map.forEach((key,value) -> System.out.println(key + " . " + value));
    } 

	private static void printEnum() {
		// TODO Auto-generated method stub
		String a = Status.ONE.toString();
		System.out.println(a);
	}

	private static void flatMap() {
		// TODO Auto-generated method stub
//		list.stream().map(s -> s.getMobNum()).
	}

	private static void sortListByName() {
		// TODO Auto-generated method stub
		list.stream().map(s -> s.getName()).sorted().forEach(s -> System.out.println(s));
	}

	private static void changeNameToUpperCase() {
		// TODO Auto-generated method stub
		list.stream().map(s -> s.getName().toUpperCase()).collect(Collectors.toList()).forEach(s -> System.out.println(s));
	}

	private static void convertToList() {
		// TODO Auto-generated method stub
		List<String> nameList = new ArrayList<>();
		nameList = list.stream().map(s -> s.getName()).collect(Collectors.toList());
		String out = String.join(",", nameList);
		System.out.println(out);
//		nameList.forEach(n -> System.out.println(n));
	}

	private static void convertToHashMap() {
		// TODO Auto-generated method stub
//		list.stream().collect(Collectors.toMap(p -> p., valueMapper))
//		hm = list.stream().collect(Collectors.toMap(Student::getId,Student::getName));
		list.stream().collect(Collectors.toMap(s->s.getId(),s->s.getName())).forEach((key,value) -> System.out.println(key + " . " + value));
		
	}

	private static void getNameOfStudentWithThisMobNums(String num1, String num2) {
		// TODO Auto-generated method stub
		list.stream().filter(s -> s.getMobNum().equals(num1) || s.getMobNum().equals(num2)).forEach(s -> System.out.println(s.getName()));
	}

	private static void getNameOfStudentWithThisMobNum(String mobNum) {
		// TODO Auto-generated method stub
		list.stream().filter(s -> s.getMobNum().equals(mobNum)).collect(Collectors.toList()).forEach(s -> System.out.print(s.getName() + " "));
	}

	private static String getNamesOfStudentWithThisId(int i) {
		// TODO Auto-generated method stub
		Optional<Student> student = list.stream().filter(s -> s.getId() == i).findFirst();
		return student.isPresent() ? student.get().getName() : "ID " + i + "is not present";
	}

	private static String getIdOfStudentWithThisName(String name) {
		// TODO Auto-generated method stub
		Optional<Student> student = list.stream().filter(s -> s.getName().equals(name)).findFirst();
		return student.isPresent() ? String.valueOf(student.get().getId()) : (name + " is not present");
	}

	private static void populateData(final String csv, Map<Integer, String> map) {
        // TODO Auto-generated method stub
        String[] csvArray = csv.split(";", -1);
        List<String> items = Arrays.asList(csvArray);
        map.putAll(items.stream().collect(Collectors.toMap(s->items.indexOf(s), s->s)));
    }
}
