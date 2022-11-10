class State{
    int m;
    int c;
    int b;

    State()
    { // construct the start state (3,3,L)
        m = 3;
        c = 3;
        b = 0;
    }
    State(State s)
    { m = s.m;
        c = s.c;
        b = s.b;
    }
    boolean legal()

    { if(m < 0 || m > 3 || c<0 || c > 3) return false;
        if(3-m < 0 || 3-m > 3  || 3-c <0 || 3-c > 3) return false;
        if(m > 0 && c > m) return false;
        if(3-m >0 && 3-c > 3-m) return false;
        return true;
    }


    State move(int Mis, int Can)
    { State ans = new State(this);
        if(b == 0)
        { ans.m = m - Mis;
            ans.c = c - Can;
            ans.b = 1;
        }
        else
        { ans.m = m + Mis;
            ans.c = c + Can;
            ans.b = 0;
        }
        return ans;
    }

    void display()
        /* display this on the screen */
    { System.out.println(m + " " + c + " " + (b == 0 ? 'L' : 'R'));
    }
}


public class MissCanibal
{  static boolean already[][][] = new boolean[4][][];
    static State pred[][][] = new State[4][][];
    static int d[][][] = new int[4][][];
    static int infinity = 20000;

    static int go(State s)
    {  /* stopping condition is when s is the goal state */
        System.out.println("Present State " +  "(" +s.m +","+ s.c +","+ (s.b == 0 ? 'L' : 'R')+")");
        already[s.m][s.c][s.b] = true;
        if(s.m == 0 && s.c == 0 && s.b == 1)
        { d[0][0][1] = 0;
            return 0;  // Success!
        }
        // Now generate the neighbors of state s
        int i,j;
        int ans = infinity;
        int z;
        State t;
        // the bug in class was that the following line had <2 instead of <= 2
        for(i=0;i<=2;i++) for(j=0;j<=2;j++)
        { if(i+j == 0) continue;
            if(i+j > 2) continue;
            t = s.move(i,j);
            if(! t.legal()) continue;
            if(already[t.m][t.c][t.b])
                z = d[t.m][t.c][t.b];
            else
                z = go(t);
            if(z < ans)
            { ans = z;
                pred[t.m][t.c][t.b] = s;
            }
        }
        // Now,  ans is the shortest distance to goal from
        // any neighbor of s.
        //System.out.println("Returning " + ans + " from go");
        if(ans < infinity)
        { d[s.m][s.c][s.b] = ans + 1;
            return ans + 1;
        }
        else
            return infinity;
    }


    public static void main(String args[])
    {
        System.out.println("19MIS7056_Mehnaaz Tabasum....");
        System.out.println("----****------Cannibals and Missionaries----****------");
        System.out.println("L Boat is at left side..");
        System.out.println("R Boat is at Right side..");
        System.out.println("--------------------------");
        int i,j,k;
        for(i=0;i<4;i++)
        { already[i] = new boolean[4][];
            d[i] = new int[4][];
            pred[i] = new State[4][];
            for(j=0;j<4;j++)
            { already[i][j] = new boolean[2];
                d[i][j] = new int[2];
                pred[i][j] = new State[2];
                for(k=0;k<2;k++)
                { already[i][j][k] = false;
                    pred[i][j][k] = new State();
                    d[i][j][k] = infinity;
                }
            }
        }

        State start = new State();
        int ans = go(start);
        if(ans == infinity)
        { System.out.println("No solution.  You moron, you programmed it wrong.");

            return;
        }
        System.out.println();
        System.out.println("Hence Cannibals and Missionaries Successfully crossed the river:  ");
        System.out.println("It  takes  " + ans + "  crossings..");
        State q = new State();
        q.m = 0; q.c = 0; q.b = 1;  // goal state (0,0,R)
        State[] solution = new State[ans+1];
        solution[ans] = q;
        for(i=ans-1;i>=0;i--)
        { solution[i] = pred[q.m][q.c][q.b];
            q = solution[i];
        }
        // solution[0] better be (3,3,L)
        for(i=0;i<1;i++)
            solution[i].display();
        System.out.println();
    }
}







