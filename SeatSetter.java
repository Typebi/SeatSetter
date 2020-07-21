import java.util.*;

public class SeatSetter {
	/* »çÀüÁ¤º¸ ÀÛ¼º */
	//1. °°ÀÌ ÇØº» »ç¶÷ ¸®½ºÆ®
	String[] È«±æµ¿1  = {"È«±æµ¿18","¼Û½ÂÈÆ","È«±æµ¿2","È«±æµ¿3","È«±æµ¿12","È«±æµ¿14"}; 
	String[] È«±æµ¿2  = {"È«±æµ¿6","È«±æµ¿16","È«±æµ¿1","È«±æµ¿3","È«±æµ¿11","È«±æµ¿20"};
	String[] È«±æµ¿3  = {"È«±æµ¿14","È«±æµ¿2","È«±æµ¿1","È«±æµ¿9","È«±æµ¿16"};
	String[] È«±æµ¿4  = {"È«±æµ¿15","È«±æµ¿5","È«±æµ¿9","È«±æµ¿19","È«±æµ¿18","È«±æµ¿8"};
	String[] È«±æµ¿5  = {"È«±æµ¿15","È«±æµ¿4","È«±æµ¿12","È«±æµ¿18","È«±æµ¿8"};
	String[] È«±æµ¿6  = {"È«±æµ¿2","È«±æµ¿16","È«±æµ¿18","È«±æµ¿7","È«±æµ¿13"};
	String[] È«±æµ¿7  = {"È«±æµ¿12","È«±æµ¿13","È«±æµ¿10","È«±æµ¿17","È«±æµ¿6"};
	String[] È«±æµ¿8  = {"È«±æµ¿9","È«±æµ¿10","È«±æµ¿13","È«±æµ¿18","È«±æµ¿4","È«±æµ¿15","È«±æµ¿5"};
	String[] È«±æµ¿9  = {"È«±æµ¿8","È«±æµ¿10","È«±æµ¿4","È«±æµ¿19","È«±æµ¿3","È«±æµ¿16"};
	String[] È«±æµ¿10	= {"È«±æµ¿9","È«±æµ¿8","È«±æµ¿7","È«±æµ¿17","È«±æµ¿19"};
	String[] È«±æµ¿11  = {"È«±æµ¿19","È«±æµ¿17","È«±æµ¿20","È«±æµ¿14","È«±æµ¿2"};
	String[] È«±æµ¿12  = {"È«±æµ¿7","È«±æµ¿13","È«±æµ¿5","È«±æµ¿15","È«±æµ¿1","È«±æµ¿14"};
	String[] È«±æµ¿13  = {"È«±æµ¿12","È«±æµ¿7","È«±æµ¿8","È«±æµ¿6"};
	String[] È«±æµ¿14  = {"È«±æµ¿3","È«±æµ¿11","È«±æµ¿20","È«±æµ¿12","È«±æµ¿1"};
	String[] È«±æµ¿15  = {"È«±æµ¿5","È«±æµ¿4","È«±æµ¿12","È«±æµ¿18","È«±æµ¿8"};
	String[] È«±æµ¿16  = {"È«±æµ¿2","È«±æµ¿6","È«±æµ¿18","È«±æµ¿9","È«±æµ¿3"};
	String[] È«±æµ¿17  = {"È«±æµ¿11","È«±æµ¿19","È«±æµ¿7","È«±æµ¿10"};
	String[] È«±æµ¿18  = {"È«±æµ¿1","È«±æµ¿20","È«±æµ¿6","È«±æµ¿16","È«±æµ¿4","È«±æµ¿5","È«±æµ¿8","È«±æµ¿15"};
	String[] È«±æµ¿19 = {"È«±æµ¿11","È«±æµ¿17","È«±æµ¿9","È«±æµ¿4","È«±æµ¿10","È«±æµ¿17"};
	String[] È«±æµ¿20 = {"È«±æµ¿18","È«±æµ¿1","È«±æµ¿11","È«±æµ¿14","È«±æµ¿2"};
	
	//2. º¯¼ö¸í->String º¯È¯À» À§ÇØ ¹è¿­°ú ÀÌ¸§(String)À» ¸ÅÄª
	HashMap<String, String[]> ¸Ê = new HashMap<String, String[]>(){{
		put("È«±æµ¿1", È«±æµ¿1); put("È«±æµ¿2", È«±æµ¿2); put("È«±æµ¿3", È«±æµ¿3); put("È«±æµ¿4", È«±æµ¿4);
		put("È«±æµ¿5", È«±æµ¿5); put("È«±æµ¿6", È«±æµ¿6); put("È«±æµ¿7", È«±æµ¿7); put("È«±æµ¿8", È«±æµ¿8);
		put("È«±æµ¿19", È«±æµ¿19); put("È«±æµ¿20", È«±æµ¿20); put("È«±æµ¿9", È«±æµ¿9); put("È«±æµ¿10", È«±æµ¿10);
		put("È«±æµ¿11", È«±æµ¿11); put("È«±æµ¿12", È«±æµ¿12); put("È«±æµ¿13", È«±æµ¿13); put("È«±æµ¿14", È«±æµ¿14);
		put("È«±æµ¿15", È«±æµ¿15); put("È«±æµ¿16", È«±æµ¿16); put("È«±æµ¿17", È«±æµ¿17); put("È«±æµ¿18", È«±æµ¿18);
	}};
	
	//3. ÇÊ¿äÇÑ º¯¼ö ¼±¾ð
	ArrayList<String> ÆÀÀå¸í´Ü = new ArrayList<String>();
	ArrayList<String> ÆÀ¿ø¸í´Ü = new ArrayList<String>();
	ArrayList<ArrayList<String>> ÆÀ¸ñ·Ï = new ArrayList<ArrayList<String>>();
	Random random = new Random();
	String ÃÖÃÊÆÀ¿ø, ÆÀÀå, µÎ¹øÂ°ÆÀ¿ø;
	int count;
	
	// ¸í´ÜÀ¸·Î ÃÖÃÊ ¼³Á¤À¸·Î ¸®¼ÂÇÏ±â
	void set¸í´Ü() {
		ÆÀ¸ñ·Ï.clear();
		ÆÀÀå¸í´Ü.clear();
		ÆÀ¿ø¸í´Ü.clear();
		String list1[] = {"È«±æµ¿7","È«±æµ¿19","È«±æµ¿20","È«±æµ¿9","È«±æµ¿11","È«±æµ¿17"};
		for(String name : list1)
			ÆÀÀå¸í´Ü.add(name);
		String list2[] = {"È«±æµ¿1","È«±æµ¿2","È«±æµ¿3","È«±æµ¿4","È«±æµ¿5","È«±æµ¿6","È«±æµ¿8","È«±æµ¿10","È«±æµ¿12","È«±æµ¿13","È«±æµ¿14","È«±æµ¿15","È«±æµ¿16","È«±æµ¿18"};
		for(String name : list2)
			ÆÀ¿ø¸í´Ü.add(name);
		for(int i=0;i<7;i++)
			ÆÀ¸ñ·Ï.add(new ArrayList<String>());
	}
	
	/*
	 * 1. ·£´ý ÆÀ¿ø 1¸í »Ì±â
	 * 2. Áßº¹ÇÏÁö ¾Ê´Â ·£´ý ÆÀÀå »Ì±â
	 * 3. Áßº¹ÇÏÁö ¾Ê´Â ¸¶Áö¸· ÆÀ¿ø »Ì±â
	 * 4. Áßº¹ ¹ß»ý ½Ã ´Ù½Ã »Ì±â
	 * 5. ¹Ýµå½Ã Áßº¹ ¹ß»ýÇÏ´Â Á¶ÇÕÀÎ °æ¿ì Ã³À½ºÎÅÍ ´Ù½Ã »Ì±â
	 */
	void ÆÀ±¸¼ºÇÏ±â() {
		ÀüÃ¼¸®¼Â:while(true) {
			set¸í´Ü();
			for(int n=0;n<6;n++) {
				ÃÖÃÊÆÀ¿ø»Ì±â:while(true) {
					ÃÖÃÊÆÀ¿ø = ÆÀ¿ø¸í´Ü.get(random.nextInt(ÆÀ¿ø¸í´Ü.size()));
					ÆÀ¿ø¸í´Ü.remove(ÃÖÃÊÆÀ¿ø);
					break;
				}
				ÆÀÀå»Ì±â:while(true) {
					ÆÀÀå = ÆÀÀå¸í´Ü.get(random.nextInt(ÆÀÀå¸í´Ü.size()));
					for(String ÇØº»ÆÀ¿ø : ¸Ê.get(ÃÖÃÊÆÀ¿ø))
						if(ÆÀÀå.equals(ÇØº»ÆÀ¿ø)) {
							if(count>=5000)
								continue ÀüÃ¼¸®¼Â;
							count++;
							continue ÆÀÀå»Ì±â;
						}
					ÆÀÀå¸í´Ü.remove(ÆÀÀå);
					count = 0;
					break;
				}
				µÎ¹øÂ°ÆÀ¿ø»Ì±â:while(true) {
					µÎ¹øÂ°ÆÀ¿ø = ÆÀ¿ø¸í´Ü.get(random.nextInt(ÆÀ¿ø¸í´Ü.size()));
					for(String ÇØº»ÆÀ¿ø : ¸Ê.get(ÃÖÃÊÆÀ¿ø))
						if(µÎ¹øÂ°ÆÀ¿ø.equals(ÇØº»ÆÀ¿ø)) {
							if(count>=5000)
								continue ÀüÃ¼¸®¼Â;
							count++;
							continue µÎ¹øÂ°ÆÀ¿ø»Ì±â;
						}
					for(String ÇØº»ÆÀ¿ø : ¸Ê.get(ÆÀÀå))
						if(µÎ¹øÂ°ÆÀ¿ø.equals(ÇØº»ÆÀ¿ø)) {
							if(count>=5000)
								continue ÀüÃ¼¸®¼Â;
							count++;
							continue µÎ¹øÂ°ÆÀ¿ø»Ì±â;
						}
					ÆÀ¿ø¸í´Ü.remove(µÎ¹øÂ°ÆÀ¿ø);
					count = 0;
					break;
				}
				ÆÀ¸ñ·Ï.get(n).add(ÃÖÃÊÆÀ¿ø);
				ÆÀ¸ñ·Ï.get(n).add(ÆÀÀå);
				ÆÀ¸ñ·Ï.get(n).add(µÎ¹øÂ°ÆÀ¿ø);
			}
			for(String Áßº¹ÆÀ¿ø : ¸Ê.get(ÆÀ¿ø¸í´Ü.get(0)))
				if(ÆÀ¿ø¸í´Ü.get(1).equals(Áßº¹ÆÀ¿ø))
					continue ÀüÃ¼¸®¼Â;
			break;
		}
	}
	void Ãâ·Â() {
		for(int i=0;i<6;i++) {
			System.out.print("ÆÀ"+(i+1)+" : ");
			for(int j=0;j<ÆÀ¸ñ·Ï.get(i).size();j++)
				System.out.print(ÆÀ¸ñ·Ï.get(i).get(j)+" ");
			System.out.println("");
		}
		System.out.println("ÆÀ7 : "+ÆÀ¿ø¸í´Ü.get(0)+" "+ÆÀ¿ø¸í´Ü.get(1));
	}
	public static void main(String args[]) {
		SeatSetter s = new SeatSetter();
		s.ÆÀ±¸¼ºÇÏ±â();
		s.Ãâ·Â();
	}
}
