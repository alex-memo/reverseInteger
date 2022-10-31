
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-645));//replace -645 with the desired number
	}
	public static int reverse(int x) {
		String temp=Integer.toString(x);
        String s="";
        boolean isInvert=false;
        int i=temp.length();
        while(i>0){
        	char j=temp.charAt(i-1);
        	if(j=='0'||j=='1'||j=='2'||j=='3'||j=='4'||j=='5'||j=='6'||j=='7'||j=='8'||j=='9') {
        		s+=j;
        	}
        	else if(j=='-') {
        		isInvert=true;
        	}
            
            i--;
        }
        
        if(isInvert) {
        	 s="-"+s;
        }
        try {
        	int ret=Integer.parseInt(s);
        	return ret;
        }
        catch(Exception e) {
        	return 0;
        }
    }

}
