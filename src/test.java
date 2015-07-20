import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class test
{
    public static void main( String[] args ) throws IOException
    {
        
        File file = new File("data.orig");
        
        System.out.println(file.getAbsolutePath());

        FileReader fr = new FileReader("data.orig");
        
        BufferedReader br = new BufferedReader(fr);
        
        Queue<Process> mQueue = new LinkedList<>();
        
        int count = 0;
        
        while(br.ready())
        {
        
            String str = br.readLine();
            
            String[] arr = str.split(" ");
            
            Process data = new Process();
            
            data.start = Integer.parseInt(arr[0]);
            
            data.excute = Integer.parseInt(arr[1]);
            
            data.num = Integer.parseInt(arr[2]);
            
            data.title = Integer.parseInt(arr[3]);
            
            data.content = Integer.parseInt(arr[4]);
            
            if ( data.num == 0 && data.title != 0 || data.title != 1)
            {
                continue;
            }
            
            count ++;
            
            /// store data
        }
        
        System.out.println("count > " + count);
    }
    
    static class Node
    {
        String data;
        Node next;
    }
    
    static class Process
    {
        long start;
        long excute;
        int num;
        int title;
        int content;
    }
}
