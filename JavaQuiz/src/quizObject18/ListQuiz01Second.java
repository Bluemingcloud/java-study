package quizObject18;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01Second {

	public static void main(String[] args) {
		
		/*
		 1. 숫자를 저장하는 리스트를 만들고, 1 ~ 20 까지 값을 순서대로 저장
		 
		 2. UserVO를 저장할 수 있는 리스트를 만들고, User 객체 3개 저장
		 
		 3. 2번에 저장된 list안에, 이름과 나이를 반복문으로 전부 출력.
		 
		 4. 2번에 저장된 list안에, "홍길동" 이 있다면, 홍길동 객체의 이름과 나이를 출력
		 
		 5. 2번에 저장된 list안에, "홍길동" 이 있다면, 홍길동 객체를 삭제.
		 
		 */

		
		List<Integer> list1 = new ArrayList<>();
		for(int i = 1; i <= 20; i++) {
			list1.add(i);
		}
		System.out.println(list1.toString());
		
		List<UserVO> userList = new ArrayList<UserVO>();
		userList.add(new UserVO("홍길동", 20));
		userList.add(new UserVO("김길동", 30));
		userList.add(new UserVO("홍길자", 30));
		
		for(int i = 0; i < userList.size(); i++) {
			String name = userList.get(i).getName();
			int age = userList.get(i).getAge();
			System.out.println("이름 : " + name + ", 나이 : " + age);
		}
		
		for(UserVO user : userList) {
			if(user.getName().equals("홍길동")) {
				System.out.println(user.getName() + " 데이터는 리스트에 있습니다.");
				System.out.println("이름 : " + user.getName() + ", 나이 : " + user.getAge());
				break;
			}			
		}
		
		int i = -1;
		while(i++ < userList.size()) {
			if(userList.get(i).getName().equals("홍길동")) {
				System.out.println(userList.remove(i).getName() + " 의 데이터는 삭제 되었습니다.");
				break;
			}
		}
		
	}
//	private static boolean findName(List<UserVO> list, String name, String chk) {
//		for(int i = 0; i < list.size(); i++) {
//			String name = list.get(i).getName();
//			int age = userList.get(i).getAge();
//			System.out.println("이름 : " + name + ", 나이 : " + age);
//		}
//		
//	}
	
}
