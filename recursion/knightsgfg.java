import java.util.*;
class Solution {
    ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        sc.close();
         Solution obj = new Solution(); // ✅ need an object to call non-static methods
        obj.knightTour(n);
        
         if (!obj.list.isEmpty()) 
            System.out.println("true");
        else
        System.out.println(false);
        
    }

    public ArrayList<ArrayList<Integer>> knightTour(int n) {
        // code here
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        
        int [][] board = new int [n][n];
        for (int[] row : board) Arrays.fill(row, -1);
        board[0][0]=0;
        temp.add(0);
        
        isValid(board, 0, 0, 1, this.list, temp);

        return this.list;
    }
    public boolean isValid(int[][] grid,int row,int col,int num,ArrayList<ArrayList<Integer>> list,
    ArrayList<Integer> temp)
    {
        int n=grid.length;
        int i,j;
        if(num == n*n)
        {
            list.add(new ArrayList<>(temp));
            return true;
        }
        
        i=row+1; //2R1D
        j=col+2;
        if(i<n && j<n && grid[i][j] == -1 )
        { 
            grid[i][j]=num;
            temp.add(num);
          if (isValid(grid, i, j, num + 1, list, temp)) return true;
           grid[i][j] = -1;
            temp.remove(temp.size() - 1);
        }
        i=row+1;//2L1D
        j=col-2;
        if(i<n && j>=0 && grid[i][j] == -1)
         { 
            grid[i][j]=num;
            temp.add(num);
          if (isValid(grid, i, j, num + 1, list, temp)) return true;
            grid[i][j] = -1;
            temp.remove(temp.size() - 1);
        }
        i=row-1;//2L1U
        j=col-2;
        if(i>=0 && j>=0 && grid[i][j] == -1)
          { 
            grid[i][j]=num;
            temp.add(num);
          if (isValid(grid, i, j, num + 1, list, temp)) return true;
            grid[i][j] = -1;
            temp.remove(temp.size() - 1);
        }
        i=row-1;//2R1U
        j=col+2;
        if(i>=0 && j<n && grid[i][j] == -1)
          { 
            grid[i][j]=num;
            temp.add(num);
          if (isValid(grid, i, j, num + 1, list, temp)) return true;
            grid[i][j] = -1;
            temp.remove(temp.size() - 1);
        }
          
        i = row - 2; //2U1R
        j = col + 1;
        if(i>=0 && j<n && grid[i][j] == -1)
          { 
            grid[i][j]=num;
            temp.add(num);
          if (isValid(grid, i, j, num + 1, list, temp)) return true;
            grid[i][j] = -1;
            temp.remove(temp.size() - 1);
        }
        i = row - 2; //2U1L
        j = col - 1;
        if(i>=0 && j>=0 && grid[i][j] == -1)
         { 
            grid[i][j]=num;
            temp.add(num);
          if (isValid(grid, i, j, num + 1, list, temp)) return true;
            grid[i][j] = -1;
            temp.remove(temp.size() - 1);
        }
        i = row + 2;//2D1R
        j = col + 1;
        if(i<n && j<n && grid[i][j] == -1) 
          { 
            grid[i][j]=num;
            temp.add(num);
          if (isValid(grid, i, j, num + 1, list, temp)) return true;
            grid[i][j] = -1;
            temp.remove(temp.size() - 1);
        }
        i = row + 2; //2D1L
        j = col - 1;
        if(i<n && j>=0 && grid[i][j] == -1) 
          { 
            grid[i][j]=num;
            temp.add(num);
          if (isValid(grid, i, j, num + 1, list, temp)) return true;
            grid[i][j] = -1;
            temp.remove(temp.size() - 1);
        }
        return false;
}
}