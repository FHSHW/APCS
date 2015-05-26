import java.util.Arrays;

class Bitmap {
    String[][] image = new String[10][10];

    Bitmap(int a[]) {
        populate(image);

        for (int i = 0; i < a.length - 1 && a.length % 2 == 0; i+= 2) {
            if (a[i] >= 0 && a[i] <= 9 && a[i+1] >= 0 && a[i + 1] <= 9)
                image[a[i]][a[i+1]] = "*";
            else {
                populate(image);
                break;
            }
        }
    }

    public void flipHorizontal() {
        for (int i = 0; i < image.length; i++) {
            String[] result = new String[image.length];
            for (int j = 0; j < image.length; j++) {
                result[image.length - 1 - j] = image[i][j];
            }
            image[i] = result;
        }
    }

    public void flipVertical() {
        String[][] result = new String[image.length][image.length];
        for (int i = 0; i < image.length; i++)
            result[image.length - 1 - i] = image[i];
        image = result;
    }

    public void reverse() {
        for (int i = 0; i < image.length; i++)
            for (int j = 0; j < image[i].length; j++)
              image[i][j] = (image[i][j] == "-") ? "*" : "-";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String[] i : image) {
            for (String p : i) {
                sb.append(p);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private void populate(String[][] a) {
        for (String[] i : image)
           Arrays.fill(i, "-");
    }
}

