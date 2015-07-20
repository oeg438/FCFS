import java.util.LinkedList;
import java.util.Queue;


public class a
{
    public static void main(String [] argv)
    {

        Queue<Node> mQueue = new LinkedList<>();
        
        Node a = new Node() ;

        a.start = "111";
        
        mQueue.add(a);
        mQueue.add(a);
        mQueue.add(a);
        mQueue.add(a);
        mQueue.add(a);
        mQueue.add(a);
        mQueue.add(a);
        
        while (mQueue.size() != 0)
        {
            Node node = mQueue.poll();
            
            System.out.print("size > " + mQueue.size() + " , start > " + node.start +"\n");
        }
    }
    
    
    static class Node
    {
        String start;
        String end;
        String title;
        String cpu;
        String content;
    }
}
