package api1_Object;

import java.util.*;

class Aa {
	String name;
	
	public Aa(String name) {
		this.name = name;
	}
}

class Bb {
	String name;
	
	public Bb(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((Bb)obj).name) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}

// hashCode 와 equals 로 비교한 데이터가 같으면 그 데이터가 같은 거다
public class T1_hashCode2 {
	public static void main(String[] args) {
		// HashMap
		// 키(key)가 절대로 중복될 수 없다
		// k = key, v = value
		
		// 제너릭
		// 타입을 주고 그에 맞는 키와 밸류를 주게되어있음

//		HashMap<Integer, String> map = new HashMap<Integer, String>(); 뒤에 <> 안에 있는 건 지워도됨
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "데이터1");
		map.put(1, "데이터2");	// 키가 같아서 1키에 밸류를 덮어씀		
		map.put(2, "데이터3");		
		System.out.println(map);
		// map 형식은 순서와 관계없다
		
		HashMap<Aa, String> map2 = new HashMap<>();
		map2.put(new Aa("첫번째"), "데이터1");
		map2.put(new Aa("첫번째"), "데이터2");
		map2.put(new Aa("두번째"), "데이터3");
		System.out.println(map2);
		
		HashMap<Bb, String> map3 = new HashMap<>();
		map3.put(new Bb("첫번째"), "데이터1");
		map3.put(new Bb("첫번째"), "데이터2");
		map3.put(new Bb("두번째"), "데이터3");
		System.out.println(map3);
	}
}
