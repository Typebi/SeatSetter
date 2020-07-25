import java.util.*;

public class SeatSetter {
	/* 사전정보 작성 */
	//1. 같이 해본 사람 리스트
	String[] 홍길동1  = {"홍길동18","홍길동20","홍길동2","홍길동3","홍길동12","홍길동14"}; 
	String[] 홍길동2  = {"홍길동6","홍길동16","홍길동1","홍길동3","홍길동11","홍길동20"};
	String[] 홍길동3  = {"홍길동14","홍길동2","홍길동1","홍길동9","홍길동16"};
	String[] 홍길동4  = {"홍길동15","홍길동5","홍길동9","홍길동19","홍길동18","홍길동8"};
	String[] 홍길동5  = {"홍길동15","홍길동4","홍길동12","홍길동18","홍길동8"};
	String[] 홍길동6  = {"홍길동2","홍길동16","홍길동18","홍길동7","홍길동13"};
	String[] 홍길동7  = {"홍길동12","홍길동13","홍길동10","홍길동17","홍길동6"};
	String[] 홍길동8  = {"홍길동9","홍길동10","홍길동13","홍길동18","홍길동4","홍길동15","홍길동5"};
	String[] 홍길동9  = {"홍길동8","홍길동10","홍길동4","홍길동19","홍길동3","홍길동16"};
	String[] 홍길동10	= {"홍길동9","홍길동8","홍길동7","홍길동17","홍길동19"};
	String[] 홍길동11  = {"홍길동19","홍길동17","홍길동20","홍길동14","홍길동2"};
	String[] 홍길동12  = {"홍길동7","홍길동13","홍길동5","홍길동15","홍길동1","홍길동14"};
	String[] 홍길동13  = {"홍길동12","홍길동7","홍길동8","홍길동6"};
	String[] 홍길동14  = {"홍길동3","홍길동11","홍길동20","홍길동12","홍길동1"};
	String[] 홍길동15  = {"홍길동5","홍길동4","홍길동12","홍길동18","홍길동8"};
	String[] 홍길동16  = {"홍길동2","홍길동6","홍길동18","홍길동9","홍길동3"};
	String[] 홍길동17  = {"홍길동11","홍길동19","홍길동7","홍길동10"};
	String[] 홍길동18  = {"홍길동1","홍길동20","홍길동6","홍길동16","홍길동4","홍길동5","홍길동8","홍길동15"};
	String[] 홍길동19 = {"홍길동11","홍길동17","홍길동9","홍길동4","홍길동10","홍길동17"};
	String[] 홍길동20 = {"홍길동18","홍길동1","홍길동11","홍길동14","홍길동2"};
	
	//2. 변수명->String 변환을 위해 배열과 이름(String)을 매칭
	HashMap<String, String[]> 맵 = new HashMap<String, String[]>(){{
		put("홍길동1", 홍길동1); put("홍길동2", 홍길동2); put("홍길동3", 홍길동3); put("홍길동4", 홍길동4);
		put("홍길동5", 홍길동5); put("홍길동6", 홍길동6); put("홍길동7", 홍길동7); put("홍길동8", 홍길동8);
		put("홍길동19", 홍길동19); put("홍길동20", 홍길동20); put("홍길동9", 홍길동9); put("홍길동10", 홍길동10);
		put("홍길동11", 홍길동11); put("홍길동12", 홍길동12); put("홍길동13", 홍길동13); put("홍길동14", 홍길동14);
		put("홍길동15", 홍길동15); put("홍길동16", 홍길동16); put("홍길동17", 홍길동17); put("홍길동18", 홍길동18);
	}};
	
	//3. 필요한 변수 선언
	ArrayList<String> 팀장명단 = new ArrayList<String>();
	ArrayList<String> 팀원명단 = new ArrayList<String>();
	ArrayList<ArrayList<String>> 팀목록 = new ArrayList<ArrayList<String>>();
	Random random = new Random();
	String 최초팀원, 팀장, 두번째팀원;
	int count;
	
	// 명단을 초기값으로 설정하기
	void set명단() {
		팀목록.clear();
		팀장명단.clear();
		팀원명단.clear();
		String list1[] = {"홍길동7","홍길동19","홍길동20","홍길동9","홍길동11","홍길동17"};
		for(String name : list1)
			팀장명단.add(name);
		String list2[] = {"홍길동1","홍길동2","홍길동3","홍길동4","홍길동5","홍길동6","홍길동8","홍길동10","홍길동12","홍길동13","홍길동14","홍길동15","홍길동16","홍길동18"};
		for(String name : list2)
			팀원명단.add(name);
		for(int i=0;i<7;i++)
			팀목록.add(new ArrayList<String>());
	}
	
	/*
	 * 1. 랜덤 팀원 1명 뽑기
	 * 2. 중복하지 않는 랜덤 팀장 뽑기
	 * 3. 중복하지 않는 마지막 팀원 뽑기
	 * 4. 중복 발생 시 다시 뽑기
	 * 5. 반드시 중복 발생하는 조합인 경우 처음부터 다시 뽑기
	 */
	void 팀구성하기() {
		전체리셋:while(true) {
			set명단();
			for(int n=0;n<6;n++) {
				최초팀원뽑기:while(true) {
					최초팀원 = 팀원명단.get(random.nextInt(팀원명단.size()));
					팀원명단.remove(최초팀원);
					break;
				}
				팀장뽑기:while(true) {
					팀장 = 팀장명단.get(random.nextInt(팀장명단.size()));
					for(String 해본팀원 : 맵.get(최초팀원))
						if(팀장.equals(해본팀원)) {
							if(count>=5000)
								continue 전체리셋;
							count++;
							continue 팀장뽑기;
						}
					팀장명단.remove(팀장);
					count = 0;
					break;
				}
				두번째팀원뽑기:while(true) {
					두번째팀원 = 팀원명단.get(random.nextInt(팀원명단.size()));
					for(String 해본팀원 : 맵.get(최초팀원))
						if(두번째팀원.equals(해본팀원)) {
							if(count>=5000)
								continue 전체리셋;
							count++;
							continue 두번째팀원뽑기;
						}
					for(String 해본팀원 : 맵.get(팀장))
						if(두번째팀원.equals(해본팀원)) {
							if(count>=5000)
								continue 전체리셋;
							count++;
							continue 두번째팀원뽑기;
						}
					팀원명단.remove(두번째팀원);
					count = 0;
					break;
				}
				팀목록.get(n).add(최초팀원);
				팀목록.get(n).add(팀장);
				팀목록.get(n).add(두번째팀원);
			}
			for(String 중복팀원 : 맵.get(팀원명단.get(0)))
				if(팀원명단.get(1).equals(중복팀원))
					continue 전체리셋;
			break;
		}
	}
	void 출력() {
		for(int i=0;i<6;i++) {
			System.out.print("팀"+(i+1)+" : ");
			for(int j=0;j<팀목록.get(i).size();j++)
				System.out.print(팀목록.get(i).get(j)+" ");
			System.out.println("");
		}
		System.out.println("팀7 : "+팀원명단.get(0)+" "+팀원명단.get(1));
	}
	public static void main(String args[]) {
		SeatSetter s = new SeatSetter();
		s.팀구성하기();
		s.출력();
	}
}
