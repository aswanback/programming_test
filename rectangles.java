class Scratch {
    public static int[] rect(int x_tl, int y_tl, int x_br, int y_br){
        return new int[]{x_tl,y_tl,x_br,y_br};
    }

    public static boolean are_overlapping(int[] rect_1, int[] rect_2){
        return (rect_1[0] <= rect_2[2]) && (rect_1[2] >= rect_2[0]) && (rect_1[1] >= rect_2[2]) && (rect_1[3] <= rect_2[1]);
    }

    public static void main(String[] args) {
        int[] rect1 = rect(0,0,3,-4);
        int[] rect2 = rect(-2,0,-1,-3);
        System.out.print(are_overlapping(rect1,rect2));
    }
}