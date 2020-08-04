private static boolean checkWin(char dot) {

        for (int i = 0; i < 3; i++)
            if ((field[i][0] == dot && field[i][1] == dot && field[i][2] == dot) ||
                    (field[0][i] == dot && field[1][i] == dot && field[2][i] == dot))
                return true;
            if ((field[0][0] == dot && field[1][1] == dot && field[2][2] == dot) ||
                    (field[0][2] == dot && field[1][1] == dot && field[2][0] == dot))
                return true;
            return false;
    }