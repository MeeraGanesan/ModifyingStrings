public class modifyString
{
    public String mainstr;
    public modifyString(String s)
    {
        mainstr=s;
    }
    public String addString(int i,String s)
    {
        String s1=mainstr.substring(0,i);
        String s2=mainstr.substring(i+1);
        mainstr=s1+s+s2;
        return mainstr;
    }
    public String replaceString(String ori,String repl)
    {
        int n=mainstr.indexOf(ori);
        String s1=mainstr.substring(0,n);
        String s2=mainstr.substring(n+ori.length());
        mainstr=s1+repl+s2;
        return mainstr;
    }
    public String deleteString(String ori)
    {
        mainstr=mainstr.replaceAll(ori,"");
        return mainstr;
    }
}