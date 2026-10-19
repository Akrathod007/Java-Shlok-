public class NestedLoop {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){//i->1->2
            for(j=1;j<=3;j++){//j->1->2->3
                System.out.println("i : "+i + " j : "+j);
            }
        }
    }
}
