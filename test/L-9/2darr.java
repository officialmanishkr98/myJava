if(c%2==0) 
    {
        for(int r=0; r<tri_tatt.length; r++)
        {
            System.out.print(tri_tatt[r][c] +" ")
        }
    }
    else
    {
        for(int r=tri_tatt.length-1; r<=0; r--)
        {
            System.out.print(tri_tatt[r][c] +" ")
        }
    }
    System.out.println();