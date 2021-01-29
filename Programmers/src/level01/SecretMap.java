package level01;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map = new String[n];
        for (int i = 0; i < n; i++) {
            int binary = arr1[i] | arr2[i];
            setMap(map, i, binary);
        }
        return map;
    }

    public void setMap(String[] map, int row, int binary) {
        StringBuilder hint = new StringBuilder();
        while (binary != 0) {
            hint.append((binary % 2 == 0 ? " " : "#"));
            binary /= 2;
        }
        while (hint.length() != map.length)
            hint.append(" ");
        map[row] = hint.reverse().toString();
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        int n2 = 6;
        int[] arr3 = {46, 33, 33, 22, 31, 50};
        int[] arr4 = {27, 56, 19, 14, 14, 10};

        SecretMap secretMap = new SecretMap();
        for (String row : secretMap.solution(n, arr1, arr2))
            System.out.println(row);
        System.out.println();
        for (String row : secretMap.solution(n2, arr3, arr4))
            System.out.println(row);
        System.out.println();
    }
}
