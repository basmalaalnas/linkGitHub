public class GameEntry {


    public static void main(String[] args) {
        GameEntry  oa1 = new GameEntry();
        GameEntry  ob1 = new GameEntry();
        GameEntry  oa2 = new GameEntry();
        GameEntry  ob2 = new GameEntry();
        GameEntry  oa3 = new GameEntry();
        GameEntry  ob3 = new GameEntry();
        GameEntry  oa4 = new GameEntry();
        GameEntry  ob4 = new GameEntry();
        GameEntry  oa5= new GameEntry();
        GameEntry  ob5 = new GameEntry();

        GameEntry[] A = new GameEntry[5] ;
        GameEntry[] B = new GameEntry[5] ;
        A[0]= oa1;
        B[0]= ob1;
        A[1]= oa1;
        B[1]= ob1;
        A[2]= oa1;
        B[2]= ob1;
        A[3]= oa1;
        B[3]= ob1;
        A[4]= oa1;
        B[4]= ob1;
        A =B;
        System.out.println(A[4]);
        System.out.println( B[4]);
    }
}
