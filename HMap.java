import java.util.*;

public class HMap
{
    public static void main(String args[])
    {
        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        hm.put(100,"Sanju");
        hm.put(101,"Saanju");
        System.out.println(hm.entrySet());

        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
