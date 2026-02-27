import java.util.*;
public class DynamicCountEdges {
    public static void main(String args[])
	{
		int adj_matrix[][]={ {0,1,0,1,0},{1,0,1,1,0},{0,1,0,0,1},{1,1,0,0,1},
																{0,0,1,1,0}	};
		List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i<adj_matrix.length ; i++)
        {
            adj.add(new ArrayList<>());
            for(int j = 0 ; j<adj_matrix.length ; j++)
            {
                if(adj_matrix[i][j]==1)
                {
                    adj.get(i).add(j);
                }
            }
        }
        int edgeCount = 0;
        for (List<Integer> neighbors : adj) {
            edgeCount += neighbors.size();
        }
        System.out.println("No of edges in the graph = " + (edgeCount / 2));
        System.out.println("No of vertices in the graph = " + adj.size());
	}
}
