package sample;

	public class SplitString {  
	    public static void main(String args[]) {  
	    	
	    	//split each word in a string
	        String a = "java is a programming language";
	        a=a.trim();
	        String b[]=a.split(" ",a.length());
	        for (String b1:b)
	        {
	        System.out.println(b1);
	        }
	        
	        //Toggle each word in a string
	        String toggStr ="java is high level language";
	        toggStr=toggStr.trim();
	        String afterTogg="";
	        String toggStrarr[]=toggStr.split(" ",toggStr.length());
	        for(int i=0;i<toggStrarr.length;i++)
	        {
	        	for(int j=0;j<toggStrarr[i].length();j++)
	        	{
	        	if(j%2==0)
	        	afterTogg+=String.valueOf(toggStrarr[i].charAt(j)).toUpperCase();
	        	else
	        	afterTogg+=String.valueOf(toggStrarr[i].charAt(j)).toLowerCase();
	        	}
	        	
	        System.out.println(afterTogg);	
	        afterTogg="";
	        }
	        
	    }  
	}  
