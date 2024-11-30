public class ReverseString
{
	public String reverseWords(String s){
	int i = s.length()-1;
	String ans = "";
	while(i>=0){
		
		while(i>=0 && s.charAt(i) == ' ')i--;
		
		int j=i;
		
		while(i>=0 && s.charAt(i) != ' ')i--;
		if(ans.isEmpty()){
			ans = ans.concat(s.substring(i+1,j+1));
			}
		else{
			ans = ans.concat(" "+ s.substring(i+1,j+1));
			}
	}
	return ans;
	}
	 public static void main(String[] args) {
        ReverseString rs = new ReverseString(); 
        String input = "sanket patil";
        String result = rs.reverseWords(input); 
        System.out.println("Reversed words: " + result); 
    }
}
