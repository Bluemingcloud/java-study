package baekjoon.problem01;

import java.util.Scanner;

public class Problem2480 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int money = 0;
		
//		int[] count = new int[7];
//
//        count[num1]++;
//        count[num2]++;
//        count[num3]++;
		// count 배열은 7칸 비어있는 값은 0으로 되어있다.
		// 7칸인 이유 	-> 배열의 인덱스는 0 부터 시작. 
		//				-> 주사위 6개의 숫자를 인덱스로 사용하기 위해 1부터 6까지의 공간 필요
		// 				-> 0 부터 6 까지의 공간이 있는 배열 new int[7] 을 사용
		// count = [0 0 0 0 0 0 0]
		// count[num1] 은 배열 count 의 num1 번째 항목을 의미
		// count[num1]++; ++ 를 해서 해당 번째의 값을 1씩 증가. 
		//				-> 즉 몇개의 주사위를 던지던 해당 값이 몇 번 나왔는지 카운트 가능
		//
		// 배열을 사용하여 num의 값을 카운트하고, 최대 num이 무엇인지, 상금계산 까지 하나의 메소드로 사용 가능
		// 
		// 위의 배열식을 가지고 다시 코드 짜보기.
		
		switch (isDuplicate(num1,num2,num3)) {
			case 1:
				money = isMax(num1,num2,num3)*100;
				break;
			case 2:
				money = num2*100 + 1000;
				break;
			case 3:
				money = num1*100 + 1000;
				break;
			case 4:
				money = num1*1000 + 10000;
				break;
		}
		System.out.println(money);
		scan.close();
	}
	
	public static int isDuplicate(int numFirst,int numSecond,int numThird) {
		if (numFirst == numSecond & numFirst == numThird) {
			return 4;
		} else if (numFirst == numSecond | numFirst==numThird | numSecond == numThird) {
			if (numFirst == numSecond) {
				return 3;
			} else if (numFirst == numThird) {
				return 3;
			} else {
				return 2;
			}
		} else {
			return 1;
		}
	}

	public static int isMax (int max1, int max2, int max3) {
		int maxNum = max1;
		if (max2 > maxNum) {
			maxNum = max2;
		}
		if (max3 > maxNum) {
			maxNum = max3;
		}
		return maxNum;
	}
	
}
//int money = calculatePrize(count);
//System.out.println(money);
//scan.close();
//}
//
//public static int calculatePrize(int[] count) {
//int max = 0;
//int duplicateCount = 0;
//for (int i = 1; i < count.length; i++) {
//    if (count[i] == 3) // 세 개가 모두 같은 숫자
//        return i * 1000 + 10000;
//    else if (count[i] == 2) { // 두 개가 같은 숫자
//        duplicateCount++;
//        max = i;
//    }
//    else if (count[i] == 1) // 모두 다른 숫자
//        max = i;
//}
//if (duplicateCount == 1) // 두 개가 같은 숫자가 하나만 있는 경우
//    return max * 100 + 1000;
//else // 모두 다른 숫자
//    return max * 100;
//}
//}


