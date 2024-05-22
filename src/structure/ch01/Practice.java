package structure.ch01;

public class Practice {

	int [] intArr;
	int count; // 배열안에 들어간 요소의 갯수
	public final int ARRAY_SIZE; // 배열의 크기
	public static final int ERROR_NUM = -999999999;
	
	public Practice() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	public Practice(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[ARRAY_SIZE];
	}
	
	// 기능 설계
	// 배열 요소에 제일 뒤에 값을 추가하는 기능을 가진다.
	public void addElement(int inputData) {
		// 방어적 코드 필요
		if(count >= ARRAY_SIZE) {
			System.out.println("메모리 공간이 가득 찼습니다.");
			return; // 실행의 제어권을 반납
		}
		intArr[count] = inputData;
		count++;
	}
	
	// 지정한 인덱스 번호에 요소를 꺼내 주기
	public int getElement(int position) {
		// 배열에 크기 10
		// [0] [1] [2] --> 3
		if (position < 0 || position > count -1) {
			System.out.println("검색 위치 오류. 현재 리스트의 갯수는 " + count + "개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	// 요소를 전체 출력하는 기능 만들어 주기
	public void printAll() {
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	// 요소를 전부 삭제하는 기능 만들어주기
	public void removeAll() {
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = 0;
		}
		// 요소에 갯수 상태를 항상 관리하고 처리해야한다.
		count = 0;
	}
	
	// 배열에 크기가 아닌 현재 요소갯수를 반환
	public int getCountSize() {
		return count;
	}
	
	// 만약 비어있으면 true 반환
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// 배열의 지정한 인덱스 위치에 값을 삽입 하기
	public void insertElement(int position, int inputData) {
		
		// 방어적 코드 1
		if (count >= ARRAY_SIZE) { // 만약 배열공간보다 요소갯수가 더 많으면 출력
			System.out.println("메모리 공간이 가득 찼습니다.");
			return;
		}
		
		// 방어적 코드 2
		if (position < 0 || ARRAY_SIZE < position) { // 지정한 인덱스번호가 범위를 벗어남
			System.out.println("지정한 인덱스 번호가 잘못 되었습니다");
			return;
		}
		// 요청값 : position -> 3
		// [11,12,13,14,15]
		// [11,12,13,[],14,15]
		for (int i = count - 1; i >= position; i--) {
			intArr[i + 1] = intArr[i]; // 하나씩
			// intArr[5] = 15; 수행 1
			// intArr[4] = 14; 수행 2
		}
		intArr[position] = inputData;
		count++;
	}
	
	// 지정한 인덱스 번호에 요소를 삭제하기
	public void removeElement(int position) {
		
		if(isEmpty()) {
			System.out.println("삭제 할 요소가 없습니다");
		}
		
		// 인덱스 범위를 잘못 지정했다면 방어적 코드
		if(position < 0 || position >= count) {
			System.out.println("잘못된 요청 입니다.");
		}
		// intArr[position]; --> 사용자가 요청한 인덱스는 0번이라고 가정.
		// [100] [200] [300] [400]
		// [200] [300] [400] [] : 한 칸씩 앞으로 이동
		for (int i = position; i < count - 1; i++) {
			// 0
			// 0 + 1
			intArr[i] = intArr[i + 1];
		}
		count--;
	}
	
	public static void main(String[] args) {
		Practice practice = new Practice();
		practice.addElement(1);
		System.out.println(practice.getElement(0));
		practice.removeElement(0);
		practice.printAll();
		practice.insertElement(3, 5);
		practice.printAll();
	}
}
