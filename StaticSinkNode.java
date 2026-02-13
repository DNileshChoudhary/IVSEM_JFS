class SinkNodes
{
	public static void main(String args[])
	{
		int [][]adj = {{0,1,1,0,1},{0,0,0,1,0},{0,0,0,1,1},{0,0,0,0,0},{0,0,0,0,0}};
		int sinkCnt = 0 ;
		for(int i = 0 ; i<adj.length ; i++)
		{
			for(int j = 0 ; j<adj.length ; j++)
			{
				if(adj[i][j]!=0)	break;
				if(j==adj.length-1 && adj[i][j]==0)
				{
					sinkCnt++;
					System.out.println("Sink Node : "+(char)(65+i));
				}
			}
		}
		System.out.println("The Total SinkNodes are : "+sinkCnt);
	}
}