import java.io.*;
import java.util.*;

class Sports
{
    String getName()
    {
        return "Generic Sports";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println("Each team has n players in " + getName());
    }
}
class Soccer extends Sports
{
    String getName()
    {
        return "Soccer Class";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class ptc
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Sports sp1 = new Sports();
        Sports sp2 = new Soccer();
        System.out.println(sp1.getName());
        sp1.getNumberOfTeamMembers();
        System.out.println(sp2.getName());
        sp2.getNumberOfTeamMembers();        
    }
}