import java.util.*;
public class SinkNodeDynamic {
    private static int sinkCnt(int v , List<List<Integer>> adj)
    {
        int sinkCnt = 0 ;
        for(int i = 0 ; i<v ; i++)
        {
            List<Integer> list = adj.get(i);
            if(list.size()==0)
            {
                sinkCnt++;
                System.out.println("Sink Node : "+(char)(65+i));
            }
        }
        return sinkCnt;
    }
    public static void main(String args[])
    {
        int v = 5 ;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i<v ; i++)
        {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(0).add(4);
        adj.get(1).add(3);
        adj.get(2).add(3);
        adj.get(2).add(4);
        int sinkCnt = sinkCnt(v,adj);
        System.out.println("The Total SinkNodes are : "+sinkCnt);
    }
}
