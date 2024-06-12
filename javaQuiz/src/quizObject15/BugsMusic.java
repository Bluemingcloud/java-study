package quizObject15;

public class BugsMusic implements SongList {
	
	private String[] list;
	private int count;
	
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로 작성.
	 */
	public BugsMusic() {
		System.out.println("벅스뮤직의 플레이리스트 입니다.");
		list = new String[100];
		count = 0;
	}
		
	@Override
	public void insertList(String song) {
		list[count] = song;
		count++;
	}
	@Override
	public void playList() {
		for(int i = 0; i < count; i++) {
			System.out.println("[벅스뮤직] " + list[i] + " 재생");
		}
	}
	@Override
	public int playLength() {
		return count;
	}
	
}
