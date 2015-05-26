class AlternateRunner {
    public static void main(String[] args) {
        Bitmap b = new Bitmap(new int[] {9, 9,0,9,9,0,0,0});
        System.out.println(b.toString());

        Bitmap a = new Bitmap(new int[] {9,9,9, 3, 12, 5, 4});
        System.out.println(a.toString());

        b.flipHorizontal();
        System.out.println(b.toString());

        b.flipVertical();
        System.out.println(b.toString());

        b.reverse();
        System.out.println(b.toString());
    }
}

