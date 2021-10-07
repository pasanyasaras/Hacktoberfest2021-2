public class Pelindrome {
    Scanner input = new Scanner(System.in);
    
    void test()
    {
        String m_value="";
        String m_reverse="";
        
        System.out.println("Please enter a word");
        m_value=input.nextLine();
        
        for(int i=(m_value.length()-1); i>=0; i--)
        {
            m_reverse = m_reverse+m_value.charAt(i);
        }
        
        if(m_value.equals(m_reverse))
        {
            System.out.println("Pelidrome Word");
        }
        else
        {
            System.out.println("Not a Pelidrome Word");
        }
        //System.out.println(m_reverse);
    }
