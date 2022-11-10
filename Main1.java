 class Jug {
    static int flag=0;
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println("X is 4 litre jug  and y is 3 litre jug");
        state(0,0);
        System.out.println("EXIT");
    }


    static void state(int x,int y){
        System.out.println("capacity at X :"+x+"  capacity at  Y: "+y);
        if(flag==1){
            System.out.println("capacity at X : 2   "+"capacity at Y: 0");
            return;
        }

        if(y<3){
            state(x,++y);
        }
        else if(y==3){
            if(x==3){
                System.out.println("capacity at X : 4 "+"  "+ "capacity at Y: 2");
                x=0;
                y--;
                flag=1;
            }else{
                x=3;
                y=0;
            }
            state(x,y);
        }
    }
}