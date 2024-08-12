package programmers.level1Page03;

public class Problem17681 {
	
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
        	String str = Integer.toBinaryString(arr1[i] | arr2[i]);
        	answer[i] = String.format("%" + n + "s", str).replace("1", "#").replace("0", " ");
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		
    	System.out.println(Integer.toBinaryString(19));
    	System.out.println(Integer.toBinaryString(14));
    	System.out.println(Integer.toBinaryString(10));
    	//101110      011011
    	//100001      111000
    	//100001      010011
    	//010110	  001110
    	//011111	  001110
    	//110010	  001010
    	
    	// 111111
    	// 111001
    	// 110011
    	// 011110
    	// 011111
    	// 111010
	}

}
