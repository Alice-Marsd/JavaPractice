package longestCommonPrefix;

public class Main {
	public String longestCommonPrefix(String[] strs) {
          
        String a="";
        
        try {
			a=strs[0];
			for (String str1 : strs) {
				if(a=="") return a;
				while(!str1.startsWith(a))
				{
					a=a.substring(0, a.length()-1);
				}
			}
		} catch (Exception e) {
			return a;
		}
        return a;
    }
	public static void main(String[] args) {
		
	}

}
