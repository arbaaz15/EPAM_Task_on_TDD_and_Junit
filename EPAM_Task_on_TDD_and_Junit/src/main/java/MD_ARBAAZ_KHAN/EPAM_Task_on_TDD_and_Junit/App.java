package MD_ARBAAZ_KHAN.EPAM_Task_on_TDD_and_Junit;

public class App 
{
    public String checkstring(String str)
    {
    	if(str.charAt(0)=='A' && str.charAt(1)!='A')
    	{
    		return str.substring(1,str.length());
    	}
    	
    	if(str.charAt(0)!='A' && str.charAt(1)=='A')
    	{
    		return str.charAt(0)+str.substring(2,str.length());
    	}
    	if(str.charAt(0)=='A' && str.charAt(1)=='A')
    	{
    		return str.substring(2,str.length());
    	}
    	else 
    		return str;
    	
    }
	
	
	
}
