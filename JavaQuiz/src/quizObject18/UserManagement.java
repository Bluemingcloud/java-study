package quizObject18;

import java.util.ArrayList;
import java.util.List;

public class UserManagement implements IUserManagement {
	
	// 메서드
	private List<UserVO> list = new ArrayList<UserVO>();
	
	public List<UserVO> getList() {
		return list;
	}
	
	// 회원 정보 추가
	@Override
	public void insert(String name, int age) {
		this.list.add(new UserVO(name, age));
	}
	
	// 회원 정보 출력
	@Override
	public void printList()	{
		System.out.println("2. 회원 전체보기");
		
		// 향상된 for문으로 회원 정보 출력 반복
		for(UserVO user :this.list) {
			System.out.println("이름 : " + user.getName() + ", 나이 : " + user.getAge());
		}		
	}
	
	// 회원 정보 검색
	@Override
	public boolean search(String name) {
		boolean flag = true;
		for(UserVO user : list) {
			// 이름과 일치하면 정보 출력
			if(user.getName().equals(name)) {
				System.out.println("이름 : " + user.getName() + ", 나이 : " + user.getAge());
				// 일치하는 이름이 있으므로 flag = false;
				flag = false;				
			}
		}
		return flag;
	}
	
	// 회원 정보 삭제
	@Override
	public boolean delete(String name) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
			// 일치하는 이름이 있으면 remove
				list.remove(i);
				System.out.println(name + "님의 정보가 삭제되었습니다.");
				return false;
			}
		}
		return true;
	}
	

}
