void main(){
    int i = 5, j = 0;
    while (i-- > j) {
        System.out.print("* ");
        if (i == j){
            j++;
            i = 5;
            System.out.println();
        }
    }
}