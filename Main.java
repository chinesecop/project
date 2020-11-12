public class Main {

    public static void main(String[] args) throws MatrixExceptions {
        String string = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";

        try {
            String[][] twoDimensional = getStrings(string);
            System.out.println(Arrays.deepToString(twoDimensional));
            System.out.println(arrayToIntAndHalfOfSum(twoDimensional));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int arrayToIntAndHalfOfSum(String[][] twoDimensional) throws MatrixExceptions {
        int sum = 0;

        for (int i = 0; i < twoDimensional.length; i++) {
            for (int j = 0; j < twoDimensional.length; j++) {
                try {
                    sum += Integer.parseInt(twoDimensional[i][j]);
                } catch (NumberFormatException e) {
                    throw new MatrixExceptions("В одной из ячеек полученной матрицы не число!");
                }
            }
        }
        return sum / 2;
    }

    private static String[][] getStrings(String string) throws MatrixExceptions {

        String[] stringToArray = conversionToArray(string, "\n");
        String[][] twoDimensional = new String[5][4];
        int rows = twoDimensional.length;
        int columns = twoDimensional[0].length;

        if (rows == 4 && columns == 4) {
            for(int i = 0; i < stringToArray.length; i++){
                String[] x = conversionToArray(stringToArray[i], " ");
                for (int j = 0; j < x.length; j++) {
                    twoDimensional[i][j] = x[j];
                }
            } return twoDimensional;
        } else throw new MatrixExceptions("Размер матрицы не равен 4x4!");

    }

    private static String[] conversionToArray(String string, String string2){
        return string.split(string2);
    }
}
